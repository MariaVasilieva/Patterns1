package org.example.chainOfResponsibility;

public class Director extends Approver{
    public Director(String name) {
        super(name,"Director");
    }
    @Override
    public void approve(Request request) {
        System.out.println("Director approved the request. Director "+ name);
    }

    @Override
    public boolean canApprove(Request request) {
        return request.getAmount()<=10000;
    }
}
