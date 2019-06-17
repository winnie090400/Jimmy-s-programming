package Lab_01;

public class Practice_main {

    public static void main(String[] args) {
       
       boolean flag = true;
        
       Practice_test test_class = new Practice_test();
        
       while(flag){
           flag = !test_class.Inpurt();
       }
       
       test_class.display();
    }
}