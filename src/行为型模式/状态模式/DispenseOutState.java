package 行为型模式.状态模式;

/**
 * 奖品发放完毕的状态
 * 说明:当我们activety 改变成 DispenseOutState,抽奖活动结束
 */
public class DispenseOutState implements State {
    //初始化时传入活动引用,扣除积分后改变其状态
    private RaffleActivity activity;
    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("奖品发送完了,清下次再参与");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了,清下次再参与");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了,清下次再参与");
    }
}
