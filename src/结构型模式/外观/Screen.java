package 结构型模式.外观;

public class Screen {
    private Screen(){}
    private static class SingletonInstance{
        private static final Screen INSTANCE=new Screen();
    }
    public static Screen getInstance(){
        return SingletonInstance.INSTANCE;
    }

    public void up(){
        System.out.println("screen上升");
    }
    public void down(){
        System.out.println("screen下降");
    }
}
