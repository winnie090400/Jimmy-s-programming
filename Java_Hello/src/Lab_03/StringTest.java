package Lab_03;



public class StringTest {
    
    public static void main(String[] args) {
        //" "字串，只要內容相同，在記憶體中只有一份
        String a = "java";
        String b = "java";
                
        System.out.println("a == b " + (a == b));   //true
        
        String c = new String("java");  //產生一個新字串，位置與上面的不同
        System.out.println("a == c " + (a == c));   //false
        
        //內容是否相同
        //String.equals( 另一個字串 )
        System.out.println("a.equals(c) " + a.equals(c));   //  true
        System.out.println("--------------------------------------------");
    }
    
}
