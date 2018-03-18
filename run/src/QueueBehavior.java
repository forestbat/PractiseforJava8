import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueBehavior {
    private static int count=10;
    static <T>void test(Queue<T> queue,Generator<T> gen){
        for(int i=0;i<count;i++)
            queue.offer(gen.next());
        while(queue.peek()!=null)
            System.out.println(queue.remove());
        System.out.println();
    }
    static class Gen implements Generator<String>{
        String[]s=("one two three four".split(""));
        int i;
        public String next(){return s[i++];}
    }
    public static void main(String...args){
        test(new LinkedList<String>(),new Gen());
        test(new PriorityQueue<String>(),new Gen());
        test(new ArrayBlockingQueue<String>(count),new Gen());
        test(new ConcurrentLinkedQueue<String>(),new Gen());
        test(new LinkedBlockingQueue<String>(),new Gen());
        test(new PriorityBlockingQueue<String>(),new Gen());
    }
}
