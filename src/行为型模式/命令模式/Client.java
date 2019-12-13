package 行为型模式.命令模式;

public class Client {
    public static void main(String[] args) {
        //使用设计模式,完成通过遥控器,对电灯的操作

        //创建电灯的对象(接受者)
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给我们的遥控器设置相关的命令,比如no==0是电灯的开和关的操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();

        System.out.println("----------------------------------------");

        TVReceiver tvReceiver=new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();
    }
}
