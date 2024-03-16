package com.federal_s.federal_server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.federal_s.federal_server.mapper.AsyncMapper;
import com.federal_s.federal_server.model.Async;
import com.federal_s.federal_server.service.AsyncService;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl extends ServiceImpl<AsyncMapper, Async> implements AsyncService {
}
