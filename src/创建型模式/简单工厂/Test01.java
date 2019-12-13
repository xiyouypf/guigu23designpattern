package 创建型模式.简单工厂;

public class Test01 {
    public static void main(String[] args) {
        //2.使用工厂创建
        Car01 car1= CarFactory01.getCar01("五菱");
        Car01 car2= CarFactory01.getCar01("特斯拉");
        car1.name();
        car2.name();
    }
}
