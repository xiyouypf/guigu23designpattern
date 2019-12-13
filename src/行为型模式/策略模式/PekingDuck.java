package 行为型模式.策略模式;

public class PekingDuck extends Duck {
    public PekingDuck() {
        flyBehavior=new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

}
