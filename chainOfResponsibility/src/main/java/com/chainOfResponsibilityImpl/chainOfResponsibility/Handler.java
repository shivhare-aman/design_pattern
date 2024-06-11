package com.chainOfResponsibilityImpl.chainOfResponsibility;

public abstract class Handler {
    private final Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest httpRequest) {
        if (doHandle(httpRequest)) {
            return;
        }

        if (next != null)
            next.handle(httpRequest);
    }

    public abstract boolean doHandle(HttpRequest httpRequest);
}
