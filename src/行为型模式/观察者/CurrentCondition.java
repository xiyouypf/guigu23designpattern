package 行为型模式.观察者;
public class CurrentCondition implements Observer {
    //温度,气压,湿度
    private double temperature;
    private double pressure;
    private double humidity;
    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }

    private void display() {
        System.out.println("temperature="+temperature);
        System.out.println("pressure="+pressure);
        System.out.println("humidity="+humidity);
    }
}
