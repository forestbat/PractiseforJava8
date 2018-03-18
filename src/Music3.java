enum DNote{
    MIDDLE_C,C_SHARP,B_FLAT;//etc.
}
class DInstrument{
    void play(Note n){
        System.out.println("Instrument.play()"+n);
    }
String what(){return "Instrument";}
void adjust(){System.out.println("Adjusting Stringed");}
}
class DWind extends DInstrument{
    @Override
    void play(Note n) {
        System.out.println("Wind.play()+n");
    }
    String what(){return"Wind";}
    void adjust(){System.out.println("Adjusted Winds");}
}
class Percussion extends DInstrument{
    void play(Note n){System.out.println("Percussion.play()");}
    void adjust(){System.out.println("Adjusting percussion");}
    String what(){return "Percussion";}
}
class Brass extends DInstrument{
    void play(Note n){System.out.println("Brass.play()"+n);}
    void adjust(){System.out.println("Adjusting Brass");}
}
class Wind3 extends DWind{
    void play(Note note){System.out.println("Woodwind.play()"+note);}
    String what(){return "WoodWind";}
}

public class Music3 {
    //Doesn't care about the type,so new types added to the system still work right;
    public static void tune(DInstrument i){i.play(Note.MIDDLE_C);}
    public static void tuneAll(DInstrument []e){for(DInstrument i:e) tune (i);}
    public static void main(String...args){
        DInstrument[] orchestra={new DWind(),new Percussion(),new Brass(),new Wind3()};
        tuneAll(orchestra);

    }
}
