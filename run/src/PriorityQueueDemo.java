import java.util.*;

public class PriorityQueueDemo {
    public static void main(String...args){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();
        Random rand=new Random(47);
        for(int i=0;i<100;i++)
            priorityQueue.offer(rand.nextInt(i+10));
        QueueDemo.printQ(priorityQueue);
        List<Integer> ints= Arrays.asList(25,22,28,1,1,45);
        priorityQueue=new PriorityQueue<Integer>(ints);
        QueueDemo.printQ(priorityQueue);
        priorityQueue=new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact="EDUCATION SHOULD";
        List<String> strings=Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ=new PriorityQueue<String>(strings);
        QueueDemo.printQ(stringPQ);
        stringPQ=new PriorityQueue<String>(strings.size(),Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet=new HashSet<Character>();
        for(char c:fact.toCharArray())
            charSet.add(c);//Autoboxing
        PriorityQueue<Character> characterPQ=new PriorityQueue<Character>();
        QueueDemo.printQ(characterPQ);
    }
}
