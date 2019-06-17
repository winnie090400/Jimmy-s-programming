package Lab_11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapStudent_student {
    private String name;
    private Map<String, Integer> scoreMap;
    
    public MapStudent_student(){
        this.name = "null";
        this.scoreMap = new HashMap<>();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setScores(String subject, int score){
        this.scoreMap.put(subject, score);
    }
    
    public void displayInfo(){
        Collection<String> subject = scoreMap.keySet();
        Collection<Integer> score = scoreMap.values();
        
        System.out.println("Student: " + this.name);
        for(String str : subject){
            System.out.print(str + "\t");
        }
        System.out.println();
        
        for(Integer value : score){
            System.out.print(value + "\t");
        }
        
//        System.out.println(subject);
//        System.out.println(score);
//        System.out.println();
    }
}
