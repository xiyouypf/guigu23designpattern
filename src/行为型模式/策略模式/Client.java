package 行为型模式.策略模式;

public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        //动态改变某个对象的行为,北京鸭不能飞
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.fly();
    }
}
