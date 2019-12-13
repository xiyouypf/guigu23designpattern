package 行为型模式.迭代器;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    //这里我们需要知道Department是以怎样的方式存放==>数组
    Department[] departments;
    int position;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(position>=departments.length||departments[position]==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position++];
        return department;
    }

    //删除的方法暂时不需要,默认空实现
    @Override
    public void remove() {

    }
}
