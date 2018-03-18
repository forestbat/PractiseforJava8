class Meal{
    Meal(){System.out.println("Meal()");}
}
class Bread{
    Bread(){System.out.println("Bread()");}
}
class Cheese{
    Cheese(){System.out.println("Cheese()");}
}
class Lecture{
    Lecture(){System.out.println("Lecture()");}
}
class Lunch extends Meal{Lunch(){System.out.println("Lunch()");}
 class PortableLunch extends Lunch{ PortableLunch(){System.out.println("Portable()");}}

    public class Sandwich extends PortableLunch {
        private Bread b = new Bread();
        private Cheese c = new Cheese();
        private Lecture l = new Lecture();

        public Sandwich() {
            System.out.println("Sandwich()");
        }
    }

        public static void main(String...args) {
            //new Sandwich();
        }
    }


