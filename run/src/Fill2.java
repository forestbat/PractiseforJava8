import java.util.*;
interface Addable<T>{void add(T t);}
public class Fill2 {
    //Classtoken version:
    public static <T> void fill(Addable<T> addable,Class<?extends T>classToken,int size){
       //for(int i=0;i<size;i++)
         //  addable.add(CoffeeGenerator.generator.next());
    }
}
//To adapt a base type,you must use composition
//make any collection addable using composition
class AddableCollectionAdapter<T> implements Addable<T>{
    private Collection<T> c;
    public AddableCollectionAdapter(Collection<T> c){
        this.c=c;
    }
    public void add(T item){c.add(item);}
}
//A helper to capture the type automatically:
class Adapter{
    public static <T> Addable<T> collectionAdapter(Collection<T> c){
        return new AddableCollectionAdapter<T>(c);
    }
}
//To adapt a specific type,you can use inheritance,
//Make a SimpleQueue Addable using inheritance
class AddableSimple<T> extends SimpleQueue<T> implements Addable<T>{
    public void add(T item){super.add(item);}
}
