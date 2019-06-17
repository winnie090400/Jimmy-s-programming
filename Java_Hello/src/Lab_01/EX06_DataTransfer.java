package Lab_01;
public class EX06_DataTransfer {

    public static void main(String[] args) {
        //整數運算預設採用 int(32-bit)
        byte a = 100, b = 50;
        int c = a + b;
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
        
        b = 20;
        byte d = (byte)(a+b);
        System.out.println(d);
        System.out.println(Integer.toBinaryString(d));
        
        b = 30;
        d = (byte)(a+b);
        System.out.println(d);  //相加結果=130 Byte最大值127 資料失真變-126
        
        /*
        二進位表示:1111=-128,...1110=-2, 1111=-1, 0000=0, 0001=1, 0002=2...0111=127
        */        
        System.out.println(Integer.toBinaryString(d));  //數值轉為二進制字串輸出
        System.out.println(Integer.toOctalString(d));   //數值轉為八進制字串輸出
        System.out.println(Integer.toHexString(d));     //數值轉為十六進制字串輸出
        System.out.println("--------------------------------------"); //分隔線
        
        
        //float 32-bit to int 32-bit
        float f;
        int i;
        double dub;
        
        dub = 2.4;      //數值預設為double型態，可以不在數值後面標註型態
        f = 3.14F;      //f = 3.14  預設是Double型態會編譯失敗
        i = (int)f;     //只取整數3
        System.out.println(i);  //印出結果 = 3
        
        System.out.println("--------------------------------------"); //分隔線
        System.out.println(5/3);    //整數運算
        System.out.println(5%3);    //取餘數
        System.out.println(5.0D/3); //Double浮點數運算
        System.out.println(5.0F/3); //Float浮點數運算
        System.out.println("--------------------------------------"); //分隔線
        
    }
    
}
