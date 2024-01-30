package io.renren.modules.generator.service.impl;

import io.renren.modules.generator.mapper.RoutesMapper;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.generator.entity.RoutesEntity;
import io.renren.modules.generator.service.RoutesService;


@Service("routesService")
public class RoutesServiceImpl extends ServiceImpl<RoutesMapper, RoutesEntity> implements RoutesService {



}