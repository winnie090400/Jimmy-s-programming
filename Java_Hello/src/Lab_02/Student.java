package Lab_02;

import javax.swing.JOptionPane;

public class Student {
    //Student類別
    String name;
    int eng;
    int math;
    
    //funtion
    public void display() {
        int total;
        total = this.eng + this.math;
        
        double avg = total/2D;
        
        System.out.print(this.name);
        System.out.print("\t");
        System.out.print(this.eng);
        System.out.print("\t");
        System.out.print(this.math);
        System.out.print("\t");
        System.out.print(total);
        System.out.print("\t");
        System.out.println(avg);
    }
    
    public void input(){
        String name, eng, math;
        
        name = JOptionPane.showInputDialog("Name");
        eng = JOptionPane.showInputDialog("eng");
        math = JOptionPane.showInputDialog("math");
        
        this.name = name;
        this.eng = Integer.parseInt(eng);
        this.math = Integer.parseInt(math);
    }
}
