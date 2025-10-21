package org.example.chainOfResponsibility;

public abstract class Approver {
    protected String name;
    protected String positionInCompany;
    protected Approver nextApprover;

    public Approver(String name, String positionInCompany) {
        this.name = name;
        this.positionInCompany = positionInCompany;
    }
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }
    public void processRequest(Request request) {
        if(canApprove(request)){
            approve(request);
        }
        else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
        else {
            System.out.println("Approver " + name + " not approved yet");
        }
    }
    public abstract void approve(Request request);
    public abstract boolean canApprove(Request request);

}
