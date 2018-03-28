import java.lang.ref.*;
import java.util.*;
class VeryBig{
    private static int SIZE=10000;
    private long[] la=new long [SIZE];
    private String event;
    public VeryBig(String id){event=id;}
    public String toString(){return event;}
    protected void finalize(){
        System.out.println("Finalizing"+event);
    }
}
public class References {
    private static ReferenceQueue<VeryBig> rq=new ReferenceQueue<VeryBig>();
    public static void checkQueue(){
        Reference<? extends VeryBig> inq=rq.poll();
        if(inq!=null)
            System.out.println("In queue:"+inq.get());
    }
    public static void main(String...args){
        int size=10;
        //Or,choose size via the command line:
        if(args.length>0)
            size=new Integer(args[0]);
        LinkedList<SoftReference<VeryBig>> sa=new LinkedList<SoftReference<VeryBig>>();
        for(int i=0;i<size;i++){
            sa.add(new SoftReference<VeryBig>(new VeryBig("sort"+i),rq));
            System.out.println("just created:"+sa.getLast());
            checkQueue();
        }
        SoftReference<VeryBig> s=new SoftReference<VeryBig>(new VeryBig("Soft"));
        WeakReference<VeryBig> w=new WeakReference<VeryBig>(new VeryBig("Weak"));
        System.gc();
        LinkedList<PhantomReference<VeryBig>> pa=new LinkedList<PhantomReference<VeryBig>>();
        for(int i=0;i<size;i++)
            pa.add(new PhantomReference<VeryBig>(new VeryBig("Phantom"+i),rq));
        System.out.println("Just created:"+pa.getLast());
        checkQueue();
    }

}
