package Lab_01;

import javax.swing.JOptionPane;

public class Challenge_02 {

    public static void main(String[] args) {
        String hight, weight, bmi;
        double hight_m, weight_kg;
        
        hight = JOptionPane.showInputDialog("Please enter hight");
        weight = JOptionPane.showInputDialog("Please enter weight");
        
        hight_m = Double.parseDouble(hight)/100;
        weight_kg = Double.parseDouble(weight);
        
         System.out.println("BMI = " + weight_kg/(hight_m*hight_m));
    }
    
}
