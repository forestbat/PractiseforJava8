public class FixedSizeStack<T> {
    private int index=0;
    private Object[] storage;
    public FixedSizeStack(int size){
        storage=new Object[size];
    }
    public void push(T item){
        storage[index++]=item;
    }
    @SuppressWarnings("unchecked")
    public T pop(){return (T)storage[--index];}
}
class GenericClass{
    private static int SIZE=10;
    public static void main(String...args){
        FixedSizeStack<String> strings=new FixedSizeStack<String>(SIZE);
        for(String s:"ABCD EFG HIJ".split(""))
            strings.push(s);
        for(int i=0;i<SIZE;i++){
            String s=strings.pop();
            System.out.println(s+"");
        }
    }
}
