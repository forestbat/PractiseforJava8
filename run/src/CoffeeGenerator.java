import java.util.*;
interface Generator<T>{T next();}
class Coffee{
    private static long counter=0;
    private final long id=counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+""+id;
    }
}
class Latte extends Coffee{}
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    private Class[] types = {Latte.class,};
    public CoffeeGenerator generator=new CoffeeGenerator();
    private static Random rand = new Random(47);
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public CoffeeGenerator() {}

    //For iteration:
    private int size = 0;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    public Coffee next() {
        try {
            return (Coffee)types[rand.nextInt(types.length)].newInstance();
            //Report programmer errors at run time:
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {//Not implemented
            throw new UnsupportedOperationException();
        }
    }

        public static void main(String...args){
            CoffeeGenerator gen=new CoffeeGenerator();
            for(int i=0;i<=10;i++)
                System.out.println(gen.next());
            for(Coffee c:new CoffeeGenerator(10))
                System.out.println(c);
        }
}


