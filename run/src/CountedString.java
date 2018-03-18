//Creating a good hashcode()
import java.util.*;
public class CountedString {
    private static List<String> created=new ArrayList<String>();
    private String s;
    private int id=0;
    public CountedString(String str){
        s=str;
        created.add(s);
        //id is the total number of instances of this string in use by CountedString:
        for(String s2:created)
            if(s2.equals(s))
                id++;
    }
    public String toString(){
        return "String:"+id+s+hashCode();
    }
    public int hashCode(){
        //The very simple approach:
        //return s.hashcode()*id
        // Using joshua bloch's recipe:
        int result=17;
        result=37*result+s.hashCode();
        result=37*result+id;
        return result;
    }
    public boolean equals(Object o){
        return o instanceof CountedString&&s.equals(((CountedString)o).s)&&id==((CountedString)o).id;
    }
    public static void main(String args){
        Map<CountedString,Integer> map=new HashMap<CountedString, Integer>();
        CountedString[] cs=new CountedString[5];
        for(int i=0;i<cs.length;i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i], i);
        }
        System.out.println(map);
        for(CountedString countedString:cs){
            System.out.println(countedString);
            System.out.println(map.get(countedString));
        }
    }
}
