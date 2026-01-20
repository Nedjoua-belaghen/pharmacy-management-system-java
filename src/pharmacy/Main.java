
package pharmacy;
public class Main{
 public static void main (String[]args){
     //pharmacy
     Pharmacy pharmacy =new Pharmacy();
     // tabel medicine
      pharmacy.addMedcine(new TabelMedicine(1,"paracetamol",125.0,2028,1));
      pharmacy.addMedcine(new TabelMedicine(2, "Ibuprofen", 150.0, 2029, 2));
      pharmacy.addMedcine(new TabelMedicine(3, "Aspirin", 100.0, 2027, 1));
      pharmacy.addMedcine(new TabelMedicine(4, "Amoxicillin", 200.0, 2026, 1));
      pharmacy.addMedcine(new TabelMedicine(5, "Metformin", 180.0, 2030, 1));
      pharmacy.addMedcine(new TabelMedicine(6, "Ciprofloxacin", 220.0, 2028, 1));
      pharmacy.addMedcine(new TabelMedicine(7, "Azithromycin", 250.0, 2029, 1));
      pharmacy.addMedcine(new TabelMedicine(8, "Omeprazole", 130.0, 2031, 1));
      pharmacy.addMedcine(new TabelMedicine(9, "Loratadine", 140.0, 2027, 1));
      pharmacy.addMedcine(new TabelMedicine(10, "Clindamycin", 210.0, 2028, 1));
      pharmacy.addMedcine(new TabelMedicine(11, "Levothyroxine", 190.0, 2029, 1));
      pharmacy.addMedcine(new TabelMedicine(12, "Simvastatin", 175.0, 2030, 1));
      pharmacy.addMedcine(new TabelMedicine(13, "Hydrochlorothiazide", 160.0, 2027, 1));
      pharmacy.addMedcine(new TabelMedicine(14, "Furosemide", 155.0, 2028, 1));
      pharmacy.addMedcine(new TabelMedicine(15, "Prednisone", 165.0, 2029, 1));
      pharmacy.addMedcine(new TabelMedicine(16, "Clopidogrel", 185.0, 2030, 1));

      //syrup 
      
      pharmacy.addMedcine(new SyrupMedicine(17, "Vitamin C Syrup", 3976.0, 2029, 120.0));
      pharmacy.addMedcine(new SyrupMedicine(18, "Cough Syrup", 150.0, 2028, 100.0));
      pharmacy.addMedcine(new SyrupMedicine(19, "Paracetamol Syrup", 160.0, 2030, 110.0));
      pharmacy.addMedcine(new SyrupMedicine(20, "Antacid Syrup", 140.0, 2027, 90.0));
      pharmacy.addMedcine(new SyrupMedicine(21, "Vitamin D Syrup", 200.0, 2031, 120.0));
      pharmacy.addMedcine(new SyrupMedicine(22, "Iron Syrup", 180.0, 2029, 115.0));
      pharmacy.addMedcine(new SyrupMedicine(23, "Antihistamine Syrup", 190.0, 2028, 110.0));
      pharmacy.addMedcine(new SyrupMedicine(24, "Probiotic Syrup", 175.0, 2030, 100.0));
      pharmacy.addMedcine(new SyrupMedicine(25, "Multivitamin Syrup", 210.0, 2027, 120.0));
      pharmacy.addMedcine(new SyrupMedicine(26, "Cough Relief Syrup", 160.0, 2029, 105.0));
      pharmacy.addMedcine(new SyrupMedicine(27, "Cold Syrup", 170.0, 2031, 110.0));
      pharmacy.addMedcine(new SyrupMedicine(28, "Digestive Syrup", 150.0, 2028, 100.0));
      pharmacy.addMedcine(new SyrupMedicine(29, "Vitamin B12 Syrup", 195.0, 2030, 115.0));
      pharmacy.addMedcine(new SyrupMedicine(30, "Herbal Syrup", 180.0, 2027, 120.0));
      pharmacy.addMedcine(new SyrupMedicine(31, "Lactose-Free Syrup", 170.0, 2029, 110.0));
      pharmacy.addMedcine(new SyrupMedicine(32, "Calcium Syrup", 200.0, 2031, 120.0));

      //ointment 
      
      pharmacy.addMedcine(new OintmentMedcine(33, "Skin Ointment", 2000.0, 2028, 40.0));
      pharmacy.addMedcine(new OintmentMedcine(34, "Antibiotic Ointment", 210.0, 2029, 30.0));
      pharmacy.addMedcine(new OintmentMedcine(35, "Hydrocortisone Ointment", 220.0, 2030, 35.0));
      pharmacy.addMedcine(new OintmentMedcine(36, "Aloe Vera Ointment", 180.0, 2027, 25.0));
      pharmacy.addMedcine(new OintmentMedcine(37, "Anti-fungal Ointment", 200.0, 2028, 30.0));
      pharmacy.addMedcine(new OintmentMedcine(38, "Moisturizing Ointment", 190.0, 2029, 40.0));
      pharmacy.addMedcine(new OintmentMedcine(39, "Pain Relief Ointment", 230.0, 2030, 35.0));
      pharmacy.addMedcine(new OintmentMedcine(40, "Burn Ointment", 210.0, 2027, 30.0));
      pharmacy.addMedcine(new OintmentMedcine(41, "Anti-inflammatory Ointment", 220.0, 2028, 35.0));
      pharmacy.addMedcine(new OintmentMedcine(42, "Herbal Ointment", 195.0, 2029, 25.0));
      pharmacy.addMedcine(new OintmentMedcine(43, "Scar Ointment", 200.0, 2030, 40.0));
      pharmacy.addMedcine(new OintmentMedcine(44, "Antiseptic Ointment", 180.0, 2027, 30.0));
      pharmacy.addMedcine(new OintmentMedcine(45, "Eczema Ointment", 210.0, 2028, 35.0));
      pharmacy.addMedcine(new OintmentMedcine(46, "Psoriasis Ointment", 220.0, 2029, 40.0));
      pharmacy.addMedcine(new OintmentMedcine(47, "Cold Sore Ointment", 200.0, 2030, 30.0));
      pharmacy.addMedcine(new OintmentMedcine(48, "Antibiotic Cream", 230.0, 2031, 35.0));

      
      //device
     
      pharmacy.addMedcine(new MedicalDevice(49, "Thermometer", 2300.0, 2030, "BrandX", "Temperature Measurement"));
      pharmacy.addMedcine(new MedicalDevice(50, "Blood Pressure Monitor", 5000.0, 2031, "BrandA", "Blood Pressure Measurement"));
      pharmacy.addMedcine(new MedicalDevice(51, "Glucometer", 1500.0, 2029, "BrandB", "Blood Sugar Measurement"));
      pharmacy.addMedcine(new MedicalDevice(52, "Oximeter", 800.0, 2028, "BrandC", "Oxygen Saturation Measurement"));
      pharmacy.addMedcine(new MedicalDevice(53, "Stethoscope", 1200.0, 2030, "BrandD", "Heart and Lung Listening"));
      pharmacy.addMedcine(new MedicalDevice(54, "Nebulizer", 2500.0, 2029, "BrandE", "Respiratory Treatment"));
      pharmacy.addMedcine(new MedicalDevice(55, "Sphygmomanometer", 2000.0, 2031, "BrandF", "Blood Pressure Measurement"));
      pharmacy.addMedcine(new MedicalDevice(56, "Infrared Thermometer", 2200.0, 2028, "BrandG", "Temperature Measurement"));
      pharmacy.addMedcine(new MedicalDevice(57, "Medical Scale", 3000.0, 2029, "BrandH", "Weight Measurement"));
      pharmacy.addMedcine(new MedicalDevice(58, "ECG Machine", 15000.0, 2030, "BrandI", "Heart Activity Monitoring"));
      pharmacy.addMedcine(new MedicalDevice(59, "Pulse Oximeter", 900.0, 2028, "BrandJ", "Oxygen Saturation"));
      pharmacy.addMedcine(new MedicalDevice(60, "Therapy Laser", 8000.0, 2029, "BrandK", "Skin Treatment"));
      pharmacy.addMedcine(new MedicalDevice(61, "Hearing Aid", 12000.0, 2030, "BrandL", "Hearing Assistance"));
      pharmacy.addMedcine(new MedicalDevice(62, "CPAP Machine", 25000.0, 2031, "BrandM", "Sleep Apnea Treatment"));
      pharmacy.addMedcine(new MedicalDevice(63, "Therapeutic Ultrasound", 18000.0, 2028, "BrandN", "Physical Therapy"));
      pharmacy.addMedcine(new MedicalDevice(64, "Defibrillator", 50000.0, 2030, "BrandO", "Emergency Heart Treatment"));

         pharmacy.saveToFile("medicines.txt");

         System.out.println(" tout les medicamo");
        pharmacy.showALL();
 }

}