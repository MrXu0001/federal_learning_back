package com.federal.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("connection")
public class Connection {

    /**
     * 主键Id
     */
    @TableId(type = IdType.UUID)
    private String Id;

    /**
     * 连接用户Id
     */
    private String userId;

    /**
     * 服务端用户Id
     */
    private String serverId;
    /**
     * 服务器IP地址
     */
    private String ip;

    /**
     * 客户端连接名称
     */
    private String clientName;

    /**
     * 客户端部门
     */
    private String department;

    /**
     * 确定与否，0还未确认，1同意，2不同意
     */
    private String confirm;

    /**
     * 逻辑删除,1代表已删除，0代表未删除
     */
    @TableLogic
    private Integer deleted;

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
