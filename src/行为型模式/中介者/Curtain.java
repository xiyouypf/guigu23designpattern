package 行为型模式.中介者;

public class Curtain extends Colleague {

    public Curtain(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void upCurtain(){
        System.out.println("i am holding up curtain");
    }
}
