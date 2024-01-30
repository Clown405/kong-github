package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
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
@TableName("upstreams")
public class UpstreamsEntity implements Serializable {
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
	private String name;
	/**
	 * $column.comments
	 */
	private String hashOn;
	/**
	 * $column.comments
	 */
	private String hashFallback;
	/**
	 * $column.comments
	 */
	private String hashOnHeader;
	/**
	 * $column.comments
	 */
	private String hashFallbackHeader;
	/**
	 * $column.comments
	 */
	private String hashOnCookie;
	/**
	 * $column.comments
	 */
	private String hashOnCookiePath;
	/**
	 * $column.comments
	 */
	private Integer slots;
	/**
	 * $column.comments
	 */
	private String healthchecks;
	/**
	 * $column.comments
	 */
	private Text tags;
	/**
	 * $column.comments
	 */
	private String algorithm;
	/**
	 * $column.comments
	 */
	private String hostHeader;
	/**
	 * $column.comments
	 */
	private String clientCertificateId;

	/**
	 * $column.comments
	 */
	private String wsId;

}
