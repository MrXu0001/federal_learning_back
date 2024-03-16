package com.federal_s.federal_server.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class Async {

    /**
     * 主键Id
     */
    @TableId(type = IdType.UUID)
    private String Id;

    /**
     * 服务端ID
     */
    private String serverId;

    /**
     * 客户端ID
     */
    private String clientId;

    /**
     * 任务的ID
     */
    private String taskId;

    /**
     * 同步的方法
     */
    private String methods;

    /**
     * 聚合轮次
     */
    private Integer epochs;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtUpdate;
}
