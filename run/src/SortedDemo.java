import java.util.*;
public class SortedDemo {
    public static void main(String...args){
        SortedSet<String> sortedSet=new TreeSet<String>();
        Collections.addAll(sortedSet,"one two three four five".split(""));
        System.out.println(sortedSet);
        String low=sortedSet.first();
        String high=sortedSet.last();
        System.out.println(low);
        System.out.println(high);
        Iterator<String> it=sortedSet.iterator();
        for(int i=0;i<7;i++){
            if(i==3)low=it.next();
            if(i==6)high=it.next();
            else it.next();
        }
    }
}
