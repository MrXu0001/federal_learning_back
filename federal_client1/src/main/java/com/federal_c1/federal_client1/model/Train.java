package com.federal_c1.federal_client1.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("train")  // 训练流程表
public class Train implements Serializable {
    private static final long serialVersionUID = -40356785423831231L;

    /**
     * 主键
     */
    @TableId(type = IdType.UUID)
    private String id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 数据集名称
     */
    private String dataName;
    /**
     * 数据地址
     */
    private String dataUrl;
    /**
     * 数据地址
     */
    private String preprocessData;
    /**
     * 平台数据分析
     */
    private String dataAnalysis;
    /**
     * 训练流程的id
     */
    private String method;
    /**
     * 当前训练流程训练出来的model的url
     */
    private String modelUrl;
    /**
     * 当前训练流程训练的结果
     */
    private String result;
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
