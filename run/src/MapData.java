import javafx.util.Pair;

import java.util.LinkedHashMap;

public class MapData<K,V> extends LinkedHashMap<K,V> {
    //A single Pair generator:
    public MapData(Generator<Pair<K, V>> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Pair<K, V> p = gen.next();
            //put(p.key, p.value);
        }
    }

    public MapData(Generator<K> genK, Generator<V> genV, int quantities) {
        for (int i = 0; i < quantities; i++) {
            put(genK.next(), genV.next());
        }
    }

    //A key generator and a single value:
    public MapData(Generator<K> genK, V value, int quantity) {
        for (int i = 0; i < quantity; i++) {
            put(genK.next(), value);
        }
    }

    //An Iterable and a value Generator:
    public MapData(Iterable<K> genK, Generator<V> genV) {
        for (K key : genK)
            put(key, genV.next());
    }

    //An Iterable and a single value:
    public MapData(Iterable<K> genK, V value) {
        for (K key : genK) {
            put(key, value);
        }
    }

    //Generic convenience methods:
    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen, int quantity) {
        return new MapData<K,V>(gen,quantity);
    }
    public static <K,V> MapData<K,V> map(Generator<K> genK,Generator<V> genV,int quantity){
        return new MapData<K,V>(genK,genV,quantity);
    }
}
