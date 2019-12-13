package 结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    //存放的是department
    List<OrganizationComponent> organizationComponents=new ArrayList<>();
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getDes() {
        return super.getDes();
    }
    @Override
    public void print() {
        System.out.println("------------"+getName()+"-------------");
        for (OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }
}
