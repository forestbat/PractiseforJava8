import java.io.*;

public class StoringAndRecoveringData {
    public static void main(String...args)throws Exception{
        DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
        out.writeDouble(3.1415);
        out.writeUTF("That's pi");
        out.writeDouble(1.414);
        out.writeUTF("square root of 2");
        out.close();
        DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
        System.out.println(in.readDouble());
        //Only readUTF() will recover the Java-UTF String properly:
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
    }
}
