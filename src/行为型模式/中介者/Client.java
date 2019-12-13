package 行为型模式.中介者;

/**
 * 1)多个类相互耦合,会形成网状结构,使用中介者模式将网状结构分离为星型结构,进行解耦
 * 2)减少类之间的依赖,降低了耦合,符合迪米特法则
 * 3)中介者承担了较多的责任,一旦中介者出现问题,整个系统就会受到影响
 * 4)如果设计不当,中介者对象本身变得过于复杂
 */
public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator=new ConcreteMediator();

        //创建Alarm 并且放入到 ConcreterMediator 对象的HashMap
        Alarm alarm=new Alarm(mediator,"alarm");
        CoffeeMachine coffeeMachine=new CoffeeMachine(mediator,"coffeeMachine");
        Curtain curtain=new Curtain(mediator,"curtain");
        TV tv=new TV(mediator,"tv");

        //让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
