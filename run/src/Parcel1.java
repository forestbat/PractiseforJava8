public class Parcel1 {
    private  static class ParcelContents implements Parcel4.Contents {
        private int i=11;
        public int value(){return i;}
    }
    protected static class ParcelDestination implements Parcel4.Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label=whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
        //Nested classes can contain other static elements
        public static void f(){}
        static int x=10;
    }

public static Parcel4.Destination destination(String s){
    return new ParcelDestination(s);
}
public static Parcel4.Contents contents(){
    return  new ParcelContents();
}
public static void main(String[] args){
    Parcel4.Contents c=contents();
    Parcel4.Destination d=destination("Tasmania");}
}