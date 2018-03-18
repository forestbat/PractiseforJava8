import java.util.*;

interface Processor{
    public String name();
    Object process(Object input);
}
class Upcase implements Processor{
    public String name(){return "....";}
    public String process(Object input){
        return((String)input).toLowerCase();
    }
}
/*class Downcase extends Processor{
    String process(Object input){
        return((String)input).toLowerCase();
    }
}
class Splitter extends Processor{
    String process(Object input){
        //the split() argument divides a String into pieces
        return Arrays.toString(((String)input).split(""));
    }
}
*/
public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using processor"+p.name());
        System.out.println(p.process(s));
    }
    public static String s="I'm your father";
    public static void main(String...args){
        process(new Upcase(),s);
        //process(new Downcase(),s);
        //process(new Splitter(),s);
    }
}
abstract class StringProcessor implements Processor{
public String name(){
    return getClass().getSimpleName();
}
public abstract String process(Object input);
public static String s="If she is a bitch" ;
public static void main (String...args){
    Apply.process(new Upcase(),s);
}}

//class FilterAdapter(Filter filter)
