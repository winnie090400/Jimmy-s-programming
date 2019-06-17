
package Lab_01;

public class EX03_TempTransfer {

    public static void main(String[] args) {
       double countC = 30;    //攝氏
       double countF = 86;    //華氏
       
       System.out.println("攝氏" + countC + " = 華氏" + (countC*(9.0/5.0)+32));
       System.out.println("華氏" + countF + " = 攝氏" + (countF-32)*5/9);       
    }
    
}
