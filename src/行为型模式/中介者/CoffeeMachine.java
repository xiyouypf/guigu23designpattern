package 行为型模式.中介者;

public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void startCoffee(){
        System.out.println("it's time to startCoffee");
    }

    public void finishCoffee(){
        System.out.println("after 5 minutes");
        System.out.println("coffee is ok");
        sendMessage(0);
    }
}
