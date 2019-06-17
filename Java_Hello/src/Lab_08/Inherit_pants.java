
package Lab_08;

public class Inherit_pants extends Inherit_frame implements returnable, Displayable{
    
    private char Gender;
    
    public Inherit_pants(String Name, int Price, char Size, char Color, char Gender) {
        super(Name, Price, Size, Color);
        this.Gender = Gender;
    }
    
    @Override   //此Function已存在，覆蓋原有的Function
    public void Inherit_display(){
        super.Inherit_display();
        System.out.println("Gender\t" + Gender);
    }
    
    @Override
    public String returnInfo(){
        return "Pants returnable in 7 days.";
    }
    
    @Override
    public void displayInfo(){
       Inherit_display();
    }

    @Override
    public String toString() {
        return "Inherit_pants{" + "Gender=" + Gender + '}';
    }

    public Inherit_pants(char Gender, String Name, int Price, char Size, char Color) {
        super(Name, Price, Size, Color);
        this.Gender = Gender;
    }
}
