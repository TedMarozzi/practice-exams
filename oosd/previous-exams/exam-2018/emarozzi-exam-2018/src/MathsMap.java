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


    /* Code imported from Callum Johnson Labs pty Ltd. */
    MathsMap<K,V> add(MathsMap<K,V> other){
        MathsMap<K,V> newMap = new MathsMap<>();
        for (K key : map.keySet()){
            newMap.put(key, map.get(key));
        }
        for (K key : other.getMap().keySet()){
            if (!newMap.getMap().containsKey(key)){
                newMap.put(key, other.getMap().get(key));
            }
        }
        return newMap;
    }

    MathsMap<K,V> subtract(MathsMap<K,V> other){
        MathsMap<K,V> newMap = new MathsMap<>();

        for (K key : other.getMap().keySet()){
            map.remove(key);
        }
        return newMap;
    }



}
