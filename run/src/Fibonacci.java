import java.util.*;
public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    public Integer next() {
        return fib(count++);
    }

    public int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String... args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i++)
            System.out.println(gen.next() + "");
    }
}
    class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
        private int n;

        public IterableFibonacci(int count) {
            n = count;
        }


        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                @Override
                public boolean hasNext() {
                    return n > 0;
                }

                @Override
                public Integer next() {
                    n--;
                    return IterableFibonacci.this.next();
                }

                public void remove() {
                    //Not implemented
                    throw new UnsupportedOperationException();
                }
            };
        }
         public static void main(String...args) {
            for(int i:new IterableFibonacci(18)) {
                System.out.println(i+"");
                }}}



