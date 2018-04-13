enum Signal{GREEN,YELLOW,RED}
public class TrafficLight {
    Signal color=Signal.RED;
    public void change(){
        switch(color){
            case RED:color=Signal.GREEN;break;
            case GREEN:color=Signal.RED;break;
        }
    }

}
