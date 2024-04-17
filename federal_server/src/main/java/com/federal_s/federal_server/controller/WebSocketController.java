package com.federal_s.federal_server.controller;

import com.federal_s.federal_server.VO.SendVO;
import com.federal_s.federal_server.config.WebSocketServer;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import com.federal.utils.R;


@RestController
@RequestMapping("/Server")
@CrossOrigin
public class WebSocketController {

    @PostMapping("/pushToGroup")
    public R pushToGroup(@RequestBody SendVO sendVO) {  // 发给指定群体
        for (String toUserId : sendVO.getToUserIds()) {
            try {
                WebSocketServer.sendInfo(sendVO.getMessage(), toUserId);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return R.ok("消息发送成功");
    }

    @PostMapping("/push/{toUserId}")  // 发送消息给指定用户
    public R pushToOne(@RequestBody SendVO sendVO, @PathVariable String toUserId) throws IOException {
        WebSocketServer.sendInfo(sendVO.getMessage(),toUserId);
        return R.ok("消息发送成功");
    }

    @PostMapping("/push/all")
    public R pushToAll(@RequestBody String message) {  // 发给所有人
        WebSocketServer.sendAll(message);
        return R.ok("消息发送成功");
    }

    @PostMapping("/connect")
    public R connect() {
        return R.ok("连接成功");
    }
}