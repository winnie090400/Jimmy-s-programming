package Lab_11;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ProductSearch_main {

    public static void main(String[] args) {
        ProductSearch_product p1 = new ProductSearch_product("A01", "iPhone", 20_000);
        ProductSearch_product p2 = new ProductSearch_product("A02", "HTC", 30_000);
        ProductSearch_product p3 = new ProductSearch_product("A03", "ASUS", 40_000);
        
        Map<String, ProductSearch_product> map = new HashMap<>();
        map.put("A01", p1);
        map.put("A02", p2);
        map.put("A03", p3);
        
        String id = JOptionPane.showInputDialog("Enter ID for searching.");
        ProductSearch_product p = map.get(id);
        if(p == null){
            JOptionPane.showMessageDialog(null, "Can't find product\n." + id);
        }else{
            JOptionPane.showMessageDialog(null, p);
        }
    }
}
