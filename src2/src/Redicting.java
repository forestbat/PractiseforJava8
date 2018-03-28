import java.io.*;

public class Redirecting {
    public static void main(String...args)throws IOException{
        PrintStream console=System.out;
        BufferedInputStream in=new BufferedInputStream(new FileInputStream("Redirecting.java"));
        PrintStream out=new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);

    }
}
