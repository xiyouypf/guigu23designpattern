package 行为型模式.访问者;

public interface Person {
    //提供一个方法,让访问者可以访问
    void accept(Action action);
}
