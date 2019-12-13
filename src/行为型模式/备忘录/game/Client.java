package 行为型模式.备忘录.game;

/**
 * 备忘录模式:
 *      在不破坏封装性的前提下,捕获一个对象的内部状态,并在该对象之外保存这个状态
 *      这样以后要就可以将该对象恢复到之前的状态
 *
 * 1)给用户提供一种可以恢复的机制,可以使用户能够方便的回到某个历史状态
 * 2)实现信息的封装,使得用户不需要关心状态的保存细节
 * 3)如果类的成员变量过多,会占用比较大的资源,而且每次保存都会消耗一定的内存
 * 4)使用的场景:后悔药,打游戏时的存档,Windows里的ctri+z,IE中的后退,数据库中的事务管理
 * 5)为了节约内存,备忘录模式可以和原型模式配合使用
 */
public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和boss大战前的状态");
        gameRole.display();

        //把当前对象状态保存到caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战~~~");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();

        System.out.println("大战后,使用备忘录对象恢复到大战前");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后的状态");
        gameRole.display();
    }
}
