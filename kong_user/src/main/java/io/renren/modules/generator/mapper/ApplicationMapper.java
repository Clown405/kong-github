package io.renren.modules.generator.mapper;

import io.renren.modules.generator.entity.ApplicationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 14:54:55
 */
@Mapper
public interface ApplicationMapper extends BaseMapper<ApplicationEntity> {

    List<ApplicationEntity> getApplicationList(ApplicationEntity applicationEntity);
}
