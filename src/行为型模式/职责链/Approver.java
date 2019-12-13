package 行为型模式.职责链;

public abstract class Approver {
    Approver approver;//下一个处理着
    String name;//名字

    public Approver(String name) {
        this.name = name;
    }

    //下一个处理着
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求的方法,得到一个请求,处理是子类完成
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
