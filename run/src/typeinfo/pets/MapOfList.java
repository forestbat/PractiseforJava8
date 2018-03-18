package typeinfo.pets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfList {
    public static Map<Person,List<? extends Pet>> petPeople=new HashMap<Person,List<? extends Pet>>();
    static{
        petPeople.put(new Person("Dawn"), Arrays.asList(new Pet(" cat molly"),new Pet("dog dandan")));
        petPeople.put(new Person("kate"),Arrays.asList(new Pet("cat shackleton"),new Pet("cat elsie"),
                new Pet("dog magrett")));
        petPeople.put(new Person("Marilyn"),Arrays.asList(new Pet("Snake zhangwei"),new Pet("frog jiang")));

    }
    public static void main(String...args){
        System.out.println("people:"+petPeople.keySet());
        System.out.println("pets:"+petPeople.values());
        for (Person person:petPeople.keySet()){
            System.out.println(person+"has:");
           for(Pet pet:petPeople.get(person))
               System.out.println(""+pet);
        }
    }
}
