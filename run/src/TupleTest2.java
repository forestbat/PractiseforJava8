
class TupleTest2 {
    static TwoTuple<String,Integer> f(){
        return Tuple.twoTuple("hi,47",0);
    }
    static TwoTuple f2(){return Tuple.twoTuple("hi,47",47);}
    static ThreeTuple<Amphibian,String,Integer> h(){
        return Tuple.threeTuple(new Amphibian(),"hi",37);
    }
    static FourTuple<Vehicle,Amphibian,String,Integer> g(){
        return Tuple.fourTuple(new Vehicle(),new Amphibian(),"1",0);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> i(){
        return Tuple.fiveTuple(new Vehicle(),new Amphibian(),"0000",90,0.84);
    }
}