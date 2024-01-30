package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.generator.mapper.ServicesMapper;
import org.springframework.stereotype.Service;

import io.renren.modules.generator.entity.ServicesEntity;
import io.renren.modules.generator.service.ServicesService;


@Service("servicesService")
public class ServicesServiceImpl extends ServiceImpl<ServicesMapper, ServicesEntity> implements ServicesService {


}