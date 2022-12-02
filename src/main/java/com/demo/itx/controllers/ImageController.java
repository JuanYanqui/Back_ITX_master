package com.demo.itx.controllers;

import com.demo.itx.services.ImageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@CrossOrigin
public class ImageController {
    @Autowired
    private ImageService service;

   /*- @PostMapping(value="/upload-image")
    public ResponseEntity<String> uploadFile(@RequestParam(value = "file") MultipartFile file,@RequestParam String folder) {

        return new ResponseEntity<String>(service.uploadFile(file, folder), HttpStatus.CREATED);
    }*/
}
