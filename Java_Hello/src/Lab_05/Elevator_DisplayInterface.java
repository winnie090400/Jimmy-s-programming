package Lab_05;

import javax.swing.JOptionPane;

public class Elevator_DisplayInterface {
    private Elevator_Information elevator_Info;
    
    public void setElevator(Elevator_Information setElevator){
        
    }
    
    public String showList(String strOption){
        String returnMessage = "";
        String str = "0. Show current floor\n"
                    +"1. Elevator up\n"
                    +"2. Elevator down\n"
                    +"3. Elevator up to the top floor\n"
                    +"4. switch elevators\n"
                    +"9. Stop and open";
        
        returnMessage = JOptionPane.showInputDialog(str);
        return returnMessage;
    }
    
    public void showCurrentFloor(){
        
    }
    
    public void showArrivelFloor(){
        
    }
    
    public void showMessage(String msg){
        
    }
}
