import java.util.Formatter;

public class Receipt {
    public double total=0;
    private Formatter f=new Formatter(System.out);
    public void printTitle(){
        f.format("%-15s %5s %10s\n","Item","Qty","Price");
        f.format("%-15s %5s %10s\n","......","......","......");
    }
    public void print(String name,int qty,double price){
        f.format("%15s.15s %5s %10.2f\n",name,qty,price);
        total+=price;
    }
    public void printTotal(){
        f.format("ooo","bruce eckel is silly");
    }
    public static void main(String[] args){
        Receipt receipt=new Receipt();
        receipt.print("1",1,0);
    }
}
