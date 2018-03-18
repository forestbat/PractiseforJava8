class Waveform{
    private static long counter;
    private final long id=counter++;

    @Override
    public String toString() {
        return "Waveform"+id;
    }
}
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}
class Lowpass extends Filter{
    double cutoff;
    public Lowpass(double stuff){this.cutoff=cutoff;}

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
 class Highpass extends Filter{
    double cutoff;
     public Highpass(double stuff){this.cutoff=cutoff;}

     @Override
     public Waveform process(Waveform input) {
         return input;
     }
 }
 class BandPass extends Filter{
    double lowCutoff,highCutoff;
    public BandPass(double lowCut,double highCut){
        lowCutoff=lowCut;
        highCutoff=highCut;
    }
 }