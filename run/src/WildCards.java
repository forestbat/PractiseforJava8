class Holder<T>{
    private T value;
    public Holder(){}
    public Holder(T val){value=val;}
    public void set(T val){value=val;}
    public T get(){return value;}
    public boolean equals(Object obj){
        return value.equals(obj);
    }
}

public class WildCards {
    //Raw Argument:
    static void rawArgs(Holder holder, Object arg){
       // holder.set(arg);Warning:
        // Unchecked call to set(T) as a member of the raw type holder
       // holder.set(new WildCards());//Same warning
        //Can't do this;don't have any "T"
       // T t=holder.get();
        //OK,but type information has been lost:
       // Object obj=holder.get();
    }
    //Similar to rawArgs(),but errors instead of warnings:
    static void unboundedArg(Holder<?> holder,Object arg){
        //holder.set(args);
        //set(capture of ?)in Holder<capture of ?> cannot be applied to (Object)
        //holder.set(new WildCards());
    }
    static<T> T exact1(Holder<T> holder){
        T t=holder.get();
        return t;
    }
    static<T> T exact2(Holder<T> holder,T arg){
        holder.set(arg);
        T t=holder.get();
        return t;
    }
    static<T> T wildSubtype(Holder<? extends T> holder,T arg){
       // holder.set(arg);
        //set (capture of ? extends T) in Holder<capture of ? extends T> cannot be applied to T
        T t=holder.get();
        return t;
    }
    static<T> void wildSupertype(Holder<? super T> holder,T arg){
        holder.set(arg);
        //T t=holder.get();//Error:
        //Incompatible types:found Object,required T
        //OK,but type information has been lost:
        Object obj=new Object();
    }
    public void main(String...args){
        Holder raw=new Holder();
        raw=new Holder();
        Holder<Long> qualified=new Holder<Long>();
        Holder<?> unbounded=new Holder<Long>();
        Holder<? extends Long> bounded=new Holder<Long>();
        long lng=1L;
        rawArgs(raw,lng);
        rawArgs(qualified,lng);
        rawArgs(unbounded,lng);
        rawArgs(bounded,lng);
        unboundedArg(raw,lng);
        unboundedArg(qualified,lng);
        unboundedArg(unbounded,lng);
        unboundedArg(bounded,lng);
        //Object r1=exact1(raw);//Warnings:
        //Unchecked conversion from Holder to Holder<T>
        //Unchecked method invocation:exact1(Holder<T>) is applied to (Holder)
        Long r2=exact1(qualified);
        Object r3=exact1(unbounded);
        Long r4=exact1(bounded);
        //Long r5=exact2(raw,lng);
        //TODO
    }
}
