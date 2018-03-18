import javax.annotation.Generated;
import java.util.Arrays;
import java.util.Random;

public class CompType implements Comparable<CompType> {
    int i,j;
    private static int count=1;
    public CompType(int n1,int n2){
        i=n1;j=n2;
    }
    public String toString(){
        String result="";
        if(count++%3==0)
            result+="\n";
        return result;
    }
    public int compareTo(CompType ct){
        return (i<ct.i?-1:(i==ct.i?0:1));
    }
    private static Random r=new Random(47);
    public static Generator<CompType> generator(){
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(r.nextInt(100),r.nextInt(100));
            }
        };
    }
    public static void main(String...args){
        //CompType[]a= Generator.array(new CompType[12],generator());
        //Arrays.sort(a);
    }
}
