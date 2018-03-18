public class ExceptionMethods {
    public static  void main(String...args){
        try{
            throw new Exception("My Exception");
        }catch(Exception e){
            System.out.println("Caught Exception");
            System.out.println("getMessage()"+e.getMessage());
            System.out.println("getLocalizedMessage():"+e.getLocalizedMessage());
            System.out.println("toString()"+e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
            //可以发现每个方法都比前一个提供了更多的信息，实际上，它们每一个都是前一个的超集。
        }
    }
}
