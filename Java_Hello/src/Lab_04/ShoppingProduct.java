package Lab_04;

public class ShoppingProduct {
    int id, price;
    char color;
    String itemName;
    
    public String toString(){
        String str = id + "\t" + itemName + "\t" + price + "\t";
        
        if(color == 'R'){
            str += "Red ";
        }   else if(color == 'B'){
            str += "Blue ";
        }   else if(color == 'G'){
            str += "Green";
        }   else if(color == 'U'){
            str += "None";
        }
        return str;
    }
    
    public void ShowProduct(ShoppingProduct item){
        String str = item.id + "\t" + item.itemName + "\t" + "$" + item.price + "\t";
        System.out.println(str);
    }
}
