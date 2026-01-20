
package pharmacy;



public class Medicamo{
   private int id;
   private String name;
   private double price;
   private  int expirationDate;
   
  public Medicamo(int id ,String name,double price, int expirationDate){
   this.id=id;
   this.name=name;
   this.price=price;
   this.expirationDate=expirationDate;
   }
   public int getId(){
  return this.id;
  }
  public void setid(int id){
  this.id=id;
  }
  
  public String getName(){
  return this.name;
  }
  public void setPrice(double price){
  this.price=price;
  }
  public double getPrice(){
      return this.price;
  }
   public void setExpirationDate( int expirationDate){
  this.expirationDate=expirationDate;
  }
  public int getExpirationDate(){
      return this.expirationDate;
  }
  public String toString(){
  return "ID:"+id+"\n" +
          "  NAME:"+name+"\n" +
          "  price:  DA"+price+"\n" +
          "  expirationDate"+expirationDate;
  }
  public void show(){
  System.out.println(this.toString());
  }

}