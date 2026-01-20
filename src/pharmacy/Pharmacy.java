package pharmacy;

 import java.io.*;
import java.util.ArrayList;
public class Pharmacy{
private ArrayList<Medicamo> medicines = new ArrayList<>();

   public void addMedcine(Medicamo m){
   medicines.add(m);
   }
   
  public Medicamo SearchByName(String name ){
      for(Medicamo m :medicines){
          if(m.getName().equalsIgnoreCase(name)){
              return m;
          }
      }
      return null;
   }
 public MedicalDevice searchByFunction(String function){
   for(Medicamo m : medicines){
   if (m instanceof MedicalDevice){
    MedicalDevice d=(MedicalDevice) m;
   if(d.getFunction().equalsIgnoreCase(function)){
       return d;
      }
     }
   }
 return null; }
 public void showALL(){
     for(Medicamo m:medicines){
         m.show();
     }
 }
 public void saveToFile(String fileName) {
    try (FileWriter writer = new FileWriter(fileName)) {
        for (Medicamo m : medicines) {
            writer.write(m.toString() + "\n");
        }
        System.out.println("Data has been successfully loaded from file");
    } catch (IOException e) {
        System.out.println("Error : " + e.getMessage());
    }
}
 public String getAllMedicinesAsText() {
        StringBuilder sb = new StringBuilder();

        for (Medicamo m : medicines) {
            sb.append(m.toString())
              .append("\n\n");
        }

        return sb.toString();
    }
     public ArrayList<Medicamo> getMedicines() {
    return medicines;
}

}







  
