package Lab_05;

import javax.swing.JOptionPane;

public class Elevator_Controller {
    private Elevator_Information elevator_1, elevator_2, current_elevator;
    private Elevator_DisplayInterface elevator_UI;
    private String Option;
    
    
    public void Controller_Active(){
        Controller_Initial();
        while(isContinue()){
            System.out.println("Start!");
            Run_Action();
        }
    }
    
    public void Controller_Initial(){
        if(elevator_1 == null){
            elevator_1 = new Elevator_Information();
            elevator_1.Infor_setFloor(1);
        }
        if(elevator_2 == null){
            elevator_2 = new Elevator_Information();
            elevator_2.Infor_setFloor(1);
        }
        if(elevator_UI == null){
            elevator_UI = new Elevator_DisplayInterface();
        }
        Option = "";
        current_elevator = elevator_1;
    }
    
    private void Run_Action(){
        Option = elevator_UI.showList(Option);
        
        switch(Option){
            case "0":
                //show current floor
                break;
            case "1":
                //Elevator up
                break;
            case "2":
                //Elevator down
                break;
            case "3":
                //Elevator up to the top floor
                break;
            case "4":
                //switch elevators
                break;
            case "9":
                //Stop and open the door
                break;
        }
    }
    
    private boolean isContinue(){
        if(!Option.equals("9")){
            return true;
        }else{
            return false;
        }
    }
}
