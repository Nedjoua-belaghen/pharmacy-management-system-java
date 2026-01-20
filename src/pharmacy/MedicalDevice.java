package pharmacy;
public class  MedicalDevice extends Medicamo {

    private String brand;
    private String function;

    public MedicalDevice(int id, String name, double price, int expirationDate,
                         String brand, String function) {
        super(id, name, price, expirationDate);
        this.brand = brand;
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    @Override
    public String toString() {
    return
           
            
          "ID:"+getId()+   "\n" +
        "Name: " + getName() + "\n" +
        "Price: " + getPrice() + " DA\n" +
         "Expiration: " +getExpirationDate() + "\n" +
      "Function: " +getFunction() + "\n" +
         "brand : " + brand ;
}
} 
