
package Lab_04;

public class ShoppingCart {
    int total = 0;
    
    public void add(ShoppingProduct pd){
        System.out.println("add\t" + pd.toString());
        total += pd.price;
    }
    
    public void displayTotal(){
        System.out.println("Total price $" + total);
    }

}
