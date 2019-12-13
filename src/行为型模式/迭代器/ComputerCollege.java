package 行为型模式.迭代器;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int numberOfDepartment=0;//保存当前对象的个数

    public ComputerCollege() {
        departments=new Department[5];
        addDepartment("java专业","java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[numberOfDepartment++]=new Department(name,desc);
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
