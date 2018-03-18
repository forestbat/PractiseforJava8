package typeinfo.pets;
//import sun.security.smartcardio.SunPCSC;
import java.util.*;
interface Factory<T>{T create();}
class Part{
    public String toString(){
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactories=new ArrayList<Factory<? extends Part>>();
    static {
        //Collections addAll() gives an "unchecked generic array creation...for varrags parameter" warning
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilAirFilter.Factory());
        partFactories.add(new FanBelt.Factory());
       // partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }
    private static Random rand=new Random(47);
    public static Part createRandom(){
        int n=rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}
class Filter extends Part{}
class FuelFilter extends Filter{
    //Create a Class Factory for specific type:
    public static class Factory implements typeinfo.pets.Factory<FuelFilter>{
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
class AirFilter extends Filter{
    public static class Factory implements typeinfo.pets.Factory<AirFilter>{
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
class CabinAirFilter extends Filter{
    public static class Factory implements typeinfo.pets.Factory<CabinAirFilter>{
        public CabinAirFilter create(){
            return new CabinAirFilter();
        }
    }
}
class OilAirFilter extends  Filter{
    public static class Factory implements typeinfo.pets.Factory<OilAirFilter>{
        @Override
        public OilAirFilter create() {
            return new OilAirFilter();
        }
    }
}
class Belt extends Part{}
class FanBelt extends Belt{
    public static class Factory implements typeinfo.pets.Factory<FanBelt>{
        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
class GeneratorBelt extends Belt{
    public static class Factory implements typeinfo.pets.Factory<GeneratorBelt>{
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
public class RegisteredFactories {
    public static void main(StringBuilder[] args){
        for(int i=0;i<20;i++)
            System.out.println(Part.createRandom());
    }
}
