import java.math.*;
import java.util.concurrent.atomic.*;
import java.util.*;
//Different types of function objects:
interface Combine<T>{T combine(T x,T y);}
interface UnaryFunction<R,T>{R function(T x);}
interface Collector<T> extends UnaryFunction<T,T>{
    T result();
}
interface UnaryPredicate<T>{boolean test(T x);}
public class Functional {
    //Calls the Combiner object on each element to combine it with a running result,which is finally returned:
    public static <T> T reduce(Iterable<T> seq,Combine<T> combine) {
        Iterator<T> it = seq.iterator();
        if (it.hasNext()) {
            T result = it.next();
            while (it.hasNext())
                result = combine.combine(result, it.next());
            return result;
        }
        return null;
    }
    //Take a function object and call it on each object in the list,ignoring the return value.The function object may act
    //as a collecting parameter,so it is returned at the end
    public static <T> Collector<T> forEach(Iterable<T> seq,Collector<T> func){
        for(T t:seq)
            func.function(t);
        return func;
    }
    //Creates a list of results by calling a function object for each object in the list:
    public static<R,T> List<R> transform(Iterable<T> seq,UnaryFunction<R,T> func){
        List<R> result=new ArrayList<R>();
        for(T t:seq)
            result.add(func.function(t));
        return result;
    }
    //Applies a unary prediate to each item in a sequence,and returns a list items that produced"true";
    public static <T> List<T> filter(Iterable<T> seq,UnaryPredicate<T> pred){
        List<T> result=new ArrayList<T>();
        for(T t:seq)
            if(pred.test(t))
                result.add(t);
        return result;
    }
    //To use the above generic methods,we need to create fuction objects to adapt to out particular needs:
}
