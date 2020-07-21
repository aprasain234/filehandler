package com.ashishprasain;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ashishprasain.controller.FileUploadController;

@SpringBootApplication
@ComponentScan({"com.ashishprasain", "controller"})
public class FileUploaderApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FileUploaderApplication.class, args);
	}

}
