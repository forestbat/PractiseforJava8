import java.util.*;
interface Operation{
    String operation();
    void command();
}
interface Robot{
    String name();
    String model();
    List<Operation> operations();
}
public class SnowRemovalRobot implements Robot {
    private String name;
    public SnowRemovalRobot(String name){this.name=name;}
    public String name(){return name;}
    public String model(){return "SnowBot Series 11";}
    public List<Operation> operations(){
        return Arrays.asList(
                new Operation() {
                    @Override
                    public String operation() {
                        return name + "Can showel snow;";
                        }

                        @Override
                        public void command() {
                        System.out.println(name + "chipping ice");
                        }
                        },
                new Operation() {
                    @Override
                    public String operation() {
                        return name + "Chip ice";
                    }

                    @Override
                    public void command() {
                        System.out.println(name + "chipping ice");
                    }
                },
                new Operation() {
                    @Override
                    public String operation() {
                        return name+"Clear the roof";
                    }

                    @Override
                    public void command() {
                        System.out.println(name+"clearing the roof");
                    }
                });}
        public static void main(String...args){
        //
    }
}
