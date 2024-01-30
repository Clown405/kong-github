package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.generator.mapper.ApplicationMapper;
import org.springframework.stereotype.Service;

import io.renren.modules.generator.entity.ApplicationEntity;
import io.renren.modules.generator.service.ApplicationService;

import javax.annotation.Resource;
import java.util.List;


@Service("applicationService")
public class ApplicationServiceImpl extends ServiceImpl<ApplicationMapper, ApplicationEntity> implements ApplicationService {

    @Resource
    ApplicationMapper applicationMapper;

    @Override
    public List<ApplicationEntity> getApplicationList(ApplicationEntity applicationEntity) {
        return applicationMapper.getApplicationList(applicationEntity);
    }
}