package Lab_11;

public class ProductSearch_product {
    private String id, name;
    private int price;
    
    public ProductSearch_product(String id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nPrice: " + price;
    }
}
