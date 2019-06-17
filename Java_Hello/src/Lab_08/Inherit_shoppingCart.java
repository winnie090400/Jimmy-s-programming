package Lab_08;

import java.util.ArrayList;

public class Inherit_shoppingCart {
    private ArrayList<Inherit_frame> clothing;
    private int total;
    
    public Inherit_shoppingCart(){
        clothing = new ArrayList<>();
        total = 0;
    }
    
    public void add(Inherit_frame T){
        total += T.getPrice();
        clothing.add(T);
    }
    
    public void Inherit_shoppingCart_display(){
        for(Inherit_frame T: clothing){
            T.Inherit_display();
            System.out.println("-------------------------------");
        }
        System.out.println("Total: " + total);
        System.out.println("-------------------------------");
    }
}
