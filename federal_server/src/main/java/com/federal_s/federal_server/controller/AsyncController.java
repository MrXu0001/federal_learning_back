package com.federal_s.federal_server.controller;

import com.federal.utils.R;
import com.federal_s.federal_server.VO.AsyncVO;
import com.federal_s.federal_server.config.WebSocketServer;
import com.federal_s.federal_server.model.Async;
import com.federal_s.federal_server.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/async")
@CrossOrigin
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @PostMapping("/addAsync")
    public R addAsync(@RequestBody AsyncVO asyncVO) throws IOException {
        Async async = new Async();
        async.setTaskId(asyncVO.getTaskId());
        async.setClientId(asyncVO.getClientIds());
        async.setMethods(asyncVO.getMethods());
        async.setServerId(asyncVO.getSeverId());
        async.setEpochs(asyncVO.getEpochs());
        asyncService.save(async);
        String[] clientsArray = async.getClientId().split(",");
        return R.ok();
    }

}
