package 结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

//University 就是 Composite,可以管理College
public class University extends OrganizationComponent {
    //存放的是College
    List <OrganizationComponent> organizationComponents=new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    //重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }
    //重写remove方法
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

    //print方法,就是输出University 包含的学院
    @Override
    public void print() {
        System.out.println("------------"+getName()+"-------------");
        for(OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }
}
