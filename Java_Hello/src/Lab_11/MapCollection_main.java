package Lab_11;

import java.util.HashMap;
import java.util.Map;

public class MapCollection_main {

    public static void main(String[] args) {
        //Map<Key, Value>
        Map<String, String> m = new HashMap<>();
        m.put("Steve", "iPhone");           //使用 put(key, value) 建立資料
        m.put("Bill", "Windows 10");
        System.out.println(m);
        System.out.println(m.get("Bill"));  //使用 get(key) 取得配對資料 value
        
        System.out.println();
        
        m.put("Bill", "Xbox");  //重新設定 "Bill" 所配對的值為 "Xbox"
        System.out.println(m);
        System.out.println(m.get("Bill"));
        System.out.println();
        
        Map<Integer, String> m2 = new HashMap<>();  //宣告 key 是 Integer, value 是 String
        m2.put(100, "中正區");
        m2.put(103, "大同區");
        System.out.println(m2);
        System.out.println(m2.get(100));
    }
    
}
