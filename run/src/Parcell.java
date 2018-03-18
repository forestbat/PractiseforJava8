public class Parcell {
    class Contents{
        private int i=11;
        public int value(){return 1;}
    }
    class Destination{
        private String label;
        Destination(String WhereTo){label=WhereTo;}
        String readLabel(){return label;}
    }
    //Using inner classes looks just like using any other ckass ,with in parcell
    public void ship(String dest){
        Contents c=new Contents();
        Destination des=new Destination(dest);
        System.out.println(des.readLabel());
    }
    public static void main(String...args){
        Parcell p=new Parcell();
        p.ship("Tasmania");
    }
}
