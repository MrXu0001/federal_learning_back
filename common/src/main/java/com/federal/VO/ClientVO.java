package com.federal.VO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientVO {
    private String clientName;
    private String key;
    private String label;
    private String department;
}
