package e2018;

import java.util.ArrayList;
import java.util.HashMap;

public class MathsMap<K,V> implements Mathematical<MathsMap<K,V>> {
    private HashMap<K,V> map;

    public MathsMap(){
        this.map = new HashMap<>();
    }

    void put(K key, V value){
        map.put(key,value);
    }
    void remove(K key){
        map.remove(key);
    }

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

    @Override
    public String toString() {
        ArrayList<String> entries = new ArrayList<>();
        for (K key : map.keySet()){
            entries.add(String.format("%s = %s", key.toString(), map.get(key).toString()));
        }
        String outputString = "{";
        for (int i = 0; i < entries.size() - 1; i++){
            outputString = String.format("%s%s, ", outputString, entries.get(i));
        }
        outputString = String.format("%s}", outputString);
        return outputString;
    }

    public HashMap<K, V> getMap() {
        return map;
    }
}
