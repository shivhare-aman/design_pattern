package com.chainOfResponsibilityImpl.chainOfResponsibility;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        System.out.println("Logger");
        return false;
    }
}
