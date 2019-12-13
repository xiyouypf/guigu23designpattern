package 行为型模式.中介者;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator {
    //集合,放入所有的同事对象
    private Map<String,Colleague> colleagueMap;
    private Map<String,String> interMap;

    public ConcreteMediator() {
        colleagueMap=new HashMap<>();
        interMap=new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);
        if (colleague instanceof Alarm){
            interMap.put("alarm",colleagueName);
        }else if (colleague instanceof CoffeeMachine){
            interMap.put("coffeeMachine",colleagueName);
        }else if (colleague instanceof TV){
            interMap.put("tv",colleagueName);
        }else if (colleague instanceof Curtain){
            interMap.put("curtain",colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        //处理闹钟发出的消息
        if (colleagueMap.get(colleagueName) instanceof Alarm){
            if (stateChange==0){
                ((CoffeeMachine)(colleagueMap.get(interMap.get("coffeeMachine")))).startCoffee();
                ((TV)(colleagueMap.get(interMap.get(interMap.get("tv"))))).startTv();
            }else if (stateChange==1){
                ((TV)(colleagueMap.get(interMap.get("tv")))).stopTv();
            }
        }else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine){
            ((Curtain)(colleagueMap.get(interMap.get("curtain")))).upCurtain();
        }else if (colleagueMap.get(colleagueName) instanceof TV){

        }else if (colleagueMap.get(colleagueName) instanceof Curtain){

        }
    }

    @Override
    public void sendMessage() {

    }
}
