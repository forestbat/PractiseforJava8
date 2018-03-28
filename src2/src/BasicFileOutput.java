import java.io.*;

public class BasicFileOutput {
    static String file="BasicFileOutput.out";
    public static void main(String...args)throws Exception{
        BufferedReader in=new BufferedReader(new StringReader(BufferedInputFile.read("BasicFileOutput.java")));
        PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("File")));
        int lineCount=1;
        String s;
        while ((s=in.readLine())!=null){
            out.print(lineCount++ +";"+s);
            out.close();
        }
        //Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
}
//PrintWriter下的文件构造器，快捷方式
class FileOutputShortCut{
    static String file="FileOutputShortcut.out";
    public static void main(String[] args) throws IOException{
        BufferedReader in=new BufferedReader(new StringReader(BufferedInputFile.read("FileOutputShortcut.java")));
        //Here's the shortcut:
        PrintWriter out=new PrintWriter(file);
        int lineCount=1;
        String s;
        while((s=in.readLine())!=null)
            out.print(lineCount+++":"+s);
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }

}
