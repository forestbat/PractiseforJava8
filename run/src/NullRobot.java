import java.lang.reflect.*;
import java.util.*;
class NullRobotProxyHandler implements InvocationHandler{
    private String nullName;
    private Robot proxied=new NRobot();
    NullRobotProxyHandler(Class<? extends Robot> type){
        nullName=type.getSimpleName()+"NullRobot";
    }
    private class NRobot implements Robot{
        public String name(){return nullName;}
        public String model(){return nullName;}

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied,args);
    }
}
public class NullRobot {
    public static Robot newNullRobot(Class<? extends Robot> type){
        return (Robot)Proxy.newProxyInstance(NullRobot.class.getClassLoader(),new Class[]{Robot.class},new NullRobotProxyHandler(type));
    }
    public static void main(String args){
        Robot[] bots={
                new SnowRemovalRobot("Snownee"),
                newNullRobot(SnowRemovalRobot.class)
        };
    }


}
