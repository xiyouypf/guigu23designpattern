package 行为型模式.备忘录.theory;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();

        originator.setState("状态#1 攻击力100");
        //保存了当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#2 攻击力80");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#3 攻击力50");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前的状态是="+originator.getState());
        //希望恢复到状态#1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("当前的状态是="+originator.getState());

    }
}
