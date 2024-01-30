package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.kong.entity.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.ServicesEntity;
import io.renren.modules.generator.service.ServicesService;



/**
 * ${comments}
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 11:21:21
 */
@RestController
@RequestMapping("generator/services")
public class ServicesController {
    @Autowired
    private ServicesService servicesService;

    /**
     * 列表
     */
    @RequestMapping("/list")

    public R list(@RequestParam Map<String, Object> params){

        return R.ok().data("page", null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		ServicesEntity services = servicesService.getById(id);

        return R.ok().data("services", services);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ServicesEntity services){
		servicesService.save(services);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ServicesEntity services){
		servicesService.updateById(services);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		servicesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
