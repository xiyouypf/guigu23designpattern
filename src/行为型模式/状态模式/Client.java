package 行为型模式.状态模式;

public class Client {
    public static void main(String[] args) {
        //创建活动对象,奖品池有5个奖品
        RaffleActivity activity=new RaffleActivity(1);

        //我们连续抽奖3次
        for (int i=0;i<13;i++){
            System.out.println("-------第"+(i+1)+"次抽奖--------");
            //参与抽奖,第一步点击扣除积分
            activity.reduceMoney();

            //第二步,抽奖
            activity.raffle();
        }
    }
}
