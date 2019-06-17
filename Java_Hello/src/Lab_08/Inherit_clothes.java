package Lab_08;

public class Inherit_clothes extends Inherit_frame implements returnable, Displayable{
   public Inherit_clothes(String Name, int Price, char Size, char Color){
       //Inherit_frame(Name, Price, Size, Color);   //原型
       super(Name, Price, Size, Color);             //執行副類別建構子
   }
   
   @Override
   public String returnInfo(){
       return "Clothes returnable in 3 days.";
   }
   
   @Override
   public void displayInfo(){
       System.out.println("Id\t" + getId());
       System.out.println("Name\t" + getName());
       System.out.println("Price\t" + getPrice());
       System.out.println("Size\t" + getSize());
       System.out.println("Color\t" + getColor());
   }
}
