//import nu.xom;
public class Person {
    private String first,last;
    public Person(String first,String last){
        this.first=first;
        this.last=last;
    }
    //Produce an XML element from this object:
    public Element getXML(){
        Element person=new Element("person");
        Element firstName=new Element("first");
        //firstName.appendChild(first);
        Element lastName=new Element(last);
        //lastName.appendChild(last);
        //person.appendChild(firstName);
        //person.appendChild(lastName);
        return person;
    }
    //Constructor to restore a Person from an XML Element:
    public Person(Element person){
       // first=person.getFirstChildElemt("first").getValue();
    }
}
