/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
public class AddMedicineForm extends JFrame {

 
    private JTextField txtId, txtName, txtPrice, txtExp, txtExtra, txtBrand;
    private JLabel lblExtra, lblBrand;
    private JComboBox cmbType;
    private JButton btnAdd;
    private Pharmacy pharmacy;

    
    public AddMedicineForm(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;

        setTitle("Add Medicine");
        setSize(764, 407);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

         getContentPane().setBackground(new Color(131,191,115));
        setLayout(new GridLayout(8, 2, 5, 5));
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        add(new JLabel("ID:"));
        txtId = new JTextField();
        add(txtId);

        add(new JLabel("Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Price:"));
        txtPrice = new JTextField();
        add(txtPrice);

        add(new JLabel("Expiration Date:"));
        txtExp = new JTextField();
        add(txtExp);

        add(new JLabel("Type:"));
        cmbType = new JComboBox<>(new String[]{
            "Tablet Medicine",
            "Syrup Medicine",
            "Ointment Medicine",
            "Medical Device"
        });
        add(cmbType);
  
        lblExtra = new JLabel("Extra:");
        txtExtra = new JTextField();
        add(lblExtra);
        add(txtExtra);

        
        lblBrand = new JLabel("Brand:");
        txtBrand = new JTextField();
        add(lblBrand);
        add(txtBrand);

        
        btnAdd = new JButton("Add Medicine");
        add(new JLabel());
        add(btnAdd);

        
        cmbType.addActionListener(e -> {
            String type = cmbType.getSelectedItem().toString();
            switch (type) {
                case "Tablet Medicine":
                    lblExtra.setText("Number of Pills:");
                    txtExp.setEnabled(true);
                    txtBrand.setEnabled(false);
                    txtBrand.setText("");
                    break;
                case "Syrup Medicine":
                    lblExtra.setText("Size (ML):");
                    txtExp.setEnabled(true);
                    txtBrand.setEnabled(false);
                    txtBrand.setText("");
                    break;
                case "Ointment Medicine":
                    lblExtra.setText("Weight (g):");
                    txtExp.setEnabled(true);
                    txtBrand.setEnabled(false);
                    txtBrand.setText("");
                    break;
                case "Medical Device":
                    lblExtra.setText("Function:");
                    txtExp.setEnabled(true);  
                    txtBrand.setEnabled(true); 
                    break;
            }
        });

        btnAdd.addActionListener(e -> addMedicine());
    }

    private void addMedicine() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String name = txtName.getText();
            double price = Double.parseDouble(txtPrice.getText());
            String type = cmbType.getSelectedItem().toString();
            String extra = txtExtra.getText();
            String brand = txtBrand.getText();
            int exp = Integer.parseInt(txtExp.getText());

            Medicamo m = null;

            switch (type) {
                case "Tablet Medicine":
                    int pills = Integer.parseInt(extra);
                    m = new TabelMedicine(id, name, price, exp, pills);
                    break;
                case "Syrup Medicine":
                    double size = Double.parseDouble(extra);
                    m = new SyrupMedicine(id, name, price, exp, size);
                    break;
                case "Ointment Medicine":
                    double weight = Double.parseDouble(extra);
                    m = new OintmentMedcine(id, name, price, exp, weight);
                    break;
                case "Medical Device":
                    m = new MedicalDevice(id, name, price, exp, brand, extra); 
                    break;
            }

            pharmacy.addMedcine(m);
            
         try (FileWriter writer = new FileWriter("medicines.txt", true)) {
         writer.write(m.toString() + "\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving to file: " + ex.getMessage());
        }
               
            JOptionPane.showMessageDialog(this, "Medicine added successfully");
            dispose();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}
      
