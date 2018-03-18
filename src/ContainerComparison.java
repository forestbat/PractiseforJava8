import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BarylliumSphere {
    private static long counter;
    private long id = counter++;

    public String toString() {
        return "Sphere" + id;
    }
}
public class ContainerComparison {
    public static void main(String...args){
        BarylliumSphere[] spheres=new BarylliumSphere[10];
        for(int i=0;i<10;i++)
            spheres[i]=new BarylliumSphere();
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
        //现在是容器部分
        List<BarylliumSphere> spherelist=new ArrayList<BarylliumSphere>();
        for(int i=0;i<10;i++)
            spherelist.add(new BarylliumSphere());
        System.out.println(spherelist);
        System.out.println(spherelist.get(4));
        int[]integers={0,1,2,3,4,5};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);
        List<Integer> intList=new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
        intList.add(97);

    }
}
