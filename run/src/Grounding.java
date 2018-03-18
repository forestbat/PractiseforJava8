import java.util.*;
import java.lang.reflect.*;
public class Grounding {
    protected int number;
    public Grounding(int n){number=n;}
    public String toString(){
        return "Grounding"+number;
    }
}
//Predicting the weather with groundhogs
class Prediction{
    private static Random rand=new Random(47);
    private boolean shadow=rand.nextDouble()>0.5;
    public String toString(){
        if(shadow)
            return "Six more weeks of winter!";
        else return "Early Spring!";
    }
}
class SpringDetector{
    //Use a Groundhog or class derived from Groundhog:
    public static <T extends Grounding> void detectSpring(Class<T> type) throws Exception{
        Constructor<T> ghog=type.getConstructor(int.class);
        Map<Grounding,Prediction> map=new HashMap<Grounding,Prediction>();
        for(int i=0;i<10;i++)
            map.put(ghog.newInstance(i),new Prediction());
        Grounding gh=ghog.newInstance(3);
        if(map.containsKey(gh))
            System.out.println(map.get(gh));
        else System.out.println(gh);
    }
    public static void main(String...args) throws Exception{
        detectSpring(Grounding.class);
    }
}

