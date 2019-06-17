package Lab_01;

public class EX04_BMI {

    public static void main(String[] args) {
       double hightCM = 180, weightKG = 73, hightM = hightCM/100;
       System.out.println("身高cm = " + hightCM);
       System.out.println("體重kg = " + weightKG);
       System.out.println("身高m = " + hightCM/100);
       System.out.println("BMI = " + weightKG/(hightM*hightM));
    }    
}
