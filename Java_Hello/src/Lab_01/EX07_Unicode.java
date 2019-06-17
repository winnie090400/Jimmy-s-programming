package Lab_01;

public class EX07_Unicode {

    public static void main(String[] args) {
        int a = 65;             //16進位 0x41
        System.out.println(a);  //output 65
        
        char b = 'A' + 1;       //'A' = 65
        System.out.println(b);  //output B
        
        char c = 0x2600;        //0x代表16進制，2600為16進制數值
        System.out.println(c);  //輸出為太陽符號
        
        int 數值;
        數值 = 13;
        System.out.println(數值);
        
        /*--------------------------------------------------------------------*/
        
        int d = 0b10;           //0b代表為二進制，b010為二進制數值
        System.out.println(d);  //輸出為2
        
        int e = 010;            //數字前放0為8進制數值
        System.out.println(e);  //輸出為8
        
        int f = 10;             //單純數字為一般10進制數值
        System.out.println(f);  //輸出為10
        
        int g = 0x10;           //數字前放0x為16進制數值
        System.out.println(g);  //輸出為16
        
        /*--------------------------------------------------------------------*/
    }
    
}
