/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokgdatabaseapplication;

import Classes.Customer;
import Classes.Employee;
import Classes.Fellow_traveler;
import Classes.Travel;
import Classes.Travel_detail;
import DatabaseControllers.MainController;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author mikey
 */
public class BookingMaken extends javax.swing.JFrame {

    private MainController mc = new MainController();
    private final ArrayList<Customer> customers;
    private final ArrayList<Travel_detail> travel_details;
    private final ArrayList<Fellow_traveler> fellow_travelers;
    private ArrayList<Integer> gaat_mee;
    DefaultListModel<String> modelCustomer;
    DefaultListModel<String> modelTravel_details;
    DefaultListModel<String> modelFellow_travelers;

    /**
     * Creates new form BookingMaken
     */
    public BookingMaken() {
        initComponents();

        customers = mc.getCustomers();
        travel_details = mc.getTravel_detail();
        fellow_travelers = mc.getFellow_travelers();
        gaat_mee = new ArrayList();

        modelCustomer = new DefaultListModel<String>();
        for (Customer c : customers) {
            modelCustomer.addElement(c.toString());
        }
        customerList.setModel(modelCustomer);
        customerList.setSelectedIndex(0);

        modelTravel_details = new DefaultListModel<String>();
        for (Travel_detail td : travel_details) {
            modelTravel_details.addElement(td.toString());
        }
        travelDetailList.setModel(modelTravel_details);
        travelDetailList.setSelectedIndex(0);

        modelFellow_travelers = new DefaultListModel<String>();
        for (Fellow_traveler fd : fellow_travelers) {
            modelFellow_travelers.addElement(fd.toString());
        }
        fellowTravelerList.setModel(modelFellow_travelers);
        fellowTravelerList.setSelectedIndex(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        customerList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        travelDetailList = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        fellowTravelerList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jb_gaatMee = new javax.swing.JButton();
        jl_Prijs = new javax.swing.JLabel();
        jlPrijsText = new javax.swing.JLabel();
        jl_StartText = new javax.swing.JLabel();
        jl_EindText = new javax.swing.JLabel();
        jl_Eind = new javax.swing.JLabel();
        jl_Start = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(customerList);

        travelDetailList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        travelDetailList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                travelDetailListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(travelDetailList);

        jButton1.setText("Boek deze reis");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fellowTravelerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(fellowTravelerList);

        jLabel1.setText("Boeker");

        jLabel2.setText("Reis");

        jLabel4.setText("Mogelijke medereizigers");

        jb_gaatMee.setText("Neem mee");
        jb_gaatMee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_gaatMeeActionPerformed(evt);
            }
        });

        jl_Prijs.setText("(€1000)");

        jlPrijsText.setText("Prijs:");

        jl_StartText.setText("Start:");

        jl_EindText.setText("Eind:");

        jl_Eind.setText("(einddatum)");

        jl_Start.setText("(startdatum)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_EindText)
                                    .addComponent(jl_StartText)
                                    .addComponent(jlPrijsText))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_Prijs)
                                    .addComponent(jl_Start)
                                    .addComponent(jl_Eind)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addComponent(jb_gaatMee)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Prijs)
                            .addComponent(jlPrijsText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_StartText)
                            .addComponent(jl_Start))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_EindText)
                            .addComponent(jl_Eind))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_gaatMee)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int customer_index = this.customerList.getSelectedIndex();
        int travel_detail_index = this.travelDetailList.getSelectedIndex();
        int customer_id = customers.get(customer_index).getCustomer_id();
        int travel_detail_id = travel_details.get(travel_detail_index).getTravel_detail_id();
        mc.createBooking(travel_detail_id, customer_id, gaat_mee);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jb_gaatMeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gaatMeeActionPerformed
        int ft_index = fellowTravelerList.getSelectedIndex();
        System.out.println(fellow_travelers.get(ft_index).getFellow_traveler_id());
        gaat_mee.add(fellow_travelers.get(ft_index).getFellow_traveler_id());
    }//GEN-LAST:event_jb_gaatMeeActionPerformed

    private void travelDetailListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_travelDetailListValueChanged
        if (!evt.getValueIsAdjusting()) {
            int travel_detail_index = this.travelDetailList.getSelectedIndex();
            double travel_price = travel_details.get(travel_detail_index).getPrice();
            Date start_date = travel_details.get(travel_detail_index).getStart_date();
            Date end_date = travel_details.get(travel_detail_index).getEnd_date();
            jl_Prijs.setText(Double.toString(travel_price));
            jl_Start.setText(start_date.toString());
            jl_Eind.setText(end_date.toString());
        }
    }//GEN-LAST:event_travelDetailListValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingMaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingMaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingMaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingMaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingMaken().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> customerList;
    private javax.swing.JList<String> fellowTravelerList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_gaatMee;
    private javax.swing.JLabel jlPrijsText;
    private javax.swing.JLabel jl_Eind;
    private javax.swing.JLabel jl_EindText;
    private javax.swing.JLabel jl_Prijs;
    private javax.swing.JLabel jl_Start;
    private javax.swing.JLabel jl_StartText;
    private javax.swing.JList<String> travelDetailList;
    // End of variables declaration//GEN-END:variables
}
