package pharmacy;
public class TabelMedicine extends Medicamo{
  private int numberOfpills;
  public TabelMedicine(int id, String name, double price,int expirationDate ,int numberOfpills){
   super(id ,name,price,expirationDate);
   this.numberOfpills =numberOfpills ;
}
  @Override


public String toString() {
    return
           
            
          "ID:"+getId()+   "\n" +
        "Name: " + getName() + "\n" +
        "Price: " + getPrice() + " DA\n" +
         "Expiration: " +getExpirationDate() + "\n" +
      
         "Number of Pills: " + numberOfpills;
}

} 

