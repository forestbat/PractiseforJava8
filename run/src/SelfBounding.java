public class SelfBounding {
}
class SelfBounded<T extends SelfBounded<T>>{
    T element;
    SelfBounded<T> set(T arg){
        element=arg;
        return this;
    }
    T get(){return element;}
}
class A extends SelfBounded<A>{}
class B extends SelfBounded<A>{}
class C extends SelfBounded<C>{C setAndGet(C arg){set(arg);return get();}}
class D {}
//Can't do this
//class E extends SelfBounded<D>{}
//Alas,you can do this,so you can't force the idiom:
class F extends SelfBounded{
    public static void main(String[] args){
        A a=new A();
        a.set(new A());
        a=a.set(new A()).get();
        a=a.get();
    }
}
