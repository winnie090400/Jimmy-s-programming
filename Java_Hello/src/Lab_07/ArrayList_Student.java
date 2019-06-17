package Lab_07;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayList_Student {
    private String name;
    private ArrayList<Integer> scores;
    private ArrayList<String> subjects;
    
    public final static String strChinese = "Chinese";
    public final static String strEnglish = "English";
    public final static String strMath = "Math";
    
    public void Student_Initial(){
        name = "null";
        
        subjects = new ArrayList();
        subjects.add(strChinese);
        subjects.add(strEnglish);
        subjects.add(strMath);
        
        scores = new ArrayList();
        scores.add(0);
        scores.add(0);
        scores.add(0);
    }
    
    public boolean setName(String name){
        if(name == null || name.length() < 2){
            System.out.println("Name can't be blank or less than two words.");
            System.out.println("Name: " + name);
            return false;
        }
        
        this.name = name;
        return true;
    }
}
