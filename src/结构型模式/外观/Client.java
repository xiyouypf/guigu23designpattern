package 结构型模式.外观;

/**
 * 外观模式:
 * 1.定义一个高层接口,给子系统的一组接口提供一个一致化的界面,用来
 * 访问子系统的一群接口
 * 2.通过定义一个一致的接口,用来屏蔽内部子系统的细节,使得调用端只需
 * 和这个接口发生调用,而不需要关心这个子系统的内部实现细节-->外观模式
 *
 * 1)对外屏蔽了子系统的细节,因此降低了客户端对子系统的使用复杂度
 * 2)对客户端与子系统的耦合关系,让子系统内部的模块更容易维护和扩展
 * 3)合理地使用外观模式,可以更好的划分访问的层次
 * 4)当系统需要进行分层设计时,可以考虑外观模式
 * 5)在维护大型系统时,可能这个系统已经变得非常的难以维护和扩展,因此
 * 可以考虑为新系统开发一个facade类,来提供遗留系统的比较清晰的简单
 * 接口,让新系统与facade类交互,提高复用性
 * 6)不能过多或不合理的使用外观模式
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
