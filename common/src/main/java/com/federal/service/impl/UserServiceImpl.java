package com.federal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.federal.mapper.UserMapper;
import com.federal.model.User;
import com.federal.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {
}
