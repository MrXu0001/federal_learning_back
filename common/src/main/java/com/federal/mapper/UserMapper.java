package com.federal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.federal.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
