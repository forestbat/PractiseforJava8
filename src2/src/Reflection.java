import java.lang.reflect.*;
import java.util.*;
enum Explore{HERE,THERE}
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass){
        System.out.print("interfaces");
        for(Type t:enumClass.getGenericInterfaces())
            System.out.print(t);
        Set<String> methods=new TreeSet<String>();
        for(Method m:enumClass.getMethods())
            methods.add(m.getName());
        return methods;
    }
}
