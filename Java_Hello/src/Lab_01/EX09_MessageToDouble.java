package Lab_01;

import javax.swing.JOptionPane;     //導入外部函式

public class EX09_MessageToDouble {
    
    public static void main(String[] args) {
       String Hight_cm;
       Hight_cm = JOptionPane.showInputDialog("Please enter hight(cm)");    //顯示訊息並輸入資料(文字)

       double Hight;
       Hight = Double.parseDouble(Hight_cm);    //String to Double
       System.out.println(Hight);
       
    }
    
}
