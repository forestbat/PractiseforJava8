class Grain{
    public String toString(){
        return "Grain";
    }
}
class Wheat extends Grain{
    public String toString(){
        return "Wheat";
    }
}
class Mill{
    Grain process(){return new Grain();}
}
class WheatMill extends Mill{
    Wheat process(){return new Wheat();}
}

public class CovariantReturn {
    public static void main(String...args){
        Mill a=new Mill();
        Grain g=a.process();
        System.out.println(g);
        a=new WheatMill();
        g=a.process();
        System.out.println(g);
    }
}
