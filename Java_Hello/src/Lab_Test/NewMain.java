package Lab_Test;

import java.util.Random;
import java.util.ArrayList;

public class NewMain {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> Lottery = new ArrayList();
        for(int i=0; i<42; i++){
            Lottery.add(i+1);
        }
        
        for(int i=0; i<7; i++){
            if(i ==6){
                //System.out.println("The special number = " + "%2d" + Lottery.remove(random.nextInt(Lottery.size())));
                System.out.printf("%s%d\n","The special number = ", Lottery.remove(random.nextInt(Lottery.size())));
            }else{
                //System.out.println("The number " + (i+1) + " of 7 = " + Lottery.remove(random.nextInt(Lottery.size())));
                System.out.printf("%s%d%s%02d\n", "The number ", (i+1), " of 7 = ", Lottery.remove(random.nextInt(Lottery.size())));
            }
        }
    }
}