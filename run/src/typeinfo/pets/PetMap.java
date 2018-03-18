package typeinfo.pets;
import java.util.*;
public class PetMap {
    public static void main(String...args){
        Map<String,Pet> petMap=new HashMap<String,Pet>();
        petMap.put("my cat",new Pet ("molly"));
        petMap.put("my dog",new Pet("ginger"));
        petMap.put("my hamster",new Pet("bosco"));
        System.out.println(petMap);
        Pet dog=petMap.get("my dog");
        System.out.println(dog);
    System.out.println(petMap.containsKey("my dog"));
    System.out.println(petMap.containsValue(dog));}
}
