package typeinfo.pets;
class Derived extends Base{}
class Base{}

public class FamilyVsExactType {
    static void test(Object x){
        System.out.println("Testing x of type"+x.getClass());
        System.out.format(" x instanceof Base"+(x instanceof Base));
    }
}
