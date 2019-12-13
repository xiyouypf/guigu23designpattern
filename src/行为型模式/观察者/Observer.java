package 行为型模式.观察者;
//观察者接口,由观察者来实现
public interface Observer {
    //温度,气压,湿度
    void update(double temperature,double pressure,double humidity);
}
