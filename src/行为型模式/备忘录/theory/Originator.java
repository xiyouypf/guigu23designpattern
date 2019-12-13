package 行为型模式.备忘录.theory;
//需要保存状态信息的对象
public class Originator {
    private String state;//状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写一个方法,可以保存一个状态对象的Memento
    //因此编写一个方法,返回Memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    //通过备忘录对象,恢复状态
    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }
}
