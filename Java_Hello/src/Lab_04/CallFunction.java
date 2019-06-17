package Lab_04;

public class CallFunction {

    public static void main(String[] args) {
        Student a = new Student();
        a.firstName = "Jimmy";
        a.lastName = "hsu";
        
        Student b = new Student();
        b.firstName = "Monica";
        b.lastName = "chen";
        
        Printer p = new Printer();
        p.PrintName(a);
        p.PrintName(b);
    }
    
}
