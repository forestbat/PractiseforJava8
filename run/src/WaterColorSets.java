import java.util.EnumSet;
import java.util.Set;

enum WaterColor{
    ZINC,LEMON_YELLOW,MEDIUM_YELLOW,DEEP_YELLOW,ORANGE,CRIMSON,MAGENTA,ROSE_MADDER,VIOLET,PHTHALO_BLUE
}
public class WaterColorSets {
    public static void main(String[] args){
        Set<WaterColor> set1= EnumSet.range(WaterColor.LEMON_YELLOW, WaterColor.DEEP_YELLOW);
        Set<WaterColor> set2=EnumSet.range(WaterColor.ORANGE,WaterColor.ROSE_MADDER);
        System.out.println("set1:"+set1);
        System.out.println("set2:"+set2);
        System.out.println("union(set1,set2):"+Sets.union(set1,set2));
        Set<WaterColor> subset=Sets.intersection(set1,set2);
        System.out.println("intesection(set1,set2)"+subset);
        System.out.println("difference(set1,subset):"+Sets.difference(set1,subset));
        System.out.println("difference(set2,subset):"+Sets.difference(set2,subset));
        System.out.println("complement(set1,set2):"+Sets.complement(set1,set2));
    }
}
