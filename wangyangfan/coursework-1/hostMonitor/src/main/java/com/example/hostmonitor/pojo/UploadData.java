package com.example.hostmonitor.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 主机利用率采集接口输入
 */
@Data
@AllArgsConstructor
public class UploadData {
    private String metric;
    private String endpoint;
    private Long timestamp;
    private Long step;
    private double value;

}
