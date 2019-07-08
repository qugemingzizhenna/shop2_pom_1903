package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @user yzb
 * @date 2019-07-01 20:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable{
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String rolename;

    private String rolealias;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    private Integer status;
    @TableField(exist = false)
    private boolean checked;
}
