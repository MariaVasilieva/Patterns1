package org.example.chainOfResponsibility;

public class Manager extends Approver{

    public Manager(String name) {
        super(name,"Manager");
    }

    @Override
    public void approve(Request request) {
        System.out.println("Request approved by manager " + name);
    }

    @Override
    public boolean canApprove(Request request) {
        return request.getAmount()<=1000;
    }
}
