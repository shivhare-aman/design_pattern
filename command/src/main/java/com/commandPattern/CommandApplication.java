package com.commandPattern;

import com.commandPattern.command.AddCustomerCommand;
import com.commandPattern.command.CustomerService;
import com.commandPattern.command.fx.Button;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandApplication {

	public static void main(String[] args) {
		var service = new CustomerService();
		var command = new AddCustomerCommand(service);
		var button = new Button(command);
		button.click();
	}

}
