import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
    static <T> void writeExact(List<T> list, T item){
        list.add(item);
    }
    static List<Apple> apples=new ArrayList<Apple>();
    static List<Fruit> fruit=new ArrayList<Fruit>();
    static void fl(){
        writeExact(apples,new Apple());
        //writeExact(fruit,new AnApple());Error:
        //Incompatible types:found Fruit,required Apple
    }
    static<T> void writeWithWildCard(List<? super T> list,T item){
        list.add(item);
    }
    static void f2(){
        writeWithWildCard(apples,new Apple());
        writeWithWildCard(fruit,new AnApple());
    }
}
