import java.util.*;
class Apple{
    private static long counter;
    private long id=counter++;
    public long id(){return id;}
}
class Orange{}
public class AppleAndOrangeWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String...args){
        ArrayList apples=new ArrayList();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
            //Not prevented from adding an Orange to apples;
            apples.add(new Orange());
            for(int a=0;a<apples.size();a++)
                ((Apple)apples.get(i)).id();
            //Orange is detected only at run time
        }
    }
}
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
class GenericsAndUpcasting{
    public static void main(String...args){
        ArrayList<Apple> apples=new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for(Apple c:apples)
            System.out.println(c);
    }
 }
