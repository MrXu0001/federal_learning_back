package com.federal_c1.federal_client1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class VisualParams {
    private String analysis;
    private int n;
    private int n2;
    private int n3;
    private List<String> x1;
    private List<Integer> y1;
    private int r1;
    private int r2;
    private int r3;
    private int r21;
    private int r22;
    private int c1;
    private int c2;
    private List<String> columns;
    private List<Object> arr;
}
