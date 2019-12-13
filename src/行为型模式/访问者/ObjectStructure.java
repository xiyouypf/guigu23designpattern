package 行为型模式.访问者;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons=new LinkedList<>();

    //添加到list
    public void attach(Person person){
        persons.add(person);
    }

    //移除
    public void detach(Person person){
        persons.remove(person);
    }

    //显示测评情况
    public void display(Action action){
        for(Person person:persons){
            person.accept(action);
        }
    }
}
