
class Product{
    String productName;
    double price;

    Product(String productName, double price)
    {
        this.productName = productName;
        this.price = price;
    }
    public String getProductName()
    {
        return productName;
    }
    public  double getPrice()
    {
        return price;
    }
    void display_info()
    {
        System.out.println("The product name is "+getProductName()+" and price "+getPrice() );
    }
    void calDiscount(double discount)
    {
        price = price-(price*(discount/100));
        System.out.println("after the the price of "+productName+ " is "+getPrice());
    }

}
class Electronics extends Product{
    String warrenty;



    Electronics(String productName, double price, String warrenty) {
        super(productName, price);
        this.warrenty = warrenty;
    }
    String getWarrenty()
    {
        return warrenty;
    }
    @Override
    void display_info()
    {
        System.out.println("The product name is "+getProductName()+" and price "+getPrice()+" and the warrenty period is "+getWarrenty());
    }
    void calDiscount(double discount)
    {
        price = price-(price*(discount/100));
        System.out.println("after the the price of "+productName+ " is "+getPrice());
    }
}
class Clothing extends Product{
    String size;
    Clothing(String productName, double price, String size) {
        super(productName, price);
        this.size = size;
    }
    String getSize()
    {
        return size;
    }
    @Override
    void display_info()
    {
        System.out.println("The product name is "+getProductName()+" and price "+getPrice()+" and the size is "+getSize());
    }
    void calDiscount(double discount)
    {
        price = price-(price*(discount/100));
        System.out.println("after the the price of "+productName+ " is "+getPrice());
    }

}
public class Override2 {
    public static void main(String [] args)
    {
        Product clothing = new Clothing("T shirt", 240,"32 inches");
        clothing.display_info();

        clothing.calDiscount(15);
    }
}
