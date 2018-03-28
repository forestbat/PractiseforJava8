import java.io.*;
public class BufferedInputFile {
    //Throws exceptions to console:
    public static String read(String filename) throws IOException{
        //Reading input by lines:
        BufferedReader in=new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb=new StringBuilder();
        while((s=in.readLine())!=null)
            sb.append(s+"\n");
        in.close();
        return sb.toString();
    }
    public static void main(String...args){

    }
}
class FormattedMemoryInput{
    public static void main(String...args) throws IOException{
        try{
            DataInputStream in=new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("FormatterMemoryinput.java").getBytes()));
            while(true)
                System.out.println((char)in.readByte());
        }catch (EOFException e){System.err.println("End of stream");}
    }
}
