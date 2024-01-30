package com.example.kong.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.kong.entity.ApplicationEntity;

import java.util.List;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 14:54:55
 */

public interface ApplicationMapper extends BaseMapper<ApplicationEntity> {

    List<ApplicationEntity> getList();

}
