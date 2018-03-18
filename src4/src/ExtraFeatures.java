class MyException2 extends Exception{
    private  int x;
   // private int i;
    public MyException2(){}
    public MyException2(String mag){super(mag);}
    public MyException2(String mag,int x){super(mag);this.x=x;}
    public int val(){return x;}
    public String getMessage(){
        return "detail message:"+x+""+super.getMessage();
    }
}
public class ExtraFeatures {
    public static void f() throws MyException2{
        System.out.println("Throwing MyException2 from f()");
        throw new MyException2();
    }
    public static void g() throws MyException2{
        System.out.println("Throwing MyException from g()");
  //      throw new MyException2();
    }
    public static void h() throws MyException2{
        System.out.print("Throwing Exception from h()");
        throw new MyException2("Originated in h()",47);
    }
    public static void main(String...args){
        try{
            f();
        }catch(Exception e){e.printStackTrace();}
        try{
            g();
        }catch(Exception e){e.printStackTrace();}
        try{
            h();
        }catch(Exception e){e.printStackTrace();/*System.out.println("e.val()="+e.val());*/}
    }
}
