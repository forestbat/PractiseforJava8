import javax.naming.Name;

class Villain{
    private String name;
    protected void set(String nm) {
        name=nm;
    }
    public Villain(String name){
        this.name=name;
    }
    public String toSting(){
        return "I'm a Villain and my name is"+name;
    }
}
public class Orc extends Villain{
    private int OrcNumber;
    public Orc(String name,int OrcNumber){
        super(name);
        this.OrcNumber=OrcNumber;
    }
    public void change(String name,int OrcNumber){
        set(name);
        this.OrcNumber=OrcNumber;
    }
    public String toString(){
        return "Orc"+OrcNumber+":"+super.toString();
    }
    public static void main(String...args){
        Orc orc=new Orc("Limburger",12);
        System.out.println(orc);
        orc.change("Bob",19);
        System.out.println(orc);
    }
}
