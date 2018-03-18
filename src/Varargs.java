
public class Varargs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.println(obj + "");
            System.out.println();
        }
    }
public static void main(String[] args){
            printArray(new Object[]{new Integer(47), new Float(34), new Double(11.11)} );
            printArray(new Object[]{"one","two","three"});
          //  printArray(new Object[]{new A(),newA(),newA()});
        }
}
class A{}