package Lab_Test;

public class Test_main {

    public static void main(String[] args) {
       //-----------------------------------------------------------------------
       //Confirm the input number is really number or not
       boolean flag = true;
       ToolConfirm confirm = new ToolConfirm();
        
       while(flag){
           flag = !confirm.Inpurt();
       }
       confirm.display();
       //-----------------------------------------------------------------------
       //ji3ji3ji3jij3ij3ij3i
    }
}
