import java.util.HashMap;
import java.util.Iterator;

public class MathsMap<K,V> implements Mathematical<MathsMap<K,V>> {

    private HashMap<K,V> map;

    public void setMap(HashMap<K, V> map) {
        this.map = map;
    }

    public HashMap<K, V> getMap() {
        return map;
    }

    public void put(K key, V value)
    {
        map.put(key, value);


    }

    public void remove(K key)
    {
        map.remove(key);
    }

    MathsMap<K, V> add(MathsMap<K, V> other)
    {



    }



}
