
package Lab_11;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionCombo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        
        putInListAndSet(list);
        putInListAndSet(set);
    }
    
    private static void putInListAndSet(Collection c){
        if(c instanceof List){
            System.out.println("List 有順序性");
        }
        if(c instanceof Set){
            System.out.println("Set 無順序性、不重複");
        }
        c.add("Java");
        c.add("C++");
        c.add("Python");
        c.add("C#");
        c.add("Java");
        System.out.println("size: " + c.size());
        System.out.println(c);
        System.out.println();
    }
}
