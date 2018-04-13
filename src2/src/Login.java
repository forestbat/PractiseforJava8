import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Login implements Serializable{
    private Date date=new Date();
    private String username;
    private transient String password;
    public Login(String name,String pwd){
        username=name;
        password=pwd;
    }
    public String toString(){
        return "logo info:"+username+date+password;
    }
    public static void main(String...args) throws Exception{
        Login a=new Login("hulk","myliitlepony");
        System.out.print(a);
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Login.out"));
        o.writeObject(a);
        o.close();
        TimeUnit.SECONDS.sleep(1);//Delay
        //Now get them back:
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("Login.out"));
        System.out.print(new Date());
        a=(Login)in.readObject();
        System.out.print(a);
    }

}
