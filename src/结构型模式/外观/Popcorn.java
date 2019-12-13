package 结构型模式.外观;

//爆米花机
public class Popcorn {
    //单例,使用静态类不类实现
    private Popcorn(){}
    private static class SingletonInstance{
        private static final Popcorn INSTANCE=new Popcorn();
    }
    public static Popcorn getInstance(){
        return SingletonInstance.INSTANCE;
    }

    public void on(){
        System.out.println("popcorn 打开");
    }
    public void off(){
        System.out.println("popcorn 关闭");
    }
    public void pop(){
        System.out.println("popcorn 正在出爆米花");
    }
}
