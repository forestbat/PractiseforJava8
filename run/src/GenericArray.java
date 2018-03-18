public class GenericArray<T>{
    private T[] arrays;
    @SuppressWarnings("unchecked")
    public GenericArray(int sz){
        arrays=(T[])new Object[sz];
    }
    public void put(int index,T item){
        arrays[index]=item;
    }
    public T get(int index){return arrays[index];}
    //Method that exposes the underlying representation:
    public T[] rep(){return arrays;}
    public static void main(String[] args){
        GenericArray<Integer> gai=new GenericArray<Integer>(10);
        //This causes a ClassCastException:
        //Integer[] a=gai.rep();
        //This is OK:
        Object[] oa=gai.rep();
    }
}
