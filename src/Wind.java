enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;//etc.
}
class Instrument{
    public void play(Note n){
System.out.println("Instrument.play()");
    }
}
public class Wind extends Instrument {
    public static void main(Instrument i){
        i.play(Note.MIDDLE_C);
    }
}
class Music{
    public static void tune(Instrument i){
        //
    }
}