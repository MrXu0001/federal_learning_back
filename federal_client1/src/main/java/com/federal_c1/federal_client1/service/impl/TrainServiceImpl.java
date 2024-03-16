package com.federal_c1.federal_client1.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.federal_c1.federal_client1.mapper.TrainMapper;
import com.federal_c1.federal_client1.model.Train;
import com.federal_c1.federal_client1.service.TrainService;
import org.springframework.stereotype.Service;

@Service
public class TrainServiceImpl extends ServiceImpl<TrainMapper, Train> implements TrainService {
}
