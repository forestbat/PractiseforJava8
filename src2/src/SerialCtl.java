import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class SerialCtl implements Serializable {
    private String a;
    private transient String b;
    public SerialCtl(String aa,String bb){
        a=aa;
        b=bb;
    }
    public String toString(){
        return a+"\n"+b;
    }
    public void writeObject(ObjectOutputStream stream)throws IOException,ClassNotFoundException{
        stream.defaultWriteObject();
        stream.writeObject(b);
    }
    public void readObject(ObjectInputStream stream) throws IOException,ClassNotFoundException{
        stream.defaultReadObject();
        b=(String)stream.readObject();
    }
    public static void main(String...args)throws IOException,ClassNotFoundException{
        SerialCtl sc=new SerialCtl("Test1","Test2");
        System.out.print(sc);
        ByteArrayOutputStream buf=new ByteArrayOutputStream();
        ObjectOutputStream o=new ObjectOutputStream(buf);
        o.writeObject(sc);
        //Now get it back:
        ObjectInputStream i=new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
        SerialCtl sc2=(SerialCtl)i.readObject();
        System.out.print(sc2);

    }
}
