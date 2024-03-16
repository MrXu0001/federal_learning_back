package com.federal_s.federal_server.VO;

import lombok.Data;

@Data
public class AsyncVO {
    private String taskId;
    private String severId;
    private String clientIds;
    private String methods;
    private Integer epochs;
}
