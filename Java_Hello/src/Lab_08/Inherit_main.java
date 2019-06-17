
package Lab_08;

public class Inherit_main {

    public static void main(String[] args) {
        Inherit_clothes Tshirt = new Inherit_clothes("Whit T-Shirt", 1000, 'M', 'R');
        Inherit_pants Pants = new Inherit_pants("Black pants", 1500, 'L', 'R', 'M');
        Inherit_underwear Underwear = new Inherit_underwear("White underwear", 5000, 'S', 'R');
        Inherit_toys Toys = new Inherit_toys("Helicopter", 10000);
        
        Inherit_shoppingCart Cart = new Inherit_shoppingCart();
        returnCart rCart = new returnCart();
        
        Cart.add(Tshirt);
        Cart.add(Pants);
        Cart.add(Underwear);
        //Cart.add(Toys);       //no extend Inherit_frame, so it can't be added. 
        Cart.Inherit_shoppingCart_display();
        
        rCart.add(Tshirt);
        rCart.add(Pants);
        //rCart.add(Underwear);   //no implements returnable, so it can't be added.
        rCart.add(Toys);
        rCart.display();
    }
    
}
