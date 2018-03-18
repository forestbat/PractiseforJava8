public class OrdinaryArguments {
    public static void main(String...args){
        SBase base=new SBase();
        DerivedSetter derivedSetter=new DerivedSetter();
        derivedSetter.set(derivedSetter);
        //ds.set(base);
    }
}
class SBase{}
class OrdinarySetter{
    void Set(SBase base){
        System.out.println("OrdinarySetter.set(Base)");
    }
}
class DerivedSetter extends OrdinarySetter{
    void set(DerivedSetter derivedSetter){
        System.out.println("DrivedSetter.set(Derived)");
    }
}