class Homer {
    char doh(char c){
        System.out.println("doh(char)");
          return 'd';}
          float doh(float f) {
              System.out.println("doh(float)");
              return 1.0f;
          }
          }
          class Milhouse{}
          class Cart extends Homer{
          void doh (Milhouse milhouse){
            System.out.println("doh(Milhouse)");
        }
    }
public class Hide {
        public static void main(String...args) {
            Cart c = new Cart();
            c.doh(1);
            c.doh('x');
            c.doh(1.0f);
            c.doh(new Milhouse());
        }
    }

