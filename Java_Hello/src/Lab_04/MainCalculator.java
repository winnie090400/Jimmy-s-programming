package Lab_04;

public class MainCalculator {

    public static void main(String[] args) {
        Student a = new Student();
        a.firstName = "Jimmy";
        a.lastName = "hsu";
        a.eng = 98;
        a.math = 80;
        
        Student b = new Student();
        b.firstName = "Monica";
        b.lastName = "chen";
        b.eng = 100;
        b.math = 30;
        
        ToolCalculator ec = new ToolCalculator();
        
        ec.title = "English Total Score";
        ec.addScore(a.eng); //可寫System.out.println(calculator.addScore(a.eng));直接輸出
        ec.addScore(b.eng); //可寫System.out.println(calculator.addScore(b.eng));直接輸出
        
        ToolCalculator mc = new ToolCalculator();
        mc.title = "English Total Score";
        mc.addScore(a.math);
        mc.addScore(b.math);
        
        Printer ptr = new Printer();
        ptr.printNameAndSocre(a);
        ptr.printNameAndSocre(b);
        ptr.printTotalScore(ec);
        ptr.printTotalScore(mc);
        ptr.printAvgScore(ec);
        ptr.printAvgScore(mc);
        
    }
    
}
