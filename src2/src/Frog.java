import sun.security.krb5.internal.crypto.Des;

class Characteristic{
    private String s;
    Characteristic(String s){
        this.s=s;
        System.out.println("Creating Charateristic"+s);
    }
    protected void dispose(){
        System.out.println("disposing Characteristic" + s);
    }
}
class Description{
    private String s;
    Description (String s){
        this.s=s;
        System.out.println("Creating Description"+s);
    }
    protected void dispose(){
        System.out.println("disposing Description"+s);
    }
}
class LivingCreature{
    private Characteristic p=new Characteristic("is alive");
    private Description t=new Description("Basic Living Creature");
    LivingCreature()
    {System.out.println("LivingCreature()");}
    protected void dispose(){
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}
class Animal extends LivingCreature{
    private Characteristic p=new Characteristic("has heart");
    private Description t=new Description("Animal not Vegetable");
    Animal(){System.out.println("Animal()");}
    protected void dispose(){
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic p=new Characteristic("can live more 1 second" );
    private Description t=new Description("Wearing Glass with black frame");
    Amphibian(){System.out.println("Trousers is high");}
    protected void dispose(){
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian{
    private Characteristic p=new Characteristic("Exciting!");
    private Description t=new Description("Gouliguojia");
    public Frog(){System.out.println("He is Jiangzemin");}
    protected void dispose(){
        System.out.println("He changed China");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String...args){
        Frog frog=new Frog();
        System.out.println("XiXiHaHa!");
        frog.dispose();
    }
}
