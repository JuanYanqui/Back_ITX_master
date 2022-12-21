package com.demo.itx.services;

import java.io.IOException;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {

/*    Logger logger = LoggerFactory.getLogger(ImageService.class);

    private String bucketName = "itx-storage";
    @Autowired
    private AmazonS3 s3Client;

    public String uploadFile(MultipartFile file, String folder) {
        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(file.getSize());
        try {
            s3Client.putObject(
                    new PutObjectRequest(bucketName, folder + "/" + fileName, file.getInputStream(), objectMetadata)
                            .withCannedAcl(CannedAccessControlList.PublicRead));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s3Client.getUrl(bucketName, folder + "/" + fileName).toString();
    }*/

}
