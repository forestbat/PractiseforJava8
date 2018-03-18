import java.util.ArrayList;
import java.util.List;

public class ArraysOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String...args){
        List<String>[]ls;
        List[] la=new List[10];
        ls=(List<String>[])la;
        ls[0]=new ArrayList<String>();
        //Compile-time checking produces an error:
        //ls[1]=new ArrayList<Integer>();
        //The problem:List<String> is a subtype of Object
        Object[] objects=ls;
        //Compiles and runs without complaint:
        objects[1]=new ArrayList<Integer>();
        //However,if your needs are straight forward it is possible to create an array of generics,albeit with an "unchecked" warning:
        List<BarylliumSphere>[] spheres=(List<BarylliumSphere>[])new List[10];
        //spheres[i]=new ArrayList<BarylliumSphere>();
    }
}
