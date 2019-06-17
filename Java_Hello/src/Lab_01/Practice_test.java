package Lab_01;

import java.util.regex.Pattern;     //for the Pattern function
import javax.swing.JOptionPane;     //for the JOptionPane function

public class Practice_test {
    String strNum;
    double dNum;
    
    public void display(){
        System.out.println("Your entry is " + this.dNum);
    }
    
    public boolean Inpurt(){
        this.strNum = JOptionPane.showInputDialog("Please enter a number");
        
        if(isNumeric(this.strNum)){
            dNum = Double.parseDouble(strNum);
            return true;
        }
        return false;
    }
    
    //return a boolean to know is a number String or not ( range 0~9 & . )
    public static boolean isNumeric(String value){
        Pattern pattern = Pattern.compile("^([-+]?\\d+)(\\.\\d+)?$");
        return pattern.matcher(value).matches();
    }
    
}