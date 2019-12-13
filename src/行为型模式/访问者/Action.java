package 行为型模式.访问者;

public interface Action {
    //得到男性的评价
    void getManResult(Man man);
    //得到女性的评价
    void getWomanResult(Woman woman);
}
