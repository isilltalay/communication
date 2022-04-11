package com.example.communication;

import com.example.communication.entity.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

@SpringBootApplication
public class CommunicationApplication {

	public static void main(String[] args) {

		SpringApplication.run(CommunicationApplication.class, args);
	}

}
