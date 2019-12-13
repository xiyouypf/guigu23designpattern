package 行为型模式.命令模式;

public class LightOffCommand implements Command {
    //聚合LightReceiver
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
