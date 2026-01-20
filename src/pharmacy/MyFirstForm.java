 
package pharmacy;


public class MyFirstForm extends javax.swing.JFrame {
  Pharmacy pharmacy = new Pharmacy();
   public MyFirstForm() {
        initComponents();
        loadMedicines();   
    }

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MyFirstForm.class.getName());


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(131, 191, 115));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 55)); // NOI18N
        jLabel1.setText("My Pharmacy ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/c5a3ae8617c0390c547436cdf7915ff5.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Enter the name of medicine");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Type of medicine");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medical Device", "Tablet Medicine", "Syrup Medicine", "Ointment Medicine" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome to my pharmacy ,enter the name of a medicine and choose its type to show you its type to show you its information.");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Add medicine");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Show all medicines");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Delete medicine ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 83, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(198, 198, 198))
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(111, 111, 111)
                                    .addComponent(jButton1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton2)
                        .addGap(50, 50, 50)
                        .addComponent(jButton4)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                                          

    String name = jTextField1.getText().trim();
    String type = jComboBox1.getSelectedItem().toString();

    if(name.isEmpty()){
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter medicine name!");
        return;
    }

      var result = pharmacy.SearchByName(name);

    if(result == null){
        javax.swing.JOptionPane.showMessageDialog(this, "Medicine not found!");
        return;
    }
    boolean match = false;

    switch(type){
    case "Medical Device":
        match = result instanceof MedicalDevice;
        break;
    case "Tablet Medicine":
        match = result instanceof TabelMedicine;
        break;
    case "Syrup Medicine":
        match = result instanceof  SyrupMedicine;
        break;
    case "Ointment Medicine":
        match = result instanceof OintmentMedcine;
        break;
}

if(!match){
    javax.swing.JOptionPane.showMessageDialog(this, 
        "The medicine exists, but the selected type is incorrect!");
    return;
}

    
    search s = new search();
    s.setVisible(true);
    s.setResult(result.toString());
    
   

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
     AddMedicineForm addForm = new AddMedicineForm(pharmacy);
      addForm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String allMedicines = pharmacy.getAllMedicinesAsText();
    if (allMedicines.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "No medicines available.");
        return;
    }

    search s = new search();
    s.setVisible(true);
    s.setResult(allMedicines);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DeleteMedicineForm deleteForm = new DeleteMedicineForm(pharmacy);
    deleteForm.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]){
    
        java.awt.EventQueue.invokeLater(() -> {
            new MyFirstForm().setVisible(true);
        
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadMedicines() {
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
                    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }}

