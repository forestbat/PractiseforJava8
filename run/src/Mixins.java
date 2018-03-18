import java.util.Date;

interface TimeStamped{long getStamp();}
class TimeStampedImp implements TimeStamped{
    private long timeStamp;
    public TimeStampedImp(){timeStamp=new Date().getTime();}
    public long getStamp(){return timeStamp;}
}
interface SerialNumbered{long getSerialNumber();}
class SerialNumberedImp implements SerialNumbered{
    private long counter=1;
    private long serialNumber=counter++;
    public long getSerialNumber(){return serialNumber;}
}
interface Basic{
    public void set(String val);
    public String get();
}
class BasicImp implements Basic{
    private String value;
    public void set(String val){
        value=val;
    }
    public String get(){
        return value;
    }
}
class Mixin extends BasicImp implements TimeStamped,SerialNumbered{
    private TimeStamped timeStamped=new TimeStampedImp();
    private SerialNumbered serialNumbered=new SerialNumberedImp();
    public long getStamp(){return timeStamped.getStamp();}
    public long getSerialNumber(){
        return serialNumbered.getSerialNumber();
    }
}
public class Mixins  {
//TODO
}
