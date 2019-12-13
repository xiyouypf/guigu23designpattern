package 创建型模式.单例;

/**
 * 步骤:1.构造器私有化
 * 2.类的内部创建对象
 * 3.向外暴露一个静态的公共方法
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton8 singleton8=Singleton8.INSTANCE;
        System.out.println(singleton8.hashCode());
    }
}
//1.饿汉式:静态常亮
class Singleton1{
    private Singleton1(){}
    private final static Singleton1 instance=new Singleton1();
    public static Singleton1 getInstance(){
        return instance;
    }
}
//2.饿汉式:静态代码块
class  Singleton2{
    private Singleton2(){}
    private static Singleton2 instance;
    static {
        instance=new Singleton2();
    }
    public static Singleton2 getInstance(){
        return instance;
    }
}
//3.懒汉式:线程不安全,开发中不要使用
class Singleton3{
    private Singleton3(){}
    private static Singleton3 instance;
    public static Singleton3 getInstance(){
        if (instance==null){
            instance=new Singleton3();
        }
        return instance;
    }
}
//4.懒汉式:线程安全,同步方法,效率低
class Singleton4{
    private Singleton4(){}
    private static Singleton4 instance;
    public static synchronized Singleton4 getInstance(){
        if (instance==null){
            instance=new Singleton4();
        }
        return instance;
    }
}
//5.懒汉式:直接用不了
class Singleton5{
    private Singleton5(){}
    private static Singleton5 instance;
    public static Singleton5 getInstance(){
        if (instance==null){
            synchronized (Singleton5.class){
                instance=new Singleton5();
            }
        }
        return instance;
    }
}
//6.双重检测锁
class Singleton6{
    private Singleton6(){}
    private static volatile Singleton6 instance;
    public static Singleton6 getInstance(){
        if (instance==null){
            synchronized (Singleton6.class){
                if (instance==null){
                    instance=new Singleton6();
                }
            }
        }
        return instance;
    }
}
//7.静态类不类:推荐
class Singleton7{
    private Singleton7(){}
    private static class SingletonInstance{
        private static final Singleton7 INSTANCE=new Singleton7();
    }
    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
//8.枚举:不仅能避免多线程同步问题,还能防止反序列化
enum Singleton8{
    INSTANCE//属性
}