package 行为型模式.迭代器;

import java.util.Iterator;

public interface College {
    public String getName();

    //增加系的方法
    public void addDepartment(String name,String desc);

    //返回一个迭代器,遍历
    public Iterator createIterator();
}
