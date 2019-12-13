package 行为型模式.状态模式;

/**
 * 不能抽奖的状态
 */
public class NoRaffleState implements State {
    //初始化时传入活动引用,扣除积分后改变其状态
    private RaffleActivity activity;
    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣积分,扣除积分后,将状态设置成可以抽奖的状态
    @Override
    public void reduceMoney() {
        System.out.println("扣除50积分成功,您可以抽奖啦");
        activity.setState(activity.getCanRaffleState());
    }

    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才可以进行抽奖!");
        return false;
    }

    //当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
