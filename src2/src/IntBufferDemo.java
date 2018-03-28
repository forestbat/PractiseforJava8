import java.nio.*;

public class IntBufferDemo {
    private static int BSIZE=1024;
    public static void main(String...args){
        ByteBuffer bb=ByteBuffer.allocate(BSIZE);
        IntBuffer ib=bb.asIntBuffer();
        //Store an array of int:
        ib.put(new int[]{11,42,47,99,143});
        //Absolute location read and write:
        System.out.println(ib.get(3));
        ib.put(3,1811);
        //Setting a new limit before rewinding the buffer:
        ib.flip();
        while (ib.hasRemaining()){
            int i=ib.get();
            System.out.println(i);
        }
    }
}
