public class OptTrailArg {
    static void f(int required,String...trailing){
        System.out.println("required:"+required+"");
        for(String s:trailing)
            System.out.println(s+"");
        System.out.println();
    }
    public static void main(String...args){
       f(1,"one");
       f(2,"two");
       f(3);
    }
}
