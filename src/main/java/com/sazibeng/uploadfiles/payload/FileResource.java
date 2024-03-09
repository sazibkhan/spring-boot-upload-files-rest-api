package com.sazibeng.uploadfiles.payload;

import org.springframework.http.HttpStatusCode;

public class FileResource {
   private String fileName;
    private String massage;

    public FileResource() {
    }

    public FileResource(String fileName, String massage) {
        this.fileName = fileName;
        this.massage = massage;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
