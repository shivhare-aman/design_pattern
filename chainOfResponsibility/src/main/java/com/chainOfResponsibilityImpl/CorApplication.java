package com.chainOfResponsibilityImpl;

import com.chainOfResponsibilityImpl.chainOfResponsibility.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorApplication.class, args);

		// authenticator --> logger --> compressor

		var compressor = new Compressor(null);
		var logger = new Logger(compressor);
		var authenticator = new Authenticator(logger);
		var server = new WebServer(authenticator);
		server.handle(new HttpRequest("admin","1234"));
	}

}
