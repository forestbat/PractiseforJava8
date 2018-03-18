public class Burrito {
    SimpleEnumUse.Spiciness degree;
    public Burrito(SimpleEnumUse.Spiciness degree){this.degree=degree;}
    public void describe(){
        System.out.println("This burrito is");
        switch(degree){
            case NOT:System.out.println("not spicy at all");
            break;
            case HOT:System.out.println("Whoosh!");
            break;
            case MILD:
            case MEDIUM:System.out.println("a little hot");
            break;
            case FLAMING:System.out.println("Ooooops!");
            break;
        }
    }
    public static void main(String...args){
        Burrito plain=new Burrito(SimpleEnumUse.Spiciness.HOT);
        Burrito greenChile=new Burrito(SimpleEnumUse.Spiciness.MEDIUM);
        Burrito jalapano=new Burrito(SimpleEnumUse.Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapano.describe();
    }
}
