import java.util.concurrent.*;

public class SimpleDeamons implements Runnable{
    public void run(){
        try{
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
            System.out.print(Thread.currentThread()+""+this);}
        }catch (InterruptedException e){System.out.print("sleep interrupted");}
    }
    public static void main(String...args) throws Exception {
        for(int i=0;i<10;i++){
            Thread daemon=new Thread(new SimpleDeamons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
class DaemonFromFactory implements Runnable{
    public void run(){
        try {
            while(true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print(Thread.currentThread()+":"+this);
            }
        }catch (InterruptedException e){System.out.print("Interrupted");}
    }
    public static void main(String...args) throws Exception{
        ExecutorService exec=Executors.newCachedThreadPool();
        for(int i=0;i<10;i++)
            exec.execute(new DaemonFromFactory());
        System.out.print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(100);
    }

}
