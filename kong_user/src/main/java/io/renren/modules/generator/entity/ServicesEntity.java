package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import javax.xml.soap.Text;

/**
 * ${comments}
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-01-23 11:21:21
 */
@Data
@TableName("services")
public class ServicesEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * $column.comments
	 */
	@TableId(type = IdType.UUID)
	private String id;
	/**
	 * $column.comments
	 */
	private Date createdAt;
	/**
	 * $column.comments
	 */
	private Date updatedAt;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private Long retries;
	/**
	 * $column.comments
	 */
	private String protocol;
	/**
	 * $column.comments
	 */
	private String host;
	/**
	 * $column.comments
	 */
	private Long port;
	/**
	 * $column.comments
	 */
	private String path;
	/**
	 * $column.comments
	 */
	private Long connectTimeout;
	/**
	 * $column.comments
	 */
	private Long writeTimeout;
	/**
	 * $column.comments
	 */
	private Long readTimeout;
	/**
	 * $column.comments
	 */
	private Text tags;
	/**
	 * $column.comments
	 */
	private String clientCertificateId;
	/**
	 * $column.comments
	 */
	private Bool tlsVerify;
	/**
	 * $column.comments
	 */
	private Integer tlsVerifyDepth;
	/**
	 * $column.comments
	 */
	private String caCertificates;
	/**
	 * $column.comments
	 */
	private String wsId;
	/**
	 * $column.comments
	 */
	private Bool enabled;

}
