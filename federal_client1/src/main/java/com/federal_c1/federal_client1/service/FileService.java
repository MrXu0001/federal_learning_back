package com.federal_c1.federal_client1.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    //文件上传cos
    String upload(MultipartFile file);

}
