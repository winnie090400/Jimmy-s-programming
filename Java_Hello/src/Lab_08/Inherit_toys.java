package Lab_08;

public class Inherit_toys implements returnable, Displayable{
    
    private String Name;
    private int Price;
    
    public Inherit_toys(String Name, int Price) {
        this.Name = Name;
        this.Price = Price;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Name\t" + Name);
        System.out.println("Price\t" + Price);
    }
    
    @Override
    public String returnInfo(){
        return "Toys returnable in 1 days";
    }
    
    
}
