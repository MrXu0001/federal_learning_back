package com.federal.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.federal.mapper.ComponentMapper;
import com.federal.model.Component;
import com.federal.service.ComponentService;
import org.springframework.stereotype.Service;

@Service
public class ComponentServiceImpl extends ServiceImpl<ComponentMapper, Component> implements ComponentService {
}
