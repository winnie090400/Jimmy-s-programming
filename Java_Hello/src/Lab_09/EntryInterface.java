package Lab_09;

import javax.swing.JOptionPane;

public class EntryInterface {
    String name;
    int balance;
    
    public String EnterName(){
        while(true){
            this.name = JOptionPane.showInputDialog("Enter your name.");
            if(name.length() <= 2 || name.isEmpty() || name == null){
                JOptionPane.showMessageDialog(null, "Name too short!");
            }else{
                break;
            }
        }
        return this.name;
    }
    
    public int EnterBalance(){
        balance = 0;
        String strBalance;
        while(true){
            strBalance = JOptionPane.showInputDialog("Enter balance.");
            try{
                this.balance = Integer.parseInt(strBalance);
                break;
            } catch(NumberFormatException e){
                System.out.println(e); //顯示被拋出的資訊
                JOptionPane.showMessageDialog(null, "Wrong type of your entry, must be number.");
            }
        }
        return this.balance;
    }
}
