package com.example.kong.service.impl;


import com.example.kong.entity.ApplicationEntity;
import com.example.kong.mapper.ApplicationMapper;
import com.example.kong.service.ApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Resource
    ApplicationMapper applicationMapper;

    @Override
    public List<ApplicationEntity> getList() {
        return applicationMapper.getList();
    }
}