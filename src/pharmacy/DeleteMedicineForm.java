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

public class DeleteMedicineForm extends JFrame {

    private JTextField txtId;
    private JButton btnDelete;
    private Pharmacy pharmacy;

    public DeleteMedicineForm(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;

        setTitle("Delete Medicine");
        setSize(764, 407);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          getContentPane().setBackground(new Color(131,191,115));
        setLayout(new GridLayout(2, 2, 4, 4));
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(new JLabel("Enter Medicine ID to delete:"));
        txtId = new JTextField();
        add(txtId);

        btnDelete = new JButton("Delete");
        add(new JLabel());
        add(btnDelete);

        
        btnDelete.addActionListener(e -> deleteMedicineById());

        
    }

    private void deleteMedicineById() {
        try {
            int id = Integer.parseInt(txtId.getText());
            boolean deleted = false;

            
            for (int i = 0; i < pharmacy.getMedicines().size(); i++) {
                if (pharmacy.getMedicines().get(i).getId() == id) {
                    pharmacy.getMedicines().remove(i);
                    deleted = true;
                    break;
                }
            }

            if (deleted) {
                
                try (FileWriter writer = new FileWriter("medicines.txt")) {
                    for (Medicamo m : pharmacy.getMedicines()) {
                        writer.write(m.toString() + "\n");
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error writing file: " + ex.getMessage());
                }

                JOptionPane.showMessageDialog(this, "Medicine deleted successfully.");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Medicine with ID " + id + " not found.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for ID.");
        }
    }
}