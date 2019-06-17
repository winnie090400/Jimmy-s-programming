package Lab_11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ScoreManagement_main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Chinese", 100);
        map.put("English", 80);
        map.put("Math", 70);
        System.out.println("Map " + map);
        System.out.println();
        
        Set<String> keys;
        keys = map.keySet();    //取得所有的 key
        System.out.println("Set " + keys);
        for(String s : keys){
            System.out.println(s);
        }
        System.out.println();
        
        Collection<Integer> values = map.values();
        System.out.println("Collection " + values);
        for(Integer i : values){
            System.out.println(i);
        }
    }
    
}
