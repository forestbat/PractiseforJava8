package access;
//Print merhods that can be used without qualifiers,using Java SE5 static imports;

import java.io.PrintStream;

public class Print {
    //Print with a newline
    public static void print(Object obj){
        System.out.println(obj);
    }
    //Print a new line by itself
    public static void print(){
        System.out.println();
    }
    //Print with no line break;
    public static void printnb(Object obj){
        System.out.println(obj);
    }
    //The new JavaSE5 printf()(from C)
    public static PrintStream
    printf(String format,Object...args){
        return System.out.printf(format,args);
    }
}