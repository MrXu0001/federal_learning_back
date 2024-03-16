package com.federal.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("component")  // 组件展示表
public class Component {
    /**
     * 主键
     */
    @TableId(type = IdType.UUID)
    private String id;
    /**
     * 组件步骤
     */
    private String step;
    /**
     * 组件名称
     */
    private String name;
    /**
     * 组件提示信息
     */
    private String content;
}
