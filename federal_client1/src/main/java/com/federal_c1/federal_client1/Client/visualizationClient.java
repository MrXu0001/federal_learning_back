package com.federal_c1.federal_client1.Client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.test.Reply;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class visualizationClient {
    private static final Logger logger = Logger.getLogger(visualizationClient.class.getName());
    private final ManagedChannel channel;
    private final io.grpc.examples.test.VisualizeGrpc.VisualizeBlockingStub blockingStub;

    /**
     * Construct client connecting to HelloWorld server at {@code host:port}.
     */
    public visualizationClient(String host, int port) {

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = io.grpc.examples.test.VisualizeGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * Say hello to server.
     */
    public Map greet(String url) {
        logger.info( url );
        io.grpc.examples.test.Request request = io.grpc.examples.test.Request.newBuilder()
                .setDataUrl(url)
                .build();
        io.grpc.examples.test.Reply response;
        try {
            response = blockingStub.urlVisualization(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }
        Map params=new HashMap();
        params.put("n",response.getN()          );
        params.put("n2",response.getN2()          );
        params.put("n3",response.getN3()          );
        params.put("x1",response.getX1(1)          );
        params.put("y1",response.getY1(1)          );
        params.put("r1",response.getR1()          );
        params.put("r2",response.getR2()          );
        params.put("r3",response.getR3()          );
        params.put("r21",response.getR21()          );
        params.put("r22",response.getR22()          );
        params.put("c1",response.getC1()          );
        params.put("c2",response.getC2()          );
        params.put("columns",response.getColumns(1)          );
//        params.put("arr",response.getArr(1)          );
//        System.out.println(response.getArrList());
        for (Reply.Arr num : response.getArrList()) {
            System.out.println(num.getValuesList());
        }
        System.out.println(params);
        return params;
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting.
     */
    public static void main(String[] args) throws Exception {
        visualizationClient client = new visualizationClient("127.0.0.1", 50051);
        try {
            String data = "C:\\works\\pycharmProject\\pythonProject1\\Friday-WorkingHours-Afternoon-DDos.pcap_ISCX55.csv";
            if (args.length > 0) {
                data = args[0];
            }
            client.greet(data);
        } finally {
            client.shutdown();
        }
    }
}
