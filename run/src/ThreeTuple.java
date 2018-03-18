class Amphibian{}
class Vehicle{}
class TwoTuple<A,B>{
    private A first;
    private B second;
    public TwoTuple(A a,B b){first=a;second=b;}
   // public
}
public class ThreeTuple<A,B,C> extends TwoTuple{
    private C third;
    public ThreeTuple(A a,B b,C c){
        super(a,b);
        third=c;
    }
}
class FourTuple<A,B,C,D> extends ThreeTuple{
    private D fourth;
    public FourTuple(A a,B b,C c,D d){
        super(a,b,c);
        fourth=d;
    }
}
class FiveTuple<A,B,C,D,E> extends FourTuple{
    private E fifth;
    public FiveTuple(A a,B b,C c,D d,E e){
        super(a,b,c,d);
        fifth=e;
    }
}
class TupleTest{
    static TwoTuple<String,Integer> f(){
        //Autoboxing converts the int into integer:
        return new TwoTuple<String,Integer>("hi",47);
    }
    static ThreeTuple<String,Integer,Amphibian> g(){
        return new ThreeTuple<String, Integer, Amphibian>("hi",47,new Amphibian());
    }
    static FourTuple<String,Integer,Amphibian,Vehicle> h(){
        return new FourTuple<String, Integer, Amphibian, Vehicle>("hi",47,new Amphibian(),new Vehicle());
    }
    static FiveTuple<String,Integer,Amphibian,Vehicle,Double> i(){
        return new FiveTuple<String, Integer, Amphibian, Vehicle, Double>("hi",47,new Amphibian(),new Vehicle(),0.6);
    }
}
