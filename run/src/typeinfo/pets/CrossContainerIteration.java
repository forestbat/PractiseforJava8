package typeinfo.pets;

import java.util.ArrayList;
import java.util.Iterator;

public class CrossContainerIteration {
    public static void display(Iterator<Pet> it){
        while(it.hasNext()){
            Pet p=it.next();
            System.out.println(p.id()+":"+p+"");
        }
        System.out.println();
    }
    public static void main(String...args){
        ArrayList<Pet> pets=Pets.arrayList(8);
    }
}
