import java.util.EnumSet;

public class CarWash {
    public enum Cycle{
        UNDERBODY{void action(){System.out.print("spraying the underbody");}},
        WHEELWASH{void action(){System.out.print("washing the wheels");}},
        PREWASH{void action(){System.out.print("loosening the dirt");}};
        abstract void action();
    }
    EnumSet<Cycle> cycles=EnumSet.of(Cycle.UNDERBODY,Cycle.WHEELWASH);
    public void add(Cycle cycle){cycles.add(cycle);}
    public void washCar(){for(Cycle c:cycles) c.action();}
}
