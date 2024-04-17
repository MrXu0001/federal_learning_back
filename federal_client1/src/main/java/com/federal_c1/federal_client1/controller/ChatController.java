package com.federal_c1.federal_client1.controller;


import com.alibaba.fastjson.JSONObject;
import com.federal_c1.federal_client1.utils.R;
import com.federal_c1.federal_client1.service.impl.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/chat")
@CrossOrigin
public class ChatController {
    @Autowired
    private ChatService chatService;

    @PostMapping("/message")
    @ResponseBody
    public R chat(@RequestBody String object) throws IOException {
        long start_time = 0;
        JSONObject parse = JSONObject.parseObject(object);
        String message = parse.getString("message");

        long now_time = System.currentTimeMillis();
        if (chatService.Access_Token == null) {
            chatService.getAccess_Token();
        }
        if ((now_time - start_time) / 60000 > 10) {
            chatService.getAccess_Token();
            start_time = now_time;
        }
        String reply = chatService.getMessage(message, chatService.Access_Token);
        return R.ok().put("reply", reply);
    }
}
