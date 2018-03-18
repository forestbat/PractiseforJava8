import java.util.*;
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coil,Generator<T> gen,int n){
        for(int i=0;i<n;i++)
            coil.add(gen.next());
        return coil;
    }
    public static void main(String[] args){
        Collection<Coffee> coffee=fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
        for(Coffee c:coffee)
            System.out.println(c);
        Collection<Integer> fnumbers=fill(new ArrayList<Integer>(),new Fibonacci(),12);
        for(int i:fnumbers)
            System.out.println(i+"");
    }
}
