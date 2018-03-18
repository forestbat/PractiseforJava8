public class GreenhouseControls extends Controller {
    private boolean light=false;
    public class LightOn extends Event{
        public LightOn(long delayTime){super(delayTime);}

        @Override
        public void action() {
            //put hardware control code here to physically turn off the light.
            light=true;
        }
        public String toString(){return "Light is on";}
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){super(delayTime);}
        public void action(){
            //put hardware control code here to physically turn off the light
            light=false;
        }
        public String toString(){return "Light is off";}
    }
    private boolean water=false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){super(delayTime);}
        public void action(){
            //Put hardware control code here
            water=true;
        }
        public String toString(){
            return "Greenhouse water is on";
        }
    }
    public class WaterOff extends Event{
        public WaterOff(long delayTime){super(delayTime);}
        public void action(){
            //put hardware control code here
            water=false;
        }
        public String toString(){return"Greenhouse water is off";}
    }

private String thermostat="Day";
public class ThermostatNight extends Event {
    public ThermostatNight(long delayTime) {
        super(delayTime);
    }

    public void action() {
        //put hardware control code here
        thermostat = "Night";
    }

    public String toString() {
        return "Thermostat on night setting";
    }
}
public static void main(String...args){
GreenhouseControls gc=new GreenhouseControls();
//Instead of hard-wiring you can parse configuration information from a text file here:
    //gc.addEvent(gc.new Bell(900));
}}
