package 行为型模式.命令模式;

public class LightOnCommand implements Command {
    //聚合LightReceiver
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
