package com.example.kong.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 14:54:55
 */
@Data
public class ApplicationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 应用序号
	 */
	private String applicationid;
	/**
	 * 应用名称
	 */
	private String applicationname;
	/**
	 * 应用所属单位名称
	 */
	private String applicationaddress;
	/**
	 * 应用ID
	 */
	private Integer appid;
	/**
	 * 状态（0：通过，1：待审核，2：驳回）
	 */
	private Integer status;
	/**
	 * 逻辑删除字段
	 */
	private Integer deleted;
	/**
	 * 说明
	 */
	private String description;
	/**
	 * 创建时间
	 */
	private Date createdate;
	/**
	 * 更新时间
	 */
	private Date updatedate;

}
