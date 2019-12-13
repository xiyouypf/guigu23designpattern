package 行为型模式.访问者;

/**
 * 说明:
 *  1)这里我们使用到了双分派,即首先在客户端程序中,将具体状态作为参数床底weman中(第一次分派)
 *  2)然后Woman类调用作为参数的"具体方法"中方法getWomanResult,同时将自己(this)作为参数
 *  传入,完成第二次分派
 */
public class Woman implements Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
