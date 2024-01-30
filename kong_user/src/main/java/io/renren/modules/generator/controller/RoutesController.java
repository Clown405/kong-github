package io.renren.modules.generator.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.kong.entity.R;
import com.example.kong.utils.HttpUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.renren.modules.generator.entity.ApplicationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.generator.entity.RoutesEntity;
import io.renren.modules.generator.service.RoutesService;



/**
 * ${comments}
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 11:21:21
 */
@RestController
@RequestMapping("scy/routes")
@CrossOrigin
public class RoutesController {
    @Autowired
    private RoutesService routesService;

    /**
     * 列表
     */
    @PostMapping("/list/{pageNum}/{pageSize}")
    public R getList(@PathVariable(value = "pageNum") Integer pageNum ,@PathVariable(value = "pageSize") Integer pageSize , @RequestBody(required = false) RoutesEntity routesEntity){
        String response = "";
        try {
            response = HttpUtil.doGet("http://47.108.206.110:8001/routes");
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.parseObject(response);
        String routesList = jsonObject.get("data").toString();
        PageHelper.startPage(pageNum , pageSize);
        List<RoutesEntity> routesEntities = JSONObject.parseArray(String.valueOf(JSON.parse(routesList)), RoutesEntity.class);
        PageInfo<RoutesEntity> routesEntityPageInfor = new PageInfo<>(routesEntities);
        return R.ok().data("list", routesEntityPageInfor);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		RoutesEntity routes = routesService.getById(id);

        return R.ok().data("routes", routes);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RoutesEntity routes){
		routesService.save(routes);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RoutesEntity routes){
		routesService.updateById(routes);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		routesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
