package 行为型模式.备忘录.theory;

import java.util.ArrayList;
import java.util.List;

//守护者对象,负责保存多个备忘录对象,使用集合管理,提高效率
public class Caretaker {
    //集合中会有很多memento备忘录对象
    private List<Memento> mementoList=new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    //获取到第index个Originator 的备忘录对象(即保存的对象)
    public Memento get(int index){
        return mementoList.get(index);
    }
}
