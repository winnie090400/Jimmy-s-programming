package Lab_01;

import javax.swing.JOptionPane;

public class Challenge_01 {

    public static void main(String[] args) {
        //Input ºF to °C
        String tempC;
        int transC;
        
        tempC = JOptionPane.showInputDialog("Please enter °C"); //顯示訊息並擷取輸入資料
        
        transC = Integer.parseInt(tempC);   //將temp文字轉為int
        System.out.println("°C = " + transC + " , ºF = " + (transC*(9.0/5.0)+32));
       }
    
}
