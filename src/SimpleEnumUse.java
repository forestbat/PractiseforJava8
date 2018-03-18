public class SimpleEnumUse {
    public static void main(String...args){
        Spiciness howHot=Spiciness.MEDIUM;
        System.out.println(howHot);
    }
    public enum Spiciness{
        HOT,MILD,MEDIUM,FLAMING,NOT
    }
}

