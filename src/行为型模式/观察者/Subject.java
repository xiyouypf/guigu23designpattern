package 行为型模式.观察者;
//接口,需要让WeatherData来实现
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
