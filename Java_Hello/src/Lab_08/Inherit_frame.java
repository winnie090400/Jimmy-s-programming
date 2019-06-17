package Lab_08;

//abstract = 抽象class,只能用於被繼承.
public abstract class Inherit_frame {
    private int Id;
    private static int amount;
    private String Name;
    private int Price;
    private char Size, Color;

    //Contructor initial
    public Inherit_frame(String Name, int Price, char Size, char Color) {
        this.Name = Name;
        this.Price = Price;
        this.Size = Size;
        this.Color = Color;
    }
    
    private void CountId(){
        amount += 1;
        Id = amount;
    }
    
    public void Inherit_display(){
        System.out.println("Id\t" + Id);
        System.out.println("Name\t" + Name);
        System.out.println("Price\t" + Price);
        System.out.println("Size\t" + Size);
        System.out.println("Color\t" + Color);
    }
    
    //getter
    public int getId() {
        return Id;
    }

    public static int getAmount() {
        return amount;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public char getSize() {
        return Size;
    }

    public char getColor() {
        return Color;
    }
}
