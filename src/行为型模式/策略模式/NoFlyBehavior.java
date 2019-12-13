package 行为型模式.策略模式;

public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不能飞翔");
    }
}
