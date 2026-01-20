
package pharmacy;

public class OintmentMedcine extends Medicamo{ 
      public double weightG;
        public OintmentMedcine(int id, String name,double price, int expirationDate, double  weightG){
   super(id ,name,price,expirationDate);
   this.weightG=weightG;
}
      public String toString() {
    return
           
            
          "ID:"+getId()+   "\n" +
        "Name: " + getName() + "\n" +
        "Price: " + getPrice() + " DA\n" +
         "Expiration: " +getExpirationDate() + "\n" +
      
         "weightG: " + weightG+ " g\n";
}} 


