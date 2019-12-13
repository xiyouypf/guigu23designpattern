package 行为型模式.访问者;

public class Wait implements Action{

    @Override
    public void getManResult(Man man) {
        System.out.println(man+"男人给的评价是待定");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman+"女人给的评价是待定");
    }
}
