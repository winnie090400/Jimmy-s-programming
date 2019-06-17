package Lab_04;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Bank_UI {
    private Bank_Customer cust;     //目前操作用戶
    private Bank_Account current_account;   //目前操作帳戶
    private String selectItem;
    
    public void starting(){   //starting banking
        selectItem = "";
        while(!selectItem.equals("9")){
            Serves_Selectlist();//select a serves
            Serves_ActiveServes();//run the item
        }
    }
    
    private void Serves_Selectlist(){
        String str = "1.Create an customer ID\n"
                    +"2.Create an account\n"    
                    +"3.Select an account\n"
                    +"4.Deposit\n"
                    +"5.Withdraw\n"
                    +"6.Transfer\n"
                    +"7.Show account infomation\n"
                    +"9.Exit";
        
        do{
            selectItem = JOptionPane.showInputDialog(str);
            if(selectItem == null){
                JOptionPane.showMessageDialog(null, "Want to exit, enter 9.");
            }
        }while(selectItem == null);
    }
    
    private void Serves_ActiveServes(){
        switch(selectItem){
            case "1":
                Serves_createCust();        //create a customer
                break;
            case "2":
                Serves_createAccount();     //create a account
                break;
            case "3":
                Serves_selectAccount();     //select account
                break;
            case "4":
                Serves_deposit();           //Saving serves
                break;
            case "5":
                Serves_withdraw();          //Withdraw serves
                break;
            case "6":
                Serves_transfer();          //Transfer serves
                break;
            case "7":
                Serves_showAccountInfo();   //show account iofo
                break;
            case "9":
                JOptionPane.showMessageDialog(null, "Thank you for using our serves");  //exit
                break;
            default:
                JOptionPane.showMessageDialog(null, "No serves of yor selection: " + selectItem);
                break;
        }       
    }
    
    private void Serves_createCust(){
        if(cust == null){
            cust = new Bank_Customer();
            String str;
            int IdNum;
            
            do{
                str = JOptionPane.showInputDialog("Your ID number : ");
                if(str == null) {
                	selectItem = "";
                	cust = null;
                	return;
                }else if(isNumeric(str)){
                    IdNum = Integer.parseInt(str);
                    break;    
                }
            }while(true);
             
            cust.id  = IdNum;
            cust.name = JOptionPane.showInputDialog("Your name : ");
            JOptionPane.showMessageDialog(null, "Create customer\n" + "ID: " + cust.id + "\n" + "Name: "+ cust.name);
            
        }   else{
            JOptionPane.showMessageDialog(null, "Customer created");
        }
    }
    
    private void Serves_createAccount(){
    	//when the cancel button press down
    	if(!selectItem.equals("2")) {
    		return;
    	}
    	
    	String firstDeposit;
    	int deposiNum;
        
        if(cust == null){
            JOptionPane.showMessageDialog(null, "No customer ID can be used\n"
                                               +"Please create a customer ID first");
            selectItem = "";
            return;
        }
    	
        //create account, maximum 2 accounts.
    	if(cust.account1 == null) {
    		cust.account1 = new Bank_Account();
    		cust.account1.Id = "ACC01";
    		do {
                    firstDeposit = JOptionPane.showInputDialog("Account ID: " + cust.account1.Id + "\n" + 
                                                               "Make an initial deposit");
                    if(firstDeposit == null) {
                        cust.account1 = null;
	    		selectItem = "";
	    		return;
                    }else if(isNumeric(firstDeposit)){
                        deposiNum = Integer.parseInt(firstDeposit);
		    	if(deposiNum < 1000) {
                            JOptionPane.showMessageDialog(null, "Initial must over 1000");
		    	}else {
                            cust.account1.balance += deposiNum;
                            current_account = cust.account1;
                            JOptionPane.showMessageDialog(null, "Current using account1");
                            break;
		    	}
		    }
    		}while(true);
    	}else if(cust.account2 == null){
            cust.account2 = new Bank_Account();
    		cust.account2.Id = "ACC02";
    		do {
    			firstDeposit = JOptionPane.showInputDialog("Account ID: " + cust.account2.Id + "\n" + 
                                                                   "Make an initial deposit");
    			if(firstDeposit == null) {
                            cust.account2 = null;
                            selectItem = "";
                            return;
	    		}else if(isNumeric(firstDeposit)){
                            deposiNum = Integer.parseInt(firstDeposit);
                            if(deposiNum < 1000) {
                                JOptionPane.showMessageDialog(null, "Initial must over 1000");
                            }else {
                                cust.account2.balance += deposiNum;
                                current_account = cust.account2;
                                JOptionPane.showMessageDialog(null, "Current using account2");
                                break;
                            }
		    	}
    		}while(true);
        }
    }
    
    private void Serves_selectAccount(){
        if(cust == null){
            JOptionPane.showMessageDialog(null, "Customer has't been created");
            return;
        }else if(cust.account1 == null && cust.account2 == null){
            JOptionPane.showMessageDialog(null, "Account has't been created");
            return;
        }
        
        boolean flag = true;
        
        while(flag){
            String s = "Select account\n";
            
            if(cust.account2 != null){
                s += "1. Account 1\n";
                s += "2. Account 2";
            }else{
                s += "1. Account 1";
            }
                     
            String t = JOptionPane.showInputDialog(s);
        
            if(t == null){
                return;
            }   else if(t.equals("1") && cust.account1 != null){
                current_account = cust.account1;
                flag = false;
                JOptionPane.showMessageDialog(null, "Current using account 1");
            }   else if(t.equals("2") && cust.account2 != null){
                current_account = cust.account2;
                flag = false;
                JOptionPane.showMessageDialog(null, "Current using account 2");
            }   else{
                JOptionPane.showMessageDialog(null, "Unable to find account" + t);
            }
        }
    }
    
    private void Serves_showAccountInfo(){
        if(cust == null){
            JOptionPane.showMessageDialog(null, "Customer has't been created");
            return;
        }else if(cust.account1 == null){
            JOptionPane.showMessageDialog(null, "Account has't been created");
            return;
        }
        
        String str = "ID: " + cust.id + "\n" + cust.name + "\n";
        if(cust.account2 != null){
            current_account.displayAccountInfo(cust.account1, cust.account2, str);
        }else{
            current_account.displayAccountInfo(cust.account1, str);
        }
    }
    
    private void Serves_deposit(){
        if(current_account == null){
            JOptionPane.showMessageDialog(null, "Please select an account");
            return;
        }
        
        String money;
        int Num;
        boolean flag = false;
        
        do{
            money = JOptionPane.showInputDialog("Deposit money amount");
            if(money == null){
                return;
            }   else if(isNumeric(money)){
                    Num = Integer.parseInt(money);
                    if(Num <= 0){
                        JOptionPane.showMessageDialog(null, "Amount must cannot be 0 or less then 0");
                        flag = true;
                    }   else{
                        current_account.deposit(Num);
                        flag = false;
                    }
            }   else{
                JOptionPane.showMessageDialog(null, "Not a correct number");
                flag = true;
            }
        }while(flag);
    }
    
    private void Serves_withdraw(){
        if(current_account == null){
            JOptionPane.showMessageDialog(null, "Please select an account");
            return;
        }
        
        String money;
        int Num;
        boolean flag = false;
        
        do{
            money = JOptionPane.showInputDialog("Withdraw money amount");
            if(money == null){
                return;
            }   else if(isNumeric(money)){
                    Num = Integer.parseInt(money);
                    if(Num <= 0){
                        JOptionPane.showMessageDialog(null, "Amount must cannot be 0 or less then 0");
                        flag = true;
                    }
                    else if(current_account.balance < Num){
                        JOptionPane.showMessageDialog(null, "Insufficient Balance\n" + "Balance: $" + current_account.balance);
                        flag = true;
                    }else{
                        current_account.withdraw(Num);
                        flag = false;
                    }
            }   else{
                JOptionPane.showMessageDialog(null, "Not a correct number");
                flag = true;
            }
        }while(flag);
    }
    
    private void Serves_transfer(){
        if(current_account == null){
            JOptionPane.showMessageDialog(null, "Please select an account");
            return;
        }else if(cust.account2 == null){
            JOptionPane.showMessageDialog(null, "No other account selection");
            return;
        }
        
        String transAcc, transMoney;
        do{
            transAcc = JOptionPane.showInputDialog("Transfer account from: " + current_account.Id + "\n"
                                                 + "to");
            if(transAcc == null){
                return;
            }else if(transAcc.equals(current_account.Id)){
                JOptionPane.showMessageDialog(null, "You can't not transfer to the same account");
            }else if(!transAcc.equals(cust.account1.Id) && !transAcc.equals(cust.account2.Id)){
                JOptionPane.showMessageDialog(null, "Can't not fine the account");
            }else{
                break;
            }
        }while(true);
        
        do{
            transMoney = JOptionPane.showInputDialog("Enter transfer amount");
            if(transMoney == null){
                return;
            }else if(transMoney.equals("0")){
                JOptionPane.showMessageDialog(null, "Incorrect amount");
            }
            else if(!isNumeric(transMoney)){
                JOptionPane.showMessageDialog(null, "Your entry is not number");
            }
            else{
               break;
            }
        }while(true);
        
        int transNum;
        transNum = Integer.parseInt(transMoney);
        
        if(transAcc.equals("ACC01")){
            current_account.transfer(current_account, cust.account1, transNum);
        }else if(transAcc.equals("ACC02")){
            current_account.transfer(current_account, cust.account2, transNum);    
        }
    }
    
    private boolean isNumeric(String value){
        Pattern pattern = Pattern.compile("^[-+]?\\d+$");
        return pattern.matcher(value).matches();
    }

    private void swith() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
