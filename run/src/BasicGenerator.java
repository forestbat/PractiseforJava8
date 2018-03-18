public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type){this.type=type;}
    public T next(){
        try{
            //Assume type is a public class:
            return type.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    //Produce a Default generator given a type token:
    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
