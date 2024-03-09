package com.sazibeng.uploadfiles.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.Serial;


public interface FileService {


    String  uploadImage(String path, MultipartFile file) throws IOException;




}
