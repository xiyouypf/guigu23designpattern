package 行为型模式.命令模式;

public class RemoteController {
    //开按钮的命令数组
    Command[] onCommands;
    //关按钮的命令数组
    Command[] offCommands;
    //执行撤销的命令
    Command undoCommand;

    //构造器,完成对按钮的初始化

    public RemoteController() {
        onCommands=new Command[5];
        offCommands=new Command[5];
        for(int i=0;i<5;i++){
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    //给我们的按钮设置你需要的按钮
    public void setCommand(int no,Command onCommon,Command offCommand){
        onCommands[no]=onCommon;
        offCommands[no]=offCommand;
    }

    //按下开的按钮
    public void onButtonWasPushed(int no){
        //找到你按下的按钮,并调用对应的方法
        onCommands[no].execute();
        undoCommand=onCommands[no];
    }

    //按下关的按钮
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommand=offCommands[no];
    }

    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
