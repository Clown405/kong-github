package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.generator.mapper.UpstreamsMapper;
import org.springframework.stereotype.Service;
import io.renren.modules.generator.entity.UpstreamsEntity;
import io.renren.modules.generator.service.UpstreamsService;


@Service("upstreamsService")
public class UpstreamsServiceImpl extends ServiceImpl<UpstreamsMapper, UpstreamsEntity> implements UpstreamsService {


}