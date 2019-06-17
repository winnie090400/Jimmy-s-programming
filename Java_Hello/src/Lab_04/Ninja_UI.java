package Lab_04;

import javax.swing.JOptionPane;

public class Ninja_UI {
    String selectItem;
    Ninja ninja;
    Ninja_Energy energy;
    boolean flag = true; 
    
    public void showList(){
        String str = "1.Creat a Ninja\n"+
                     "2.Enter Ninja Info\n"+
                     "3.Show Ninja Info\n"+
                     "4.Creat a Dabuwan\n"+
                     "5.Enter Dabuwan Info\n"+
                     "6.Show Dabuwan Info\n"+
                     "7.Eat Dabuwan\n"+
                     "8.SplitUp\n"+
                     "9.Exit";
        selectItem = JOptionPane.showInputDialog(str);
    }
    
    public void creatNinja(){
        if(ninja == null){  //make sure ninja heven't been used
            ninja = new Ninja();
            JOptionPane.showMessageDialog(null," Ninja created");
        }   else{
            JOptionPane.showMessageDialog(null, "Ninja has been created");
        }
    }
    
    public void enterNinjaInfo(){
        if(ninja == null){
            JOptionPane.showInputDialog(null, "Can't fine Ninja, please creat a Ninja first.");
            return;
        }
        ninja.Name = JOptionPane.showInputDialog("Enter Ninja's name");
        
    }
    
    public void showNinjaInof(){
        ninja.showInfo();
    }
    
    public void creatDabuwan(){
        if(energy == null){
            energy = new Ninja_Energy();
            JOptionPane.showMessageDialog(null," Dabuwan created");
        }   else{
            JOptionPane.showMessageDialog(null," Dabuwan has been created");
        }
    }
    
    public void SelectActive(){
        switch(selectItem){
            case "1":
                creatNinja();
                flag = true;
                break;
            case "2":
                enterNinjaInfo();
                flag = true;
                break;
            case "3":
                showNinjaInof();
                flag = true;
                break;
            case "4":
                creatDabuwan();
                flag = true;
                break;
            case "5":
                energy.enterDabuwanInfo();
                flag = true;
                break;
            case "6":
                energy.displayDabuwanInfo();
                flag = true;
                break;
            case "7":
                ninja.getEntrgy(energy);
                flag = true;
                break;
            case "8":
                ninja.splitUp();
                flag = true;
                break;
            case "9":
                flag = false;
                JOptionPane.showMessageDialog(null, "Exit");
                break;
            default:
                break;
        }
    }
}
