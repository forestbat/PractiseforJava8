public class WithFinally {
    static Switch sw=new Switch();
    public static void main(String...args){
        try{
            sw.on();
            //Code that can throw exceptions
            OutOfSwitch.f();
        }catch(OutOfException2 o){System.out.println("OutofExpection1");sw.off();}
         catch(OutOfException1 o){System.out.println("OutofExpection2");sw.off();}
         finally{sw.off();}
    }
}
