import java.util.*;
class VBasic{
    private String value;
    public void set(String val){value=val;}
    public String get(){return value;}
}
class Decorator extends VBasic{
    protected VBasic basic;
    public Decorator(VBasic basic){this.basic=basic;}
    public void set(String val){basic.set(val);}
    public String get(){return basic.get();}
}
class VTimeStamped extends Decorator{
    private long timeStamp;
    public VTimeStamped(VBasic basic){
        super(basic);
        timeStamp=new Date().getTime();
    }
    public long getStamp(){return timeStamp;}
}
class VSerialNumbered extends Decorator{
    private static long counter=1;
    private long serialNumber=counter++;
    public VSerialNumbered(VBasic basic){
        super(basic);
    }
    public long getSerialNumber(){return serialNumber;}
}
public class Decoration {
    public static void main(String...args){
        VTimeStamped t=new VTimeStamped(new VBasic());
        VTimeStamped t2=new VTimeStamped(new VSerialNumbered(new VBasic()));
        //t2.getSerialNumber();
    }
}
