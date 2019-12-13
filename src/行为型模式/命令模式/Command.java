package 行为型模式.命令模式;

public interface Command {
    //执行操作
    void execute();
    //撤销操作
    void undo();
}
