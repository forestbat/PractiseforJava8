package typeinfo.pets;

import java.util.*;

class Person extends Individual{
    public Person(String name){super(name);}
}
class Pet extends Individual{
    public Pet(String name){super(name);}
    public Pet(){super();}
}
abstract class PetCreator{
    private Random rand=new Random(47);
    //The list of the different types of Pet to create
    public abstract List<Class<? extends Pet>>types();
    public Pet randomPet(){
    //Create one random pet
    int n=rand.nextInt(types().size());
    try{
        return types().get(n).newInstance();
    }catch(InstantiationException e){
        throw new RuntimeException(e);
    }catch (IllegalAccessException e){throw new RuntimeException(e);}
}
    public Pet[] createArray(int size){
    Pet[] result=new Pet[size];
    for(int i=0;i<size;i++)
     result[i]=randomPet();
    return result;
}
public ArrayList<Pet> arrayList(int size){
    ArrayList<Pet> result=new ArrayList<Pet>();
    Collections.addAll(result,createArray(size));
    return result;
}
}
class LiteralPetCreator extends PetCreator{
    //No try block needed
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>>allTypes=Collections.unmodifiableList(Arrays.asList());
    private static List<Class<? extends Pet>>types=allTypes.subList(allTypes.indexOf(Pet.class),allTypes.size());
    public List<Class<? extends Pet>> types(){return types;}
    public static void main(String...args){System.out.println(types);}
}
class Pets{
    public static final PetCreator creator=new LiteralPetCreator();
    public static Pet randomPet(){return creator.randomPet();}

public static Pet[] createArray(int size){
    return creator.createArray(size);
}
public static ArrayList<Pet> arrayList(int size){
    return creator.arrayList(size);
}
}