import java.nio.*;
import java.util.*;
/*class RandomWords implements Readable{
    private static Random rand=new Random(47);
    private static char[] capitals="ABCXYZ".toCharArray();
    private static char[] lowers="abcxyz".toCharArray();
    private static char[] vowels="aeiou".toCharArray();
    private int count;
    public RandomWords(int count){this.count=count;}
    public int read(CharBuffer cb){
        if(count--==0)
            return -1;//Indicates end of input
        cb.append(capitals[rand.nextInt(capitals.length)]);
        cb.append(lowers[rand.nextInt(lowers.length)]);
        for(int i=0;i<4;i++){
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append("");
        return 10;
    }
    public static void main(String...args){
        Scanner s=new Scanner(new RandomWords(10));
        while (s.hasNext())
            System.out.println(s.next());
    }
}*/
class RandomDoubles{
     private static Random rand=new Random(47);
     public double next(){return rand.nextDouble();}
     public static void main(String...args){
         RandomDoubles rd=new RandomDoubles();
         for(int i=0;i<7;i++)
             System.out.println(rd.next()+"");
     }
}
 class AdaptedRandomDoubles extends RandomDoubles implements Readable {
    private int count;
    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1;
        String result = Double.toString(next()) + "";
        cb.append(result);
        return result.length();
    }
    public static void main(String...args){
             Scanner s = new Scanner(new AdaptedRandomDoubles(7));
             while(s.hasNextDouble())
                 System.out.println(s.nextDouble()+"");
         }
}
