import access.Print;
import java.util.*;
public class Dshape {
    public void draw(){}
    public void erase(){}

}
class DCircle extends Dshape{
    public void draw(){ System.out.println("Circle.draw()");  }
    public void erase(){System.out.println("Circle.erase()");}
}
class Square extends Dshape{
    public void draw(){System.out.println("Square.draw()");}
    public void erase(){System.out.println("Square.erase(");}
}
class DTraingle extends Dshape{
    public void draw(){System.out.println("Traingle.draw()");}
    public void erase(){System.out.println("Traingle.erase()");}
}
class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Dshape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new DCircle();
            case 1:
                return new Square();
            case 2:
                return new DTraingle();

        }
    }
}
/*class Shapes{
            private static RandomShapeGenerator gen=new RandomShapeGenerator();
            public static void main(String...args){
                Dshape []s=new Dshape[9];
                //fill up the array with shapes
                for(int i=0;i<s.length;i++)
                    s[i]=gen.next();
                for(Dshape shp:s)
                    shp.draw();
            }
        }
    }
}*/