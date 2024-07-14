package com.commandPattern.command;

import com.commandPattern.command.fx.Command;

public class AddCustomerCommand implements Command {

    private final CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }
    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
