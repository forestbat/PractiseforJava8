import java.util.*;
import java.lang.reflect.*;
public class Apply {
    public static<T,S extends Iterable<? extends T>> void apply(S seq,Method f,Object...args){
        try{
            for(T t:seq)
                f.invoke(t,args);
        }catch (Exception e){throw new RuntimeException(e);}
    }
}
class Shape{
    public void rotate(){System.out.println("rotate"+this);}
    public void resize(int newSize){System.out.println(this+"resize"+newSize);}
}
class Square extends Shape{}
class FilledList<T> extends ArrayList<T>{
    public FilledList(Class<? extends T> type,int size){
        try{
            for(int i=0;i<size;i++)
                //Assumes default constructor:
                add(type.newInstance());
        }catch (Exception e){throw new RuntimeException(e);}
    }
}
class ApplyTest{
    public static void main(String[] args) throws Exception{
        List<Shape> shapes=new ArrayList<Shape>();
        for(int i=0;i<20;i++)
            shapes.add(new Shape());
        Apply.apply(shapes,Shape.class.getMethod("rotate"));
        Apply.apply(shapes,Shape.class.getMethod("resize", int.class),5);
        List<Square> squares=new ArrayList<Square>();
        Apply.apply(squares,Shape.class.getMethod("rotate"));
        Apply.apply(squares,Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<Shape>(Shape.class,10),Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<Shape>(Shape.class,10),Shape.class.getMethod("r\\e"));
        SimpleQueue<Shape> ShapeQ=new SimpleQueue<Shape>();
        for(int i=0;i<5;i++)
            ShapeQ.add(new Shape());
    }
}


class SimpleQueue<T> implements Iterable<T>{
    private LinkedList<T> storage=new LinkedList<T>();
    public void add(T t){storage.offer(t); }
    public T get(){return storage.poll();}

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}