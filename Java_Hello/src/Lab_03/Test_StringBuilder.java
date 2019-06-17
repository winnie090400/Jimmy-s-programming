package Lab_03;

public class Test_StringBuilder {

    public static void main(String[] args) {
        int a = 100, b = 99;
        
        String s1 = "JAVA", s2 = s1 + a + b;    //簡化寫法
        
        
        //字串 + 運算是透過StringBuiler 實現
        //StringBuilger 提供 append() 添加字串 / toString() 產生 String 物件
        StringBuilder sb = new StringBuilder();
        String s3 = sb.append("JAVA").append(a).append(b).toString();
        
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(sb); //   ====>    System.out.println(sb.toString());
    }
}
