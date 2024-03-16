package com.federal_c1.federal_client1;
 
import com.federal_c1.federal_client1.grpc.ArithmeticServerGrpc;

import com.federal_c1.federal_client1.grpc.Request;
import com.federal_c1.federal_client1.grpc.Response;
import com.federal_c1.federal_client1.model.VisualParams;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 */
public class FederalClient {

    private final ArithmeticServerGrpc.ArithmeticServerBlockingStub blockingStub;
    private static ManagedChannel managedChannel = null;
   /**
    * @param host gRPC服务的主机名
    * @param port gRPC服务的端口
    */
    public FederalClient(String host, int port) {
        managedChannel = ManagedChannelBuilder.forAddress(host, port)
              // 使用非安全机制传输
                .usePlaintext()
                .build();

        blockingStub = ArithmeticServerGrpc.newBlockingStub(managedChannel);
    }

    public VisualParams dataInfo(String url, String type) {
        Request request = Request.newBuilder()
                .setUrl(url)
                .setType(type)
                .build();
        Response resp = blockingStub.dataInfo(request);
        List<Object> arr=new ArrayList<>();
        for (Response.Arr num : resp.getArrList()) {
            arr.add(num.getValuesList());
        }
        VisualParams visualParams = new VisualParams(resp.getDatainfoRet(), resp.getN(), resp.getN2(), resp.getN3(), resp.getX1List(),
                resp.getY1List(), resp.getR1(), resp.getR2(), resp.getR3(), resp.getR21(),
                resp.getR22(), resp.getC1(), resp.getC2(), resp.getColumnsList(), arr);
        return visualParams;
    }

    public String localTrain(String idString, String data_url) {
        Request request = Request.newBuilder()
                .setType(idString)
                .setUrl(data_url)
                .build();
        Response resp = blockingStub.localTrain(request);

        return resp.getDatainfoRet();
    }

    
	public void shutdown() {
		managedChannel.shutdown();
	}
}
