package com.sazibeng.uploadfiles.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.sazibeng.uploadfiles.service.FileService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
@Service
public class FileServiceImpl implements FileService {
    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        //File Name
        String name=file.getOriginalFilename();

        // Filepath
        String filePath=path+ File.separator+name;

        //Create folder if not created
        File f=new File(path);
         if(!f.exists()){
             f.mkdir();
         }
        //file copy
        Files.copy(file.getInputStream(), Paths.get(filePath));



        return name;
    }
}
