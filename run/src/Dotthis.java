public class Dotthis {
    void f(){System.out.println("Dotthis.f()");}
    public class Inner{
        public Dotthis outer(){return Dotthis.this;}//A plain"this"would be Inner's this

}
public Inner inner(){return new Inner();}
public static void main(String...args){
    Dotthis dt=new Dotthis();
    Dotthis.Inner dti=dt.inner();
    dti.outer().f();
    Dotthis dt1=new Dotthis();
    Dotthis.Inner dn1=dt1.new Inner();}
}