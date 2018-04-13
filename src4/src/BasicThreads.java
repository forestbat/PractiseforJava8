import java.util.concurrent.*;
public class BasicThreads {
    public static void main(String...args){
        Thread t=new Thread(new LiftOff(0));
        t.start();
    }
}
class MoreBasicThreads{
    public static void main(String...args){
        for(int i=0;i<5;i++)
            new Thread(new LiftOff(5)).start();
    }
}
class CachedThreadPool{
    public static void main(String...args){
        ExecutorService exec=Executors.newCachedThreadPool();
        for(int i=0;i<5;i++)
            exec.execute(new LiftOff(4));
        exec.shutdown();
    }
}
class FixedThreadPool{
    public static void main(String...args){
        //Constructor argument is number of threads
        ExecutorService exec=Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++)
            exec.execute(new LiftOff(4));
    }
}
