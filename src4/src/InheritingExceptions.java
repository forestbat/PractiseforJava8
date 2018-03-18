class SimpleException extends Exception{}
public class InheritingExceptions {
    public void fa() throws SimpleException{
        System.out.println("Throw SimpleExpection from f()");
        throw new SimpleException();
    }
    public static void main(String...args){
        InstantiationException sed=new InstantiationException();}}
      //  try{
            //sed.fa();
       // }catch (SimpleException e){
            //System.out.println("Caught it!");
      //  }   }}
