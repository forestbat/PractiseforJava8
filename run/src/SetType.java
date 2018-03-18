import java.util.*;
public class SetType {
    int i;
    public SetType(int n){i=n;}
    public boolean equals(Object o){return o instanceof SetType && (i==((SetType)o).i);}
    public String toString(){return Integer.toString(i);}
}
class HashType extends SetType{
    public HashType(int n){super(n);}
    public int hashCode(){return i;}
}
class TreeType extends SetType implements Comparable<TreeType>{
    public TreeType(int n){super(n);}
    public int compareTo(TreeType arg){
        return (arg.i<i?-1:(arg.i==i?0:1));
    }
}
class TyperForSets{
    static <T> Set<T> fill(Set<T> set,Class<T> type){
        try{
            for(int i=0;i<10;i++)
                set.add(type.getConstructor(int.class).newInstance());
        }catch (Exception e){throw new RuntimeException(e);}
        return set;
    }
    static <T> void test(Set<T> set,Class<T> type){
        fill(set,type);
    }
}


