package Lab_Test;

public class ConfirmTypeNumber {

    public static void main(String[] args) {
       
       boolean flag = true;
        
       ToolConfirm test_class = new ToolConfirm();
        
       while(flag){
           flag = !test_class.Inpurt();
       }
       
       test_class.display();
    }
}