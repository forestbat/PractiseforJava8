enum Shrubbery{GROUND,CRAWLING,HANGING}
public class EnumClass {
    public static void main(String...args){
        for(Shrubbery s:Shrubbery.values()){
            System.out.print(s.ordinal());
            System.out.print(s.compareTo(Shrubbery.CRAWLING));
            System.out.print(s.equals(Shrubbery.CRAWLING));
            System.out.print(s==Shrubbery.CRAWLING);
            System.out.print(s.getDeclaringClass());
            System.out.print(s.name());
        }
        //Produce an enum value from a string name:
        for(String s:"HANGING CRAWLING GROUND".split("")){
            Shrubbery shrub=Enum.valueOf(Shrubbery.class,s);
            System.out.print(shrub);
        }
    }
}
enum OzWitch{
    //Instances must be defined first,before methods:
    WEST("Miss Gulth,aka the Wicked Wtich of the West"),
    NORTH("Glinda,the Good Witch of the Witch"),
    EAST("Wicked Witch of the east,wearer of the Ruby"+"Slippers,crushed by Dorothy's house"),
    SOUTH("Good by inference,but missing");
    private String description;
    //Constructor must be package or private access:
    private OzWitch(String description){
        this.description=description;
    }
    public String getDescription(){return description;}

}