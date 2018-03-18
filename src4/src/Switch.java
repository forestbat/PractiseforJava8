class OutOfSwitch{
    private static Switch sw=new Switch();
    public static void f() throws OutOfException1,OutOfException2{}
    public static void main(String...args){
        try{sw.on();f();sw.off();}//Code that can throw exceptions
        catch (OutOfException2 e){System.out.println("OutofExpection2");sw.off();}
        catch (OutOfException1 e){System.out.println("OutofExpection1");sw.on();}
    }
}
class Switch {
    private boolean state=false;
    public boolean read(){return state;}
    public void on(){state=true;System.out.println(this);}
    public void off(){state=false;System.out.println(this);}
    public String toString(){return state?"on":"off";}
}
class OutOfException1 extends Exception{}
class OutOfException2 extends Exception{}


