package Lab_03;

import javax.swing.JOptionPane;

public class JOtionPane {

    public static void main(String[] args) {
        String a, b;
        a = JOptionPane.showInputDialog("please enter password");
        b = JOptionPane.showInputDialog("Please enter password again");
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        if(a == b){ //判斷是不是同一筆字串，同一個位置
            System.out.println("it's a same string");
        }   else{
            System.out.println("it's not a same string");
        }
        
        if(a.equals(b)){    //判斷字串內的資料是否相同
            System.out.println("it's a same string");
        }   else{
            System.out.println("it's not a same string");
        }
    }
    
}
