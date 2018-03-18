import java.util.LinkedList;
import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem>{
        private char primary;
        private int secondary;
        private String item;
        public ToDoItem(String td,char pri,int sec){
            primary=pri;
            secondary=sec;
            item=td;
        }
        public int compareTo(ToDoItem arg){
            if(primary>arg.primary)
                return +1;
            if(primary==arg.primary)
                if(secondary>arg.secondary)
                return +1;
           else if(secondary==arg.secondary)
               return 0;
           return -1;
        }
        public String toString(){
            return Character.toString(primary)+secondary+":"+item;
        }
        public void add(String td,char pri,int sec){
          //  super.add(new ToDoItem(td, pri, sec));
        }
    }
}
class Deque<T>{
    private LinkedList<T> deque=new LinkedList<T>();
    public void addFirst(T e){deque.addFirst(e);}
    public void addLast(T e){deque.addLast(e);}
    public T getFirst(){return deque.getFirst();}
    public T getLast(){return deque.getLast();}
    public T removeFirst(){return deque.removeFirst();}
    public int size(){return deque.size();}
}
class DequeTest{
    static void fillTest(Deque<Integer> deque){
        for(int i=20;i<27;i++){
            deque.addFirst(i);
        deque.addLast(i);}
    }
}