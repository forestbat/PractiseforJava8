import java.util.ArrayList;

public class TupleList <A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>>{
    public static void main(String...args){
        TupleList<Vehicle,Amphibian,String,Integer> tl=new TupleList<Vehicle,Amphibian,String,Integer>();
        tl.add(TupleTest.i());
        tl.add(TupleTest.i());
        for(FourTuple<Vehicle,Amphibian,String,Integer>i:tl)
            System.out.println(i);

    }

}
