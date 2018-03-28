import java.util.*;
class Element {
    private String indet;
    public Element(String id){indet=id;}
    public String toString(){return indet;}
    public int hashCode(){return indet.hashCode();}
    public boolean equals(Object r){
        return r instanceof Element && indet.equals(((Element)r).indet);
    }
    protected void finalize(){
        System.out.println("finalizing"+getClass().getSimpleName()+indet);
    }
}
class Key extends Element{
    public Key(String id){
       super(id);
    }
}
class Value extends Element{
    public Value(String id){
        super(id);
    }
}
public class CanonicalMapping{
    public static void main(String...args){
        int size=1000;
        //Or choose size via the command line:
        if(args.length>0)
            size=new Integer(args[0]);
        Key[] keys=new Key[size];
        WeakHashMap<Key,Value> map=new WeakHashMap<Key,Value>();
        for(int i=0;i<size;i++){
            Key k=new Key(Integer.toString(i));
            Value v=new Value(Integer.toString(i));
            if(i%3==0)
                keys[i]=k;
            map.put(k,v);
        }
        System.gc();
    }
}
