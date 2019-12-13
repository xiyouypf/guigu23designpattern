package 行为型模式.中介者;
//具体的同事类
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm同事对象的时候,将自己放入到ConcreteMediator中
        mediator.register(name,this);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用中介者对象的getMessage
        this.getMediator().getMessage(stateChange,this.name);
    }
}
