package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.generator.mapper.TargetsMapper;
import org.springframework.stereotype.Service;

import io.renren.modules.generator.entity.TargetsEntity;
import io.renren.modules.generator.service.TargetsService;


@Service("targetsService")
public class TargetsServiceImpl extends ServiceImpl<TargetsMapper, TargetsEntity> implements TargetsService {



}