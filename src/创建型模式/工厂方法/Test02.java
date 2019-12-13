package 创建型模式.工厂方法;


public class Test02 {
    public static void main(String[] args) {
        Car02 car020=new WuLing02Factory().getCar();
        Car02 car021=new Tesla02Factory().getCar();
        Car02 car022=new Mobai02Factory().getCar();
        car020.name();
        car021.name();
        car022.name();
    }
}
