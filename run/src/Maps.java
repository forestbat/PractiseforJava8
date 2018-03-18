import java.util.*;
import java.util.concurrent.*;
public class Maps {
    public static void printKeys(Map<Integer,String> map){
        System.out.println(map.keySet());
    }
    public static void test(Map<Integer,String> map){
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        //Map has "Set" behavior for keys:
        map.putAll(new CountingMapData(25));
        printKeys(map);
        //Producing a Collection of the values:
        System.out.println(map.values());
        System.out.println(map.get(11));
        System.out.println(map.containsKey(11));
        System.out.println(map.containsValue("F0"));
        Integer key=map.keySet().iterator().next();
        map.remove(key);
        printKeys(map);
        map.clear();
        map.putAll(new CountingMapData(25));
        //Operations on the Set change the Map:
        map.keySet().removeAll(map.keySet());
        System.out.println(map.isEmpty());
    }
}
