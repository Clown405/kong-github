package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.example.kong.entity.R;

import org.springframework.web.bind.annotation.*;

import io.renren.modules.generator.entity.ApplicationEntity;
import io.renren.modules.generator.service.ApplicationService;
import javax.annotation.Resource;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 14:54:55
 */
@RestController
@RequestMapping(value = "scy/application" ,  produces = "application/json; charset=utf-8")
@CrossOrigin
public class ApplicationController {


    @Resource
    ApplicationService applicationService;
    /**
     * 列表
     */
//    @GetMapping("/list")
//    public R list(){
//        List<ApplicationEntity> list = this.applicationService.list();
//        return R.ok().data("list", list);
//    }


    @PostMapping("/list/{pageNum}/{pageSize}")
    public R getList(@PathVariable(value = "pageNum") Integer pageNum ,@PathVariable(value = "pageSize") Integer pageSize , @RequestBody(required = false) ApplicationEntity application){
        PageHelper.startPage(pageNum , pageSize);
        List<ApplicationEntity> list = applicationService.getApplicationList(application);
        PageInfo<ApplicationEntity> applicationEntityPageInfo = new PageInfo<>(list);
        return R.ok().data("list" ,applicationEntityPageInfo);
    }
    /**
     * 信息
     */
    @RequestMapping("/info/{applicationid}")
    public R info(@PathVariable("applicationid") String applicationid){
		ApplicationEntity application = applicationService.getById(applicationid);

        return R.ok().data("application", application);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ApplicationEntity application){
        application.setDeleted(0);
		applicationService.save(application);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ApplicationEntity application){
		applicationService.updateById(application);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] applicationids){
		applicationService.removeByIds(Arrays.asList(applicationids));

        return R.ok();
    }

}
