package 行为型模式.状态模式;

//状态抽象类
public interface State {
    //扣除积分 -50
    void reduceMoney();
    //是否抽中奖品
    boolean raffle();//raffle n. 废物; 抽彩售货; vt. 抽彩售货; vi. 抽彩
    //发放奖品
    void dispensePrize();//dispense  vt. 分配，分发; 免除; 执行; vi. 免除，豁免
}
