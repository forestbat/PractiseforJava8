import java.util.concurrent.*;
import java.util.*;
class TaskWithResult implements Callable<String>{
    private int id;
    public TaskWithResult(int id){
        this.id=id;
    }
    public String call(){
        return ""+id;
    }
}
public class CallableDemo {
    public static void main(String...args){
        ExecutorService exec=Executors.newCachedThreadPool();
        ArrayList<Future<String>> results=new ArrayList<Future<String>>();
        for(int i=1;i<10;i++)
            results.add(exec.submit(new TaskWithResult(i)));
        for(Future s:results) {
            try {
                //get() blocks until completion:
                System.out.print(s.get());
            } catch (InterruptedException e) {
                System.out.print(e);
                return;
            } catch (ExecutionException e) {
                System.out.print(e);
            }finally {
                exec.shutdown();
            }
        }
    }
}
