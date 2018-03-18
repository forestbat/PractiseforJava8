import java.util.*;
public class SetOperations {
    public static void main(String...args){
        Set<String> set1=new HashSet<String>();
        Collections.addAll(set1,"ABCD".split(""));
        System.out.println("H+:"+set1.contains("H"));
        Set<String> set2=new HashSet<String>();
        Collections.addAll(set2,"HJKL".split(""));
        System.out.println("set2 in set1"+set1.containsAll(set2));
        set1.remove("H");
        System.out.println("set1:"+set1);
        System.out.println("set2 in set1"+set1.containsAll(set2));
        set1.removeAll(set2);
        Collections.addAll(set1,"XYZ".split(""));
        System.out.println("XYZ added to set1:"+set1);
    }
}
