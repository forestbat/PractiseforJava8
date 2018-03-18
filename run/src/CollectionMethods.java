import java.util.*;

public class CollectionMethods {
    public static void main(String...args){
        Collection<String> c=new ArrayList<String>();
        c.addAll(Countries.names(6));
        c.add("ten");
        c.add("eleven");
        //Make an array from the list:
        Object[] array=c.toArray();
        //Make an String from the list:
        String[] str=c.toArray(new String[0]);
        //find max and min elements:this means different things depending on the way the Comparable interface is implemented:
        System.out.println(Collections.max(c));
        System.out.println(Collections.min(c));
        //Add a Collection to another Collection
        Collection<String> c2=new ArrayList<String>();
        c2.addAll(Countries.names(6));
        c.addAll(c2);
        c.remove(Countries.DATA[0][0]);
        //Remove all components that are in the argument collection:
        c.removeAll(c2);
        c.addAll(c2);
        //Is an element in this Collection?
        String val=Countries.DATA[3][0];
        System.out.println(c.contains(val));
        //Is a Collection in this Collection?
        System.out.println(c.containsAll(c2));
        Collection<String> c3=((List<String>) c).subList(3,5);
        //keep all the elements that are in both c2 and c3 (an intersection of sets)
        c2.retainAll(c3);
        c2.removeAll(c3);
    }
}
