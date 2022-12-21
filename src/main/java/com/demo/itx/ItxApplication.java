package com.demo.itx;

import com.demo.itx.config.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ItxApplication {
	public static void main(String[] args) {
		SpringApplication.run(ItxApplication.class, args);
		//FileUtils.createDirectory("uploads");

	}
}