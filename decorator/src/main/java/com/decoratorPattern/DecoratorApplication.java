package com.decoratorPattern;

import com.decoratorPattern.decorator.CloudStream;
import com.decoratorPattern.decorator.CompressedCloudStream;
import com.decoratorPattern.decorator.EncryptedCloudStream;
import com.decoratorPattern.decorator.Stream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DecoratorApplication.class, args);
		storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
	}

	public static void storeCreditCard(Stream stream) {
		stream.write("1234-1234-1234-1234");
	}

}
