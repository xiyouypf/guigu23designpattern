package 创建型模式.简单工厂;

public class CarFactory01 {
    public static Car01 getCar01(String car){
        if (car.equalsIgnoreCase("五菱")){
            return new WuLing01();
        }else if (car.equalsIgnoreCase("特斯拉")){
            return new Tesla01();
        }else {
            return null;
        }
    }

}
