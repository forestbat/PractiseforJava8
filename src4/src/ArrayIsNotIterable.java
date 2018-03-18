import java.util.Arrays;
import java.util.Iterator;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib){
        for(T t:ib)
            System.out.println(t+"");
    }
    public static void main(String...args){
        test(Arrays.asList(1,2,3));
        String[] string={"A","B","C"};
        //An array works in foreach,but it's iterable
        //test(Arrays.asList(0,1,2));
        //You must explicitly convert into an Iterable
        test(Arrays.asList(string));
    }
}
