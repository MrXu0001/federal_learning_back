package com.federal_s.federal_server.VO;

import lombok.Data;

import java.util.List;

@Data
public class SendVO {
    private List<String> toUserIds;
    private String message;
}
