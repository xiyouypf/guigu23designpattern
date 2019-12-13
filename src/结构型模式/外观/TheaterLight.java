package 结构型模式.外观;

public class TheaterLight {
    private TheaterLight(){}
    private static TheaterLight instance;
    //这种单例效率低
    public static synchronized TheaterLight getInstance(){
        if (instance==null){
            instance=new TheaterLight();
        }
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight灯光打开");
    }
    public void off(){
        System.out.println("TheaterLight灯光关闭");
    }
    public void bright(){
        System.out.println("TheaterLight灯光调亮");
    }
    public void dim(){
        System.out.println("TheaterLight灯光调暗");
    }
}
