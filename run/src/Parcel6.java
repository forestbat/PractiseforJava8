public class Parcel6 {
    public Parcel4.Destination destination(String s){
        class PDestination implements Parcel4.Destination{
            private String label;
            private PDestination(String whereTo){
                label=whereTo;
            }
            public String readLabel(){return label;}
        }
    return new PDestination(s);
    }
    public static void main(String...args){
        Parcel6 p=new Parcel6();
        Parcel4.Destination d=p.destination("x");
    }

}
