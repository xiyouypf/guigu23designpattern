package 行为型模式.备忘录.game;

import java.util.List;
import java.util.Map;

//守护者对象,保存游戏角色的状态
public class Caretaker {
    //如果只保存一次
    private Memento memento;
    //对GameRole 保存多次
    //private List<Memento> mementos;
    //对多个游戏角色保存多个状态
    //private Map<String,List<Memento>> rolesMementos;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
