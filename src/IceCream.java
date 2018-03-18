import java.util.Arrays;
import java.util.Random;

public class IceCream {
    private static Random rand=new Random(47);
    static final String[] FLAVORS={"Chocolate","Strawberry","Mint Chip"};
    public static String[] flavorSet(int n){
        if(n>FLAVORS.length)
            try {
                throw new IllegalAccessException("Set too big");
            }catch (IllegalAccessException e){}
            String[] results=new String[n];
        boolean[] picked=new boolean[FLAVORS.length];
        for(int i=0;i<n;i++){
            int t;
            do t=rand.nextInt(FLAVORS.length);
            while (picked[t]);
                results[i]=FLAVORS[t];
            picked[t]=true;
        }
        return results;
    }
    public static void main(String[] args){
        for(int i=0;i<7;i++)
            System.out.println(Arrays.toString(flavorSet(3)));
    }
}
