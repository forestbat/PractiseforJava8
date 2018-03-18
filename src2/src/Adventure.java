interface CanFight{
    void fight();
}
interface  CanSwin{
    void swim();
}
interface CanFly{
    void fly();
}
class  ActionCharacter {
public void fight(){}
}
class Hero extends ActionCharacter implements CanFight,CanSwin,CanFly{
    public void swim(){}
    public void fly(){}
}
public class Adventure {
    public static void t(CanFight x){x.fight();}
    public static void u(CanSwin x){x.swim();}
    public static void v(CanFly x){x.fly();}
    public static void w(ActionCharacter x){x.fight();}
    public static void main(String...Args){
        Hero h=new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
