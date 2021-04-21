/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit305project;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmed
 */
public class ServerSide extends javax.swing.JFrame {

    public static ArrayList<Appointee> appointees = new ArrayList<Appointee>();

    static ArrayList<Vaccine> vaccines = new ArrayList<Vaccine>();
    static ArrayList<VaccineCenter> vaccineCenters = new ArrayList<VaccineCenter>();

    /**
     * Creates new form ServerSide
     */
    public ServerSide() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        vcName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        vaccineList = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        vaccineName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vaccineShots = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vaccineDuration = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        vcList = new javax.swing.JComboBox<>();
        day = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        hour = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        minute = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        prioritySlider = new javax.swing.JSlider();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        vaccineCenterAppointments = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vaccine Center Name");

        jButton1.setText("Create Vaccine Center");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        vaccineList.setEnabled(false);

        jLabel5.setText("Vaccine");

        jButton4.setText("Launch Server");
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
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vaccineList, 0, 146, Short.MAX_VALUE)
                            .addComponent(vcName)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(672, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vcName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vaccine Center", jPanel1);

        jLabel2.setText("Name");

        jLabel3.setText("Num of Shots");

        jLabel4.setText("Duration Between Shots");

        jButton2.setText("Create Vaccine");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vaccineDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(vaccineShots)
                    .addComponent(vaccineName))
                .addContainerGap(722, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineShots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vaccine", jPanel2);

        jLabel6.setText("Vaccine Center");

        vcList.setEnabled(false);

        jLabel7.setText("Day");

        jLabel8.setText("Month");

        jLabel9.setText("Year");

        jButton3.setText("Add Appointment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Hour");

        jLabel11.setText("Minute");

        prioritySlider.setMaximum(10);
        prioritySlider.setValue(5);

        jLabel12.setText("0");

        jLabel13.setText("10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(minute))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(year)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vcList, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 304, Short.MAX_VALUE)))
                .addGap(396, 396, 396))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(prioritySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vcList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prioritySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(43, 43, 43)
                .addComponent(jButton3)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Appointments", jPanel3);

        vaccineCenterAppointments.setEnabled(false);
        vaccineCenterAppointments.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                vaccineCenterAppointmentsCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        vaccineCenterAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineCenterAppointmentsActionPerformed(evt);
            }
        });

        jLabel14.setText("Vaccine Center");

        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine", "Booked?", "Appointment ID", "Priority", "Appointee", "First Dose", "# of Shots", "Duration between shots"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appointmentTable);
        if (appointmentTable.getColumnModel().getColumnCount() > 0) {
            appointmentTable.getColumnModel().getColumn(0).setResizable(false);
            appointmentTable.getColumnModel().getColumn(1).setResizable(false);
            appointmentTable.getColumnModel().getColumn(2).setResizable(false);
            appointmentTable.getColumnModel().getColumn(3).setResizable(false);
            appointmentTable.getColumnModel().getColumn(4).setResizable(false);
            appointmentTable.getColumnModel().getColumn(5).setResizable(false);
            appointmentTable.getColumnModel().getColumn(6).setResizable(false);
            appointmentTable.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14)
                .addGap(84, 84, 84)
                .addComponent(vaccineCenterAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(669, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineCenterAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Available Appointments", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vaccine v = null;
        for (int i = 0; i < vaccines.size(); i++) {
            if (vaccines.get(i).getName().equalsIgnoreCase(vaccineList.getSelectedItem().toString())) {
                v = vaccines.get(i);
            }
            System.out.println("IS VACCINE NULL?: " + (v == null));

        }
        vaccineCenters.add(new VaccineCenter(vcName.getText(), v));
        vcList.setEnabled(true);
        vcList.removeAllItems();
        vaccineCenterAppointments.removeAllItems();
        for (int i = 0; i < vaccineCenters.size(); i++) {
            vcList.addItem(vaccineCenters.get(i).getName());
            vaccineCenterAppointments.addItem(vaccineCenters.get(i).getName());
        }
        vaccineCenterAppointments.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int numOfShots = Integer.parseInt(vaccineShots.getText());
            int durationBetweenShots = Integer.parseInt(vaccineDuration.getText());
            String name = vaccineName.getText();
            vaccines.add(new Vaccine(name, numOfShots, durationBetweenShots));
            vaccineList.setEnabled(true);
            vaccineList.removeAllItems();
            for (int i = 0; i < vaccines.size(); i++) {
                vaccineList.addItem(vaccines.get(i).getName());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please make sure you entered Integers for [Number of Shots] and [Duration Between Shots]");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int h = Integer.parseInt(hour.getText());
            int min = Integer.parseInt(minute.getText());
            int m = Integer.parseInt(month.getText());
            int d = Integer.parseInt(day.getText());
            int y = Integer.parseInt(year.getText());
            LocalDate ld = LocalDate.of(y, m, d); // YYYY-MM-DD
            LocalTime lt = LocalTime.of(h, min); // H-M
            LocalDateTime ldt = LocalDateTime.of(ld, lt);
            VaccineCenter vc = null;

            for (int i = 0; i < vaccineCenters.size(); i++) {
                if (vaccineCenters.get(i).getName().equalsIgnoreCase(vcList.getSelectedItem().toString())) {
                    vc = vaccineCenters.get(i);
                    System.out.println("Vaccine Center found! Is null?: " + (vc == null) + "\nName?: " + vc.getName());
                    break;
                }
            }
            Appointment appointment = new Appointment(VaccineCenter.getAppointmentID(), vc.getVaccine(), ldt, prioritySlider.getValue());
            VaccineCenter.setAppointmentID(VaccineCenter.getAppointmentID() + 1);
            vc.getDates().add(appointment);
            System.out.println(appointment.toString());
        } catch (NumberFormatException e) {

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void vaccineCenterAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineCenterAppointmentsActionPerformed
        try {
            String vaccineCenterName = null; // ERROR IS HERE
            for (int i = 0; i < vaccineCenterAppointments.getItemCount(); i++) {
                if (vaccineCenterAppointments.getItemAt(i).equalsIgnoreCase(vcList.getSelectedItem().toString())) {
                    vaccineCenterName = vcList.getSelectedItem().toString();
                }
            }
            if (vaccineCenterName == null) {
                System.out.println("Vaccine center for which appointment was added was not found.");
                return;
            }
            VaccineCenter vc = null;
            for (int i = 0; i < vaccineCenters.size(); i++) {
                if (vaccineCenterName.equalsIgnoreCase(vaccineCenters.get(i).getName())) {
                    vc = vaccineCenters.get(i);
                }
            }
            DefaultTableModel appointmentModel = (DefaultTableModel) appointmentTable.getModel();
            for (int i = 0; i < appointmentModel.getRowCount(); i++) {
                appointmentModel.removeRow(i);
            }

            String vaccine = "";
            boolean booked = false;
            int appointmentID = 0;
            int appointmentPriority = 0;
            String appointee = "";
            LocalDateTime firstDose = null;
            int numOfShots = 0;
            int durationBetweenShots = 0;
            for (int i = 0; i < vc.getDates().size(); i++) {
                vaccine = vc.getDates().get(i).getV().getName();
                booked = vc.getDates().get(i).isBooked();
                appointmentID = vc.getDates().get(i).getAppointmentID();
                appointmentPriority = vc.getDates().get(i).getAppointmentPriority();
                appointee = vc.getDates().get(i).getAppointee() == null ? "" : vc.getDates().get(i).getAppointee().getName();
                firstDose = vc.getDates().get(i).getDates()[0];
                numOfShots = vc.getDates().get(i).getV().getNumOfShots();
                durationBetweenShots = vc.getDates().get(i).getV().getDurationBetweenShots();
                Object[] row = {vaccine, booked, appointmentID, appointmentPriority, appointee, firstDose.toString(), numOfShots,
                    durationBetweenShots};
                appointmentModel.addRow(row);
            }
        } catch (NullPointerException e) {
            System.out.println("Nullpointer exception caught!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_vaccineCenterAppointmentsActionPerformed

    private void vaccineCenterAppointmentsCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_vaccineCenterAppointmentsCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccineCenterAppointmentsCaretPositionChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ConnectionHandler().start();
        jButton4.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ServerSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerSide().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentTable;
    private javax.swing.JTextField day;
    private javax.swing.JTextField hour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField minute;
    private javax.swing.JTextField month;
    private javax.swing.JSlider prioritySlider;
    private javax.swing.JComboBox<String> vaccineCenterAppointments;
    private javax.swing.JTextField vaccineDuration;
    private javax.swing.JComboBox<String> vaccineList;
    private javax.swing.JTextField vaccineName;
    private javax.swing.JTextField vaccineShots;
    private javax.swing.JComboBox<String> vcList;
    private javax.swing.JTextField vcName;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}

class ConnectionHandler extends Thread {

    @Override
    public void run() {
        System.out.println("Connection handler started!");

        // Implement into User Interface
        ServerSocket server = null;
        try {
            server = new ServerSocket(8900);
        } catch (IOException ex) {
            Logger.getLogger(ConnectionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Server started @ Port #" + 8900);
        while (true) {
            try {
                System.out.println("Server waiting connection...");
                new ClientReader(server.accept()).start();
                System.out.println("Client Connected!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Could not start server!");
                ex.printStackTrace();
            }
        }

    }

}

class ClientReader extends Thread {

    Socket s;
    ObjectInputStream ois;
    ClientWriter cw;

    public void setCw(ClientWriter cw) {
        this.cw = cw;
    }

    public ClientReader(Socket s) throws IOException {
        this.s = s;
        ois = new ObjectInputStream(s.getInputStream());
        cw = new ClientWriter(this.s);
    }

    @Override
    public void run() {
        System.out.println("Client Reader started!");
        Object o;
        boolean found = false;
        Appointee appointee = null;
        Appointment appointment;
        while (true) {
            try {
                found = false;
                o = ois.readObject();
                System.out.println("Object is read from client!");
                if (o instanceof Appointee) { // If appointee
                    System.out.println("Object is of type Appointee!");
                    appointee = (Appointee) o;
                    if (appointee.isLogin()) { // Check if login
                        System.out.println("Login Operation!");
                        for (int i = 0; i < ServerSide.appointees.size(); i++) {
                            if (appointee.getName().equalsIgnoreCase(ServerSide.appointees.get(i).getName()) && appointee.getPassword().equalsIgnoreCase(ServerSide.appointees.get(i).getPassword())) {
                                found = true;
                                System.out.println("Appointee found!");
                                ServerSide.appointees.get(i).setLogin(true);
                                Appointee foundUser = ServerSide.appointees.get(i);
                                foundUser.setLogin(true);
                                cw.WriteAppointee(foundUser);
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Appointee not found!");
                            cw.writeAppointeeNotFound(new AppointeeNotFound());
                            System.out.println("AppointeeNotFoundException written to client.");
                        }
                        continue;
                    } else {
                        System.out.println("Register Operation!");
                        ServerSide.appointees.add(appointee);
                        System.out.println("Appointee added!");
                        cw.WriteAppointee(appointee);
                        //If not login, then register:
                        //      1- select * from appointee where ssn = ${ssn};
                        //      2- if exists, query returns true, if not exists query returns false.
                        //      3- if not exists, add appointee to database.
                        //      4- call method cw.WriteAppointee(appointee) to return appointee object into client
                    }
                    //After Successful login / register, display vaccine centers after fetching from database.
                    //cw.WriteVaccineCenter(new VaccineCenter("", new Vaccine("", 0, 0)));
                    // Return Object of type Vaccine Center.
                } else if (o instanceof Appointment) { // Critical Section, check if appointment.
                    if (appointee == null) { // Has not yet logged in / registered, restart loop
                        continue;
                    }
                    appointment = (Appointment) o;
                    if (appointee.getPriority() == appointment.getAppointmentPriority()) {
                        if (appointment.bookAppointment(appointee)) { // Appointment is booked for client
                            cw.WriteAppointment(appointment);
                        } else { // Appointment booking failed --> [Already booked, doesn't exist, etc...]
                            cw.WriteAppointment(null); // This needs to be handled in client
                        }
                    }
                } else if (o == null) {
                    ois.close();
                    s.close();
                }
            } catch (ClassNotFoundException e) {

            } catch (IOException ex) {
                Logger.getLogger(ClientReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

class ClientWriter { // Not to be continued

    Socket s;
    ObjectOutputStream oos;
    ClientReader cr;

    public void setCr(ClientReader cr) {
        this.cr = cr;
    }

    public ClientWriter(Socket s) throws IOException {
        System.out.println("Client Writer created!");
        this.s = s;
        oos = new ObjectOutputStream(s.getOutputStream());
    }

    public void WriteVaccineCenter(VaccineCenter vc) throws IOException {
        oos.writeObject(vc);
        oos.flush();
        //1- get VaccineCenters from Database
        //2- Send Vaccine Centers to client using OOS
        //3- Flush
    }

    public void WriteAppointment(Appointment appointment) throws IOException {
        oos.writeObject(appointment);
        oos.flush();
    }

    public void WriteAppointee(Appointee appointee) throws IOException {
        oos.writeObject(appointee);
        oos.flush();
    }

    public void writeAppointeeNotFound(AppointeeNotFound apf) throws IOException {
        oos.writeObject(apf);
        oos.flush();
    }

}
