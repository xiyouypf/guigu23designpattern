package 创建型模式.工厂方法;

public class WuLing02Factory implements CarFactory02 {
    @Override
    public Car02 getCar() {
        return new WuLing02();
    }
}
