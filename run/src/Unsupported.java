import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Unsupported {
    static void test(String msg,List<String> list){
        Collection<String> c=list;
        Collection<String> subList=list.subList(1,8);
        //Copy of the sublist:
        Collection<String> c2=new ArrayList<String>(subList);
        try{c.retainAll(c2);}catch (Exception e){}
    }
}
