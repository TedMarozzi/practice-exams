import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TwoDHashMap<K1, K2, V> {
    private final HashMap<Pair<K1,K2>, V>valueMap;

    public TwoDHashMap(){
        this.valueMap = new HashMap<>();
    }
    public boolean containsKey(K1 k1, K2 k2){
        return valueMap.containsKey(new Pair<>(k1, k2));
    }

    public V get(K1 k1, K2 k2){
        return valueMap.get(new Pair<>(k1,k2));
    }

    public void put(K1 k1, K2 k2, V v){
        valueMap.put(new Pair<>(k1,k2), v);
    }

    public ArrayList<Pair<K1,K2>> getAllKeys(){
        Set<Pair<K1,K2>> keySet = valueMap.keySet();
        ArrayList<Pair<K1,K2>> pairs = new ArrayList<>();
        for (Pair<K1,K2> pair : keySet){
            pairs.add(pair);
        }
        return pairs;
    }
}
