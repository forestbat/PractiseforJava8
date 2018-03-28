import java.util.*;

public class Utilities {
    static List<String> list= Arrays.asList("one two three four five six".split(""));
    public static void main(String...args){
       System.out.println(Collections.disjoint(list,Collections.singletonList("Four")));
       System.out.println(Collections.max(list));
       System.out.println(Collections.min(list));
       System.out.println(Collections.max(list,String.CASE_INSENSITIVE_ORDER));
       System.out.println(Collections.min(list,String.CASE_INSENSITIVE_ORDER));
       List<String> subList=Arrays.asList("four five six".split(""));
       System.out.println(Collections.indexOfSubList(list,subList));
       System.out.println(Collections.lastIndexOfSubList(list,subList));
       Collections.replaceAll(list,"one","yo");
       Collections.reverse(list);
       Collections.rotate(list,3);
       List<String> source=Arrays.asList("in the matrix".split(""));
       Collections.copy(list,source);
       Collections.swap(list,0,list.size()-1);
       Collections.shuffle(list,new Random(47));
       Collections.fill(list,"pop");
       System.out.println(Collections.frequency(list,"pop"));
       List<String> dups=Collections.nCopies(3,"snap");
       System.out.println(dups);
    }
}
