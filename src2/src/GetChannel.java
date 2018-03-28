import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class GetChannel {
    private static int BSIZE=1024;
    public static void main(String...args) throws Exception{
        //Write a file:
        FileChannel fileChannel=new FileOutputStream("data.txt").getChannel();
        fileChannel.write(ByteBuffer.wrap("Some text".getBytes()));
        fileChannel.close();
        //Add to the end of the file:
        fileChannel=new RandomAccessFile("data.txt","rw").getChannel();
        fileChannel.position(fileChannel.size());//Move to the end
        fileChannel.write(ByteBuffer.wrap("Some more".getBytes()));
        fileChannel.close();
        //Read the file:
        fileChannel=new FileInputStream("data.txt").getChannel();
        ByteBuffer buff=ByteBuffer.allocate(BSIZE);
        fileChannel.read(buff);
        buff.flip();//Prepare for writing
        fileChannel.write(buff);
        buff.clear();//Prepare for reading
        while(buff.hasRemaining())
            System.out.println((char)buff.get());
    }
}
