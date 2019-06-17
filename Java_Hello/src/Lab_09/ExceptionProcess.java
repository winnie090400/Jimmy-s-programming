package Lab_09;

import javax.swing.JOptionPane;

public class ExceptionProcess {

    public static void main(String[] args) {
        EntryInterface enter = new EntryInterface();
        
        String name = enter.EnterName();
        int balance = enter.EnterBalance();
        
        System.out.println(name);
        System.out.println(balance);
        
        
//        String name = JOptionPane.showInputDialog("Please enter Name");
//        if(name.length() < 2){
//            System.out.println("name.length() < 2");
//        }
//        
//        String str = JOptionPane.showInputDialog("Enter balance");
//        int balance = Integer.parseInt(str);
//        
//        System.out.println(name);
//        System.out.println(balance);
    }
    
}
