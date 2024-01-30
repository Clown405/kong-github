package com.example.kong.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 
 * </p>
 *
 * @author gqq
 * @since 2023-03-14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User  {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String sex;

    private Integer uTimes;

    private String pwd;
    private String code;

    private String uuid;

    private String status;

    private String role;



    private Date createTime;

    private Date updateTime;


    private Integer version;


    private Integer isDeleted;

    /** 请求参数 */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, Object> params;

    public Map<String, Object> getParams()
    {
        if (params == null)
        {
            params = new HashMap<>();
        }
        return params;
    }

    public void setParams(Map<String, Object> params)
    {
        this.params = params;
    }
}
