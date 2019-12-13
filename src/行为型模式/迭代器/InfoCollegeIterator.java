package 行为型模式.迭代器;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    List<Department> departments; //信息工程学院是以List方式存放系
    int index=-1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index>=departments.size()-1){
            return false;
        }else{
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
