class Candy{
    static {System.out.println("Loading candy");}
}
class Gum
{
    static {System.out.println("Loading Gum");}
}
class Cookie{
    static {System.out.println("loading cookie");}
}
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("After Class.forName(\"Gum\")");
        }
        System.out.println("Couldn't find Gum");
        new Cookie();
        System.out.println("After creating cookie");
    }
}
