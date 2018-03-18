class Soap{
    private String s;
    Soap(){
        System.out.println("Soap()");
        s="Constructed";
    }
    public String toString(){return  s;}
}
public class Bath {
    private String//Initializing at point of definition
    s1="happy";
    private String s2="Happy";
    private String s3,s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath(){
        System.out.println("Inside Bath()");
        s3="Joy";
        toy=3.14f;
        castille=new Soap();
    }
    //Instance initialization
    {i=47;}
    public String toString(){
        if(s4==null)//Delayed initialization
            s4="Joy";
        return "s1="+s1+"\n"+"s2="+s2+"\n"+"s3="+s3+"\n"+"s4="+s4+"\n"+"castille="+castille;
    }
    public static void main(String...args){
        Bath b=new Bath();
        System.out.println(b);
    }
}