import java.util.*;
public class IterableClass implements Iterable<String>{
    protected String[] words=("And that's how"+"we know the earth") .split("");
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String...args){
        for(String s:new IterableClass())
            System.out.println(s+"");
    }
}
