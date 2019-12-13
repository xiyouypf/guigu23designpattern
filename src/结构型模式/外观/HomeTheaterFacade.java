package 结构型模式.外观;
//外观类
public class HomeTheaterFacade {
    //定义各个子系统的对象
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        dvdPlayer=DVDPlayer.getInstance();
        popcorn=Popcorn.getInstance();
        projector=Projector.getInstance();
        screen=Screen.getInstance();
        stereo=Stereo.getInstance();
        theaterLight=TheaterLight.getInstance();
    }

    //操作分成四个步骤

    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }
    public void play(){
        dvdPlayer.play();
    }
    public void pause(){
        dvdPlayer.pause();
    }
    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
