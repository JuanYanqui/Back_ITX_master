package com.demo.itx.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {
   
    //private String accessKey="AKIASW44TNEFKRA65KQH";
    // private String accessKey="AKIAX6FP75FFGMTEMUPT";

   
    //private String accessSecret = "75x4f9NpcXk3z3o9ZhDktwxs+b3tgOA2XSqXaJiG";
    // private String accessSecret = "YgJBjOLz9NMDMmxiPSNv0xZ0Clbj87gfPFICJxSb";

    //private String region = "us-west-1";
    // private String region = "us-east-1";
    
   /* @Bean
    public AmazonS3 s3Client() {
        AWSCredentials credentials = new BasicAWSCredentials(accessKey, accessSecret);
        return AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(region).build();
    }*/
}