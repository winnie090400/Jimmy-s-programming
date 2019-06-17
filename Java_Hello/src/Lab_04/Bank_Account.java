package Lab_04;

import javax.swing.JOptionPane;

public class Bank_Account {
    String Id;
    long balance;
    
    public void deposit(int amount){
        balance += amount;
        JOptionPane.showMessageDialog(null, "Saveing successful");
    }
    
    public void withdraw(int amount){
        balance -= amount;
        JOptionPane.showMessageDialog(null, "Withdea successful");
    }
    
    public void transfer(Bank_Account trans_out_acc, Bank_Account trans_in_acc, int transMoney){
        if(transMoney > trans_out_acc.balance){
            JOptionPane.showMessageDialog(null, "Insufficient Balance\n" + "Please check your balance");
        }else{
            trans_out_acc.balance -= transMoney;
            trans_in_acc.balance += transMoney;
            JOptionPane.showMessageDialog(null, "Transfer successful");
        }
    }
    
    public void displayAccountInfo(Bank_Account acc1, Bank_Account acc2, String str){
        str += acc1.Id + " Balance: $" + acc1.balance + "\n"
             + acc2.Id + " Balance: $" + acc2.balance;
        
        JOptionPane.showMessageDialog(null, str);
    }
    
    public void displayAccountInfo(Bank_Account acc1, String str){
        str += acc1.Id + " Balance: $" + acc1.balance;
        JOptionPane.showMessageDialog(null, str);
    }
}
