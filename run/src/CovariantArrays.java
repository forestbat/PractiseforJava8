class Fruit{}
class AnApple extends Fruit{}
class Jonathan extends AnApple{}
class AnOrange extends Fruit{}
public class CovariantArrays {
    public static void main(String...main){
        Fruit[] fruit=new AnApple[10];
        fruit[0]=new AnApple();
        fruit[1]=new Jonathan();
        //Runtime type is Apple[],not Fruit or Orange[];
        try{
            //Compiler allows you to add fruit;
            fruit[0]=new Fruit();//Arrays Store Exception
        }catch(Exception e){System.out.println(e);}
        try{
            //Compiler allows you to add Oranges
            fruit[0]=new AnOrange();//Arrays Store Exception
        }catch (Exception e){System.out.println(e);}
    }
}
