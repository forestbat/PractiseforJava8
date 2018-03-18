import java.util.*;
//class V<Obkect>{}
//class K<Object>{}
public class SimpleHashMap<K,V> extends AbstractMap<K,V> {
    //Choose a prime number for the hash table size,to achieve a uniform distribution:
    static final int size=997;
    //You can't have a physical array of generics,but you can upcast to one:
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K,V>>[] buckets=new LinkedList[size];
    public V put(K key,V value){
        V oldValue=null;
        int index=Math.abs(key.hashCode())%size;
        if(buckets[index]==null)
            buckets[index]=new LinkedList<MapEntry<K,V>>();
        LinkedList<MapEntry<K,V>> bucket=buckets[index];
        MapEntry<K,V> pair=new MapEntry<K,V>(key,value);
        boolean found=false;
        ListIterator<MapEntry<K,V>> it=bucket.listIterator();
        while(it.hasNext()){
            MapEntry<K,V> pairs=it.next();
            if(pairs.getKey().equals(key)){
                oldValue=pairs.getValue();
                it.set(pair);
                found=true;
                break;
            }
        }
        if(!found)
            buckets[index].add(pair);
        return oldValue;
    }
    public V get(Object key){
        int index=Math.abs(key.hashCode())%size;
        if(buckets[index]==null)return null;
        for(MapEntry<K,V> pairs:buckets[index])
            if(pairs.getKey().equals(key))
                return pairs.getValue();
        return null;
    }
    public Set<Map.Entry<K,V>> entrySet(){
        Set<Map.Entry<K,V>> set=new HashSet<Map.Entry<K,V>>();
        for(LinkedList<MapEntry<K,V>> bucket:buckets){
            if(bucket==null)continue;
            for(MapEntry<K,V> pair:bucket)
                set.add(pair);
        }
        return set;
    }
    public static void main(String...args){
        SimpleHashMap<String,String> m=new SimpleHashMap<String,String>();
        m.putAll(Countries.capitals(25));
    }
}
