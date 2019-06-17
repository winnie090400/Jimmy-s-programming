package Lab_04;

import java.awt.datatransfer.SystemFlavorMap;

public class Printer {
    
    public void PrintName(Student x){
        String s = x.getFullName();
        System.out.println(s);
    }
    
    public void printNameAndSocre(Student student){
        String str = student.getFullName() + "\t" + student.eng + "\t"+ student.math;   // "\t" 為 tab
        System.out.println(str);
    }
    
    public void printTotalScore(ToolCalculator cal){
        String str = cal.title + "\t" + cal.total;
        System.out.println(str);
    }
    
    public void printAvgScore(ToolCalculator cal){
        String str = cal.title + "\t" + (double)cal.total/(double)cal.count;
        System.out.println(str);
    }
}

