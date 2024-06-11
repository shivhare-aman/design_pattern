package com.chainOfResponsibilityImpl.chainOfResponsibility;

import java.util.Objects;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        var isValid = (Objects.equals(httpRequest.getUsername(), "admin") &&
                Objects.equals(httpRequest.getPassword(), "1234"));

        System.out.println("Authentication");
        return !isValid;
    }
}
