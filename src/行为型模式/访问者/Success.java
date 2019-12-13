package 行为型模式.访问者;

public class Success implements Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(man+"男人给出的评价是成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman+"女人给出的评价是成功");
    }
}
