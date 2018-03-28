import java.nio.charset.*;
import java.util.*;

public class AvailableCharSets {
    public static void main(String...args){
        SortedMap<String,Charset> charSets=Charset.availableCharsets();
        Iterator<String> it=charSets.keySet().iterator();
        while(it.hasNext()){
            String csname=it.next();
            System.out.println(csname);
            Iterator aliases=charSets.get(csname).aliases().iterator();
            if(aliases.hasNext())
                System.out.println(":");
            while (aliases.hasNext()){
                System.out.println(aliases.next());
                if(aliases.hasNext())
                    System.out.println(",");
            }
        }
    }
}
