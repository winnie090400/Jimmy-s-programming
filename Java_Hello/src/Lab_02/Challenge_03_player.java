
package Lab_02;

import javax.swing.JOptionPane;

public class Challenge_03_player {
    //Player類別
    String name;
    double cm;
    double kg;
    
    //funtion
    public void display() {
        double bmi, hight_m;
        hight_m = this.cm/100;
        bmi = this.kg/(hight_m*hight_m);
        
        System.out.print(this.name);
        System.out.print("\t");
        System.out.print("hight = " + this.cm);
        System.out.print("\t");
        System.out.print("kg = " + this.kg);
        System.out.print("\t");
        System.out.print("bmi = " + bmi);
        System.out.print("\t");
    }
    
    public void input(){
        String name, cm, kg;
        
        name = JOptionPane.showInputDialog("Name");
        cm = JOptionPane.showInputDialog("cm");
        kg = JOptionPane.showInputDialog("kg");
        
        this.name = name;
        this.cm = Double.parseDouble(cm);
        this.kg = Double.parseDouble(kg);
    }
}
