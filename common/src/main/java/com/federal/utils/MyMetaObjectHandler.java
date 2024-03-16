package com.federal.utils;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        // 注意这里的gmtCreate要和Java对象字段名一致，不是和数据库表中字段的一致
        this.strictInsertFill(metaObject, "gmtCreate", Date::new, Date.class);
        this.strictInsertFill(metaObject, "gmtUpdate", Date::new, Date.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "gmtUpdate", Date::new, Date.class);
    }
}