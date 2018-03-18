public class Parcel7 {
    public Parcel4.Contents contents(){
        return new Parcel4.Contents(){//insert a class definition
            private int i=11;public int value(){return i;}};
    }
    public static void main(){}//todo
}
/*class Parcel8{
    public Wrapping wrapping
}*/
class Parcel9{
    //Argument must be final to use inside
    //Anonymous inner class
    public Parcel4.Destination destination(final String dest){
        return new Parcel4.Destination(){private String label=dest;public String readLabel(){return label;}};

    }
    public static void main(String...args){}
}