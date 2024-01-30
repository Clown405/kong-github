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
@TableName("targets")
public class TargetsEntity implements Serializable {
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
	private String upstreamId;
	/**
	 * $column.comments
	 */
	private String target;
	/**
	 * $column.comments
	 */
	private Integer weight;
	/**
	 * $column.comments
	 */
	private Text tags;
	/**
	 * $column.comments
	 */
	private String wsId;

}
