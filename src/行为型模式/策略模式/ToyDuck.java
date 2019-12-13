package 行为型模式.策略模式;

public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior=new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
