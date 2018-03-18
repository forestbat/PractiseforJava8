/*enum Note{
    MIDDLE_C,ARTX
}
*/
interface Instrument{
    //Compile-time constant;
    int value=5;//static&final
    //cannot have method definitions
    void play(Instrument n);
    void adjust();
}
class Wind implements Instrument{
    public void play(Instrument n){
        System.out.println(this+".play()"+n);
    }
    public String toString(){return "Wind";}
    public void adjust(){System.out.println(this+".adjust()");}
}
class Percussion implements Instrument{
    public void play(Instrument n){
        System.out.println(this+".play()"+n);
    }
    public String toString(){return "Wind";}
    public void adjust(){System.out.println(this+".adjust()");}
}
class Stringed implements Instrument{
    public void play(Instrument n){
        System.out.println(this+".play()"+n);
    }
    public String toString(){return"Stringed";}
    public void adjust(){System.out.println(this+".adjust()");}
}
class Brass extends Wind{
    public String toString(){
        return "Brass";
    }
}
class Woodwind extends Wind{
    public String toString(){return"Woodwind";}
}
public class Music5 {
    //don't care about type,so new types added to the system still work right
    static void tune(Instrument i){
        i.play(i);
    }
    static void tuneAll(Instrument[] e){
        for(Instrument i: e)
            tune(i);
        //TODO
    }
}
