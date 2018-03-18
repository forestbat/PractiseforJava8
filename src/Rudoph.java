public class Rudoph {
    public static void main(String...args){
        for(String pattern:new String[]{
            "Rudolph","[rR]Rudolph","[rR][aeiou][a-z]ol.*","R.*"})
            System.out.println("Rudolph".matches(pattern));
        }
    }

