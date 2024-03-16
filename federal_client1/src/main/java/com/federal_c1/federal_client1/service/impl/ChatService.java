package com.federal_c1.federal_client1.service.impl;

import org.json.JSONObject;
import com.federal_c1.federal_client1.cli.OkHttpCli;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class ChatService {
    public static final String API_KEY = "6521PmCXVvOyaF1a4blNUarR";
    public static final String SECRET_KEY = "COmdyswfjMXtU2OuEgpjfvpW5F0GO6ep";
    public String Access_Token = null;

    @Autowired
    OkHttpCli okHttpCli;

    //获取Access_Token
    public void getAccess_Token() throws IOException {
        String url = "https://aip.baidubce.com/oauth/2.0/token";
        Map<String, String> params = new HashMap<>();
        params.put("grant_type", "client_credentials");
        params.put("client_id", API_KEY);
        params.put("client_secret", SECRET_KEY);
        String a = okHttpCli.doPost(url, params);
        this.Access_Token = new JSONObject(a).getString("access_token");
    }

    //获得信息
    public String getMessage(String msg, String access_Token) throws IOException {
        System.out.println("msg:" + msg);
        String url = "https://aip.baidubce.com/rpc/2.0/ai_custom/v1/wenxinworkshop/chat/completions?access_token=" + access_Token;
        String json = "{\"messages\":[{\"role\":\"user\",\"content\":\"" + msg + "\"}]}";
        String message = okHttpCli.doPostJson(url, json);
        return new JSONObject(message).getString("result");
    }


}
