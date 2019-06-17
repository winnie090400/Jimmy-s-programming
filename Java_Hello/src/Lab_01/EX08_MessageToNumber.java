package Lab_01;

import javax.swing.JOptionPane;     //導入外部函式
//其路徑為C:\Program Files\Java\jdk1.8.0_211\src.zip\javax\swing\JOptionPane

public class EX08_MessageToNumber {
    
    public static void main(String[] args) {
        String Name;
        Name = JOptionPane.showInputDialog("Please enter yuor nmae");   //顯示Please enter your name的框架並儲存輸入的文字
        
        String En_Socre;
        En_Socre = JOptionPane.showInputDialog("Please enter English score");  //顯示Please enter English socre的框架並儲存輸入的文字
        
        String Math_Score;
        Math_Score = JOptionPane.showInputDialog("Please enter math socre");    //顯示Please enter math socre的框架並儲存輸入的文字
        
        //String to int
        int e;
        e = Integer.parseInt(En_Socre);     //Transfer char to int
        
        int m;
        m = Integer.parseInt(Math_Score);   //Transfer char to int
        
        int total;
        total = e + m;
        
        System.out.println(Name);
        System.out.println("English:" + En_Socre);
        System.out.println("Math:" + Math_Score);
        System.out.println("Total:" + total);
        
    }
    
}
