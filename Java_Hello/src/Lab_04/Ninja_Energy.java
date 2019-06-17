package Lab_04;

import javax.swing.JOptionPane;

public class Ninja_Energy {
    String level;
    int dabuwan;
    
    public void enterDabuwanInfo(){
        String str, strNum;
        
        while(true){
            str = "Dabuwan's level" + "\n" + "1: energy*3" + "\n" + "2: energy*5" + "\n" + "3: energy*10";
            strNum = JOptionPane.showInputDialog(str);
            level = strNum;
            
            if(strNum.equals("1") || strNum.equals("2") || strNum.equals("3")){
                break;
            }
        }
        
        switch(level){
            case "1":
                dabuwan = 3;
                break;
            case "2":
                dabuwan = 5;
                break;
            case "3":
                dabuwan = 10;
                break;
            default :
                break;
        }
        System.out.println("Make a Dabuwan, level:" + level + ", Energy:" + dabuwan);
    }
    
    public void displayDabuwanInfo(){
        System.out.println("Dabuwn level:" + level + ", Energy:" + dabuwan);
    }
}
