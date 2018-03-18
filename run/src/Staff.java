import java.util.ArrayList;

class Person {
    public String first;
    public String last;
    public String address;

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    public String toString() {
        return "Person:" + first + last + address;
    }
}
class Position {
    private String title;
    private Person person;

    public Position(String jobTitle, Person employee) {
        title = jobTitle;
        person = employee;
        if (person == null){}
           // person=person.equals(Person);
    }
    public Position(String jobTitle){
        title=jobTitle;
        //person = person.null;
    }
    public String getTitle(){return title;}
    public void setTitle(String newTitle){title=newTitle;}
    public Person getPerson(){return person;}
    public void setPerson(Person newPerson){person=newPerson;if(person==null);}//person=Person.NULL}

    @Override
    public String toString() {
        return "Position:"+title+""+person;
    }
}
    public class Staff extends ArrayList<Position> {
    public void add(String title,Person person){
        add(new Position(title,person));
    }
    public void add(String...titles){
        for(String title:titles)
            add(new Position(title));
    }
    public Staff(String...titles){add(titles);}
    public boolean positionAvailable(String title){
        for(Position position:this)
            if(position.getTitle().equals(title)&&position.getPerson()==null)
                return true;
        return false;
    }
    public void fillPosition(String title,Person hire){
        for(Position position:this)
            if(position.getTitle().equals(title)&&position.getPerson()==null){
            position.setPerson(hire);
            return;
            }
            throw new RuntimeException("Position"+title+"not available");}

        public static void main(String[] args){
        Staff staff=new Staff("President","CTO","TestEngineer");
        staff.fillPosition("President",new Person("Me","Last","The Top"));
        if(staff.positionAvailable("Software Engineer"))
            staff.fillPosition("Software Engineer",new Person("Bob","Coder","City"));
        System.out.println(staff);
    }
    }

