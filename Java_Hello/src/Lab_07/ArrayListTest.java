package Lab_07;

import java.util.ArrayList; //import ArrayList function Class

import javax.swing.JOptionPane;

public class ArrayListTest {

    public static void main(String[] args) {
        //Test_1();
        //Test_2();
        //Test_3();
    	
    	int str = JOptionPane.showConfirmDialog(null, "Hello");
    	System.out.print("." + str + ".");
    	str = JOptionPane.showConfirmDialog(null, "Hello");
    	System.out.print("." + str + ".");
    	str = JOptionPane.showConfirmDialog(null, "Hello");
    	System.out.print("." + str + ".");
    }
    
    public static void Test_1(){
        ArrayList a;
        
        a = new ArrayList();
        
        System.out.println("----------------Add data----------------");
        a.add("Apple");
        a.add("Banana");
        a.add("Guava");
        a.add("Pineapple");
        a.add("Watermelon");
        System.out.println(a);  //System.out.println(a.toString());    //print out array a.
        
        System.out.println("----------------Array size----------------");
        System.out.println("size = " + a.size());   //print out the size of array a.
        
        System.out.println("----------------change data----------------");
        int index = 0;
        System.out.println("Index:" + index);
        a.set(index, "Tomato");
        
        System.out.println("----------------get data----------------");
        System.out.println("Index: " + index);
        
        Object obj = a.get(index);
        System.out.println(obj);
        
        System.out.println("----------------Delete data----------------");
        index = 0;
        obj = a.remove(index);
        System.out.println("Index : " + index);
        System.out.println("Get " + obj);
        System.out.println("Size: " + a.size());
        System.out.println(a);
        System.out.println();
        
        index = a.size() - 1;   //Get the last data for the array.
        obj = a.remove(index);
        System.out.println("Index: " + index);
        System.out.println("Get " + obj);
        System.out.print("Size: " + a.size());
        System.out.println(a);
        System.out.println();
        
        System.out.println("----------------Confirm data delete----------------");
        boolean flag;
        obj = "Banana";
        flag = a.remove(obj);
        System.out.println("Obj: " + flag);
        System.out.println("Get the Banana out successful: " + flag);
        System.out.println(a);
        System.out.println();
        
        obj = "Sweetsop";
        flag = a.remove(obj);
        System.out.println("Obj: " + obj);
        System.out.println("Get the Sweetsop out successful: " + flag);
        System.out.println();
        System.out.println("---------------------------------------------------");
        
        
        System.out.println("------------------Use for loop to get the array data------------------");
        a.add("Chinese");
        a.add("English");
        a.add("Math");
        
        for(int i=0; i<a.size(); i++){
            obj = a.get(i);
            System.out.println(obj);
        }
        System.out.println("---------------------------------------------------");
        
        //ArrayList can only use Object data
        ArrayList b;
        b = new ArrayList();
        b.add(new Integer(100));    //The completed way the written in Java.
        b.add(90);                  //Short cut, the type transfer work is done in the function. 
        b.add(80);
        
        for(int i=0; i<b.size(); i++){
            obj = b.get(i);
            System.out.println(obj);
        }
    }
    
    public static void Test_2(){
        //Type limited: Integer.
        ArrayList<Integer> a = new ArrayList<>();   //Force user using int date
        a.add(new Integer(90));
        a.add(95);
        a.add(80);
        //a.add(3.14);  compile failed
        //a.add("Hi");  compile failed
        System.out.println(a.toString());   //also can use System.out.println(a);
        
        System.out.println("----------General for--------------");
        for(int i=0; i<a.size(); i++){
            Integer intObj = a.get(i);          //Read the item i.
            int intValue = intObj.intValue();   //Put the object number into the int cup.
            String str = "The " + a.size() + " of " + i + ": " + intValue;
            System.out.println(str);
        }
        
        System.out.println("----------Evolution for--------------");
        for(int intValue : a){                  //Print out all of the array a as int type.
            System.out.println(intValue);
        }
    }
    
    public static void Test_3(){
        //Type limited: String.
        ArrayList<String> a = new ArrayList<>();
        a.add("Java");
        a.add("C");
        a.add("C++");
        a.add("Python");
        
        System.out.println("----------General for--------------");
        for(int i=0; i<a.size(); i++){
            String str = a.get(i);
            System.out.println(str);
        }
        System.out.println("----------Evolution for--------------");
        for(String str : a){
            System.out.println(str);
        }
    }
}
