package com.example.kong.controller;


import com.example.kong.common.R;

import com.example.kong.entity.ApplicationEntity;
import com.example.kong.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

;


/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 14:54:55
 */
@RestController
@RequestMapping("scy/application")
@CrossOrigin
public class ApplicationController {


    @Resource
    ApplicationService applicationService;
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(){
        List<ApplicationEntity> list = applicationService.getList();
        return R.ok().data("page", list);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{applicationid}")
    public R info(@PathVariable("applicationid") String applicationid){
		//ApplicationEntity application = applicationService.getById(applicationid);

        return R.ok().data("application", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ApplicationEntity application){
		//applicationService.save(application);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ApplicationEntity application){
		//applicationService.updateById(application);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] applicationids){
		//applicationService.removeByIds(Arrays.asList(applicationids));

        return R.ok();
    }

}
