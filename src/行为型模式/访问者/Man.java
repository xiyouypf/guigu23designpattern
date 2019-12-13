package 行为型模式.访问者;

public class Man implements Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
