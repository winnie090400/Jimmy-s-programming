package Lab_11;

import java.util.HashSet;
import java.util.Set;

public class SetCollection_main {

    public static void main(String[] args) {
        //Set集合 (無順序性、不重複)
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("C++");
        set.add("Python");
        set.add("C#");
        set.add("Java");
        
        System.out.println("Size: " + set.size());
        System.out.println(set);
        
        System.out.println();
        System.out.println("----------用 for 迴圈讀取 Set 集合-----------");
        for(String s : set){    //每次集合讀取一個物件到 s 參考變數
            System.out.println(s);
        }
    }
}
