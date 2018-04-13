import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
import java.util.*;
class House implements Serializable{}
class Animals implements Serializable{
    private String name;
    private House preferredhouse;
    Animals(String nm,House h){
        name=nm;
        preferredhouse=h;
    }
    public String toString(){
        return name+super.toString()+preferredhouse;
    }
}
public class MyWorld {
    public static void main(String...args) throws IOException,ClassNotFoundException{
        House house=new House();
        List<Animals> animals=new ArrayList<Animals>();
        animals.add(new Animals("Bosco the dog",house));
        animals.add(new Animals("Ralph the hamster",house));
        System.out.print(animals);
        ByteArrayOutputStream buf1=new ByteArrayOutputStream();
        ObjectOutputStream o=new ObjectOutputStream(buf1);
        o.writeObject(animals);
        o.writeObject(animals);//Write a 2nd set
        //Write to a different system:
        ByteArrayOutputStream buf2=new ByteArrayOutputStream();
        ObjectOutputStream o2=new ObjectOutputStream(buf2);
        o2.writeObject(animals);
        //Now get them back:
        ObjectInputStream in1=new ObjectInputStream(new ByteArrayInputStream(buf1.toByteArray()));
        ObjectInputStream in2=new ObjectInputStream(new ByteArrayInputStream(buf2.toByteArray()));
        List animals1=(List)in1.readObject();
        List animals2=(List)in2.readObject();
    }
}
