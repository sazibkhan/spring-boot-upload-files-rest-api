package com.sazibeng.uploadfiles.controller;

import com.sazibeng.uploadfiles.payload.FileResource;
import com.sazibeng.uploadfiles.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;
    @Value("${project.image}")
    private String path;


    @PostMapping("/upload")
    public ResponseEntity<FileResource> fileUpload(@RequestParam("image") MultipartFile image){
        String fileName= null;
        try {
            fileName =fileService.uploadImage(path,image);
            }catch (IOException e){
                e.printStackTrace();
            return new ResponseEntity<>(new FileResource(fileName,"Image is not uploaded due to error on server !!"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    return new ResponseEntity<>(new FileResource(fileName,"Image is Successfully Uploaded !! "), HttpStatus.OK);
    }



}
