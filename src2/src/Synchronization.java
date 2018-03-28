import java.util.*;

public class Synchronization {
    public void main(String...args){
        Collection<String> c= Collections.synchronizedCollection(new ArrayList<String>());
        List<String> list=Collections.synchronizedList(new ArrayList<String>());

    }
}
