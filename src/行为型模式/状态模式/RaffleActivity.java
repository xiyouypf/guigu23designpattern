package 行为型模式.状态模式;

/**
 * 抽奖活动
 */
public class RaffleActivity {
    private State state;//表示活动当前的状态
    int count;//奖品数量

    //四个属性,表示四种状态
    State noRaffleState=new NoRaffleState(this);
    State canRaffleState=new CanRaffleState(this);
    State dispenseState=new DispenseState(this);
    State dispenseOutState=new DispenseOutState(this);

    //初始化当前的状态为 noRaffleState(即不能抽奖的状态)
    //初始化奖品的数量
    public RaffleActivity(int count) {
        this.state=getNoRaffleState();
        this.count = count;
    }

    //扣分,调用当前状态的reduceMoney方法
    public void reduceMoney(){
        state.reduceMoney();
    }
    //抽奖
    public void raffle(){
        //如果当前状态是抽奖成功
        if (state.raffle()){
            //领取奖品
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //每领取一次奖品,count--
    public int getCount() {
        int curCount=count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
