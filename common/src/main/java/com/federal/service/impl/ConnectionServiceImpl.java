package com.federal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.federal.mapper.ConnectionMapper;
import com.federal.model.Connection;
import com.federal.service.ConnectionService;
import org.springframework.stereotype.Service;

@Service
public class ConnectionServiceImpl extends ServiceImpl<ConnectionMapper, Connection> implements ConnectionService {

}
