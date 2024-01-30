package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;


/**
 * ${comments}
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 11:21:21
 */
@Data
@TableName("routes")
public class RoutesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId(type = IdType.UUID)
	private String id;
	private List<String> paths;
	private List<String> methods;
	private Object sources;
	private Object destinations;
	private Object headers;
	private Object hosts;
	private List<String> protocols;
	private String name;
	private String path_handling;
	private int regex_priority;
	private long updated_at;
	private boolean request_buffering;
	private boolean response_buffering;
	private boolean strip_path;
	private long created_at;
	private Service service;
	private int https_redirect_status_code;
	private boolean preserve_host;
	private Object snis;
	private Object tags;

	@Data
	class Service{
		private String id;
	}
}
