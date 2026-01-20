package pharmacy;
public class SyrupMedicine extends Medicamo{
    private double SizeMl;
  public SyrupMedicine(int id, String name,double price ,int expirationDate ,double SizeMl){
   super(id ,name,price,expirationDate);
   this.SizeMl=SizeMl;
}
    @Override
  
 public String toString() {
    return
           
            
          "ID:"+getId()+   "\n" +
        "Name: " + getName() + "\n" +
        "Price: " + getPrice() + " DA\n" +
         "Expiration: " +getExpirationDate() + "\n" +
      
         "SizeMl: " + SizeMl+ " ML\n";
}
} 

