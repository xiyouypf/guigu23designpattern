package 行为型模式.观察者;

import java.util.ArrayList;
import java.util.List;

public class WeaterData implements Subject {
    //温度,气压,湿度
    private double temperature;
    private double pressure;
    private double humidity;
    private List<Observer> observers;

    public WeaterData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void setData(double temperature,double pressure,double humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        dataChange();
    }
    public void dataChange(){
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this.temperature,this.pressure,this.humidity);
        }
    }

//    public double getTemperature() {
//        return temperature;
//    }
//
//    public void setTemperature(double temperature) {
//        this.temperature = temperature;
//    }
//
//    public double getPressure() {
//        return pressure;
//    }
//
//    public void setPressure(double pressure) {
//        this.pressure = pressure;
//    }
//
//    public double getHumidity() {
//        return humidity;
//    }
//
//    public void setHumidity(double humidity) {
//        this.humidity = humidity;
//    }
}
