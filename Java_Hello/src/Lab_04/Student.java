package Lab_04;

public class Student {
    String firstName, lastName;
    int eng, math, total;
    
    public String getFullName(){
        String fullName;
        fullName = firstName + " " + lastName;
        return fullName;
    }
}
