package Lab_08;

import java.util.ArrayList;

public class returnCart {
    private ArrayList<returnable> Cart;
    
    public returnCart(){
        Cart = new ArrayList<>();
    }
    
    public void add(returnable Item){
        Cart.add(Item);
    }
    
    public void display(){
        for (returnable Item : Cart){
            if(Item instanceof Displayable){
                ((Displayable) Item).displayInfo();
            }
            System.out.println(Item.returnInfo());
            System.out.println("--------------------------------");
        }
    }
}
