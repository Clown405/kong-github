package io.renren.modules.generator.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.modules.generator.entity.ApplicationEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 14:54:55
 */
public interface ApplicationService extends IService<ApplicationEntity> {

    List<ApplicationEntity> getApplicationList(ApplicationEntity applicationEntity);
}

