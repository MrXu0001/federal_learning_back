package com.federal_c1.federal_client1;

import com.federal_c1.federal_client1.model.VisualParams;

public class HelloWorldApp {
 
    public static void main(String[] args) throws Exception {
        int port = 8010;
        FederalClient client = new FederalClient("localhost", port);
        VisualParams visualParams = client.dataInfo("", "");
//        String reply = client.localTrain("","");
        System.out.println(visualParams);

        // 关闭服务与通道，否则会报错
//        server.shutdown();
        client.shutdown();
    }
}