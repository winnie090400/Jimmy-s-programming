package Lab_03;

public class Challenge_Student {
    String firstName, lastName;
    
    public void displayFullName(){
        StringBuilder sb = new StringBuilder();
        //String fullName = firstName + " " + lastName;
        String fullName = sb.append(firstName).append(" ").append(lastName).toString();
        
        System.out.println(fullName);
    }
}
