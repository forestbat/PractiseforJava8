import java.util.*;
public class ListSortSeach {
    public void main(String...args){
        List<String> list=new ArrayList<String>();
        list.addAll(Utilities.list);
        System.out.println(list);
        Collections.shuffle(list,new Random(47));
        System.out.println(list);
        //use a ListIterator to trim off the last elements:
        ListIterator<String> it=list.listIterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
        System.out.println(list);
        Collections.sort(list);
        String key=list.get(7);
        int index=Collections.binarySearch(list,key);
        System.out.println(key+index+list.get(index));
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);

    }
}
