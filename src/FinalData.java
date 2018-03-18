import java.util.Random;

import static java.lang.System.out;

class Value{
    int i;//package access
    public Value(int i){
        this.i=i;
    }
}
public class FinalData {
    private static Random rand=new Random(47);
    private String id;
    public FinalData(String ID){
        this.id=id;
    }
    //Can be compile-time constants;
    private final int valueOne=9;
    private static final int valueTwo=99;
    //typical public constant
    public static final int valueThree=999;
    //cannot be compile-time constants;
    private final int i4=rand.nextInt(20);
    static final int i5=rand.nextInt(20);
    private Value v1=new Value(11);
    private final Value v2=new Value(2);
    private static final Value VAL_3=new Value(33);
    //arrays
    private final int[]a={1,2,3,4,5,6};
    public String toString(){
        return id+":"+"i4="+i4+",INT_5="+i5;
    }
public static void main(String...args){
        FinalData fd1=new FinalData("fd1");
        fd1.v2.i++;//Object isn't constant;
    fd1.v1=new Value(9);
    for(int i=0;i<fd1.a.length;i++)
    fd1.a[i]++;
    //fd1.v2=new Value(0);
   // fd1.VAL_3=new Value(1);
   // fd1.a=new int[3];
    System.out.println(fd1);
    System.out.println("Creating Final Data");
    FinalData fd2=new FinalData("fd2");
    System.out.println(fd1);
    System.out.println(fd2);
}
}
