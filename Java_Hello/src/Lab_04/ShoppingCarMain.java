package Lab_04;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ShoppingCarMain {

    public static void main(String[] args) {
        //------------------------------------------------------
        //Creat items & define the prince
        ShoppingProduct item_01 = new ShoppingProduct();
        item_01.id = 1;
        item_01.color = 'U';    //initial color
        item_01.itemName = "Shirts";
        item_01.price = 1300;
        
        ShoppingProduct item_02 = new ShoppingProduct();
        item_02.id = 2;
        item_02.color = 'U';    //initial color
        item_02.itemName = "Pants";
        item_02.price = 3300;
        
        ShoppingProduct item_03 = new ShoppingProduct();
        item_03.id = 3;
        item_03.color = 'U';    //initial color
        item_03.itemName = "Coats";
        item_03.price = 4300;
        
        ShoppingProduct item_04 = new ShoppingProduct();
        item_04.id = 4;
        item_04.color = 'U';    //initial color
        item_04.itemName = "Shoes";
        item_04.price = 6300;
        //------------------------------------------------------
        //show items
        item_01.ShowProduct(item_01);
        item_02.ShowProduct(item_02);
        item_03.ShowProduct(item_03);
        item_04.ShowProduct(item_04);
        System.out.println("--------------------------");
        //------------------------------------------------------
        //select item
        int selectItem = 0;
        String ShowMessage;
        String str = "Please select an item"+"\n"+"1 = Shirts,"+"\t"+" 2 = Pants,"+"\t"+" 3 = Coats,"+"\t"+" 4 = Shoes";
        boolean flag = false;
        
       	while(!flag) {
       		ShowMessage = JOptionPane.showInputDialog(str);
           	System.out.println("Please select an item");
           	System.out.println(" 1 = Shirts" + "\t" + "2 = Pants" + "\t" + "3 = Coats" + "\t " + "4 = Shoes");
           	
           	flag = confirmStr(ShowMessage);
           	if(flag) {
           		selectItem = Integer.parseInt(ShowMessage);
           	}
       	}
       	//------------------------------------------------------
       	//selectColor
       	char selectColor[] = null;
       	flag = false;
       	
       	while(!flag) {
       		ShowMessage = JOptionPane.showInputDialog("Please select a color" + "\n" + "R = Red," + "\t" + "B = Blue," + "\t" + "G = Green");
       		selectColor = new char[ShowMessage.length()];
       		
       		for(int i = 0; i<ShowMessage.length(); i++) {
       			selectColor[i] = ShowMessage.charAt(i);
       		}
       		
       		if(ShowMessage.equals("R") || ShowMessage.equals("G") || ShowMessage.equals("B")) {	
       			flag = !flag;
       		}
       	}
       	flag = false;
       	
       	//------------------------------------------------------       	
        //add to ShoppingCart
       	ShoppingCart cart = new ShoppingCart();
       	
        switch(selectItem){
            case 1:
            	System.out.println("enter switch case 1");
            	item_01.color = selectColor[0];
            	cart.add(item_01);
            	break;
            case 2:
            	System.out.println("enter switch case 2");
            	item_02.color = selectColor[0];
            	cart.add(item_02);
            	break;
            case 3:
            	System.out.println("enter switch case 3");
            	item_03.color = selectColor[0];
            	cart.add(item_03);
            	break;
            case 4:
            	System.out.println("enter switch case 4");
            	item_04.color = selectColor[0];
            	cart.add(item_04);
            	break;
            default:
            	System.out.println("enter switch case default");
            	System.out.println("selectItem = " + selectItem);
            	break;
        }
        cart.displayTotal();
    }
    
    public static boolean confirmStr(String str) {
    	Pattern pattern = Pattern.compile("^([-+]?\\d+)(\\.\\d+)?$");
        return pattern.matcher(str).matches();
    }
}
