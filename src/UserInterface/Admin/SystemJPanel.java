/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Admin;

import Business.Email;
import Business.Organization;
import CommunityEnterprise.City;
import CommunityEnterprise.CommunityDirectory;
import CommunityEnterprise.LoginCredentials;
import CommunityEnterprise.People;
import DBConn.DB4OUtil;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namithajc
 */
public class SystemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemJPanel
     */
    Organization system;
    People selectedAdmin;
    LoginCredentials login;
    boolean isPresent = false;
    boolean isEdit = false;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public SystemJPanel(Organization system) {
        initComponents();
        this.system = system;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSsn1 = new javax.swing.JTextField();
        jFirstName = new javax.swing.JTextField();
        jAddLine2 = new javax.swing.JTextField();
        jLastName = new javax.swing.JTextField();
        jAddLine1 = new javax.swing.JTextField();
        jZipCode = new javax.swing.JTextField();
        jPassword = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        jPhnNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCommunity = new javax.swing.JComboBox<>();
        jCity = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        jSplitPane1.setDividerLocation(155);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 654));

        jButton5.setText("Manage Admin");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Manage City");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Manage Community");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Manage People");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton5)
                .addGap(48, 48, 48)
                .addComponent(jButton8)
                .addGap(49, 49, 49)
                .addComponent(jButton6)
                .addGap(62, 62, 62)
                .addComponent(jButton7)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(642, 600));

        jLabel16.setText("First Name:");

        jLabel17.setText("Last Name:");

        jLabel18.setText("Phone Number:");

        jLabel19.setText("Email:");

        jLabel20.setText("Address Line 1:");

        jLabel22.setText("Address Line 2:");

        jLabel23.setText("City:");

        jLabel24.setText("Community:");

        jLabel25.setText("ZipCode:");

        jLabel26.setText("Select Role:");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hospital Admin", "Emergency Admin", "Insurance Admin", "Community Admin", "Finance Admin", " " }));

        jLabel27.setText("Create Password:");

        jLabel28.setText("Enter Code:");

        jSsn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSsn1ActionPerformed(evt);
            }
        });

        jLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLastNameActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Olá - Relaxing.png"))); // NOI18N

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Admin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton10.setText("Edit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Save");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel1.setText("DOB:");

        jCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jPhnNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jZipCode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAddLine1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSsn1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jAddLine2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addComponent(jCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addGap(153, 153, 153))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jSsn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jAddLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jAddLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jPhnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Create Admin", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SSN", "First Name", "Last Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(124, 124, 124)
                .addComponent(jButton3)
                .addGap(172, 172, 172))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Admin", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(jTabbedPane1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        CityJPanel mngCity = new CityJPanel(system);
        jSplitPane1.setRightComponent(mngCity);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        CommunityJPanel mngCommunity = new CommunityJPanel(system);
        jSplitPane1.setRightComponent(mngCommunity);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        PeopleJPanel mngPeople = new PeopleJPanel(system);
        jSplitPane1.setRightComponent(mngPeople);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ssn = jSsn1.getText();
        if(ssn.trim().length()>0){
            People p = system.getPeopleDirectory().findPersonBySSn(ssn);
            if(p == null){
                JOptionPane.showMessageDialog(this, "User Not Found");
            }
            else {
                isPresent = true;
                jFirstName.setText(p.getFirstName());
                jLastName.setText(p.getLastName());
                jAddLine1.setText(p.getAddressLine1());
                jAddLine2.setText(p.getAddressLine2());
                jCommunity.setSelectedItem(p.getCommunity());
                jCity.setSelectedItem(p.getCity());
                jZipCode.setText(p.getZipCode());
                jPhnNo.setText(p.getPhoneNo());
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Please Enter the SSN");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String ssn = jSsn1.getText();
        String firstName = jFirstName.getText();
        String lastName = jLastName.getText();
        String addLine1 = jAddLine1.getText();
        String addLine2 = jAddLine2.getText();
        String community = (String) jCommunity.getSelectedItem();
        String city = (String) jCity.getSelectedItem();
        String zipCode = jZipCode.getText();
        String phoneNumber = jPhnNo.getText();
        String password = jPassword.getText();
        String email = jEmail.getText();
//        Date dob = jDateChooser2.getDate();
        if(isPresent){
            People person = system.getPeopleDirectory().findPersonBySSn(ssn);
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setAddressLine1(addLine1);
            person.setAddressLine2(addLine2);
            person.setCity(city);
            person.setCommunity(community);
            person.getLoginCredentials().setUserName(email);
            person.getLoginCredentials().setPassword(password);
            String adminType = (String) jComboBox.getSelectedItem();
            if(adminType.equalsIgnoreCase("Hospital Admin")){
                person.setHospitalAdmin(true);
            }
            else if(adminType.equalsIgnoreCase("Emergency Admin")){
                person.setEmergencyAdmin(true);
            }
            else if(adminType.equalsIgnoreCase("Insurance Admin")){
                person.setCommunityAdmin(true);
            }
            JOptionPane.showMessageDialog(this, "Admin Added Succesfully"); 
        }
        else{
            People p = new People();
            p.setFirstName(firstName);
            p.setLastName(lastName);
            p.setAddressLine1(addLine1);
            p.setAddressLine2(addLine2);
            p.setCity(city);
            p.setCommunity(community);
            p.getLoginCredentials().setUserName(email);
            p.getLoginCredentials().setPassword(password);
            String adminType = (String) jComboBox.getSelectedItem();
            if(adminType.equalsIgnoreCase("Hospital Admin")){
                p.setHospitalAdmin(true);
            }
            else if(adminType.equalsIgnoreCase("Emergency Admin")){
                p.setEmergencyAdmin(true);
            }
            else if(adminType.equalsIgnoreCase("Insurance Admin")){
                p.setCommunityAdmin(true);
            }
            system.getPeopleDirectory().addPerson(p);
            JOptionPane.showMessageDialog(this, "Admin Created Succesfully");
        }
        setFieldsToNull();
         populateTable();
         jTabbedPane1.setSelectedIndex(1);
         dB4OUtil.storeSystem(system);
         //Email.sendMail(email,"Hey","hello");
//         try {
//                Email.sendMail(email,"Hey","hello");
//            } catch (Exception ex) {
//                Logger.getLogger(SystemJPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }

         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        disableFields(true);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
       LoginCredentials login = new LoginCredentials();
        String ssn = jSsn1.getText();
        String firstName = jFirstName.getText();
        String lastName = jLastName.getText();
        String addLine1 = jAddLine1.getText();
        String addLine2 = jAddLine2.getText();
        String community = (String) jCommunity.getSelectedItem();
        String city = (String) jCity.getSelectedItem();
        String zipCode = jZipCode.getText();
        String phoneNumber = jPhnNo.getText();
        String password = jPassword.getText();
        String email = jEmail.getText();
        
        if(firstName.trim().length()>0 && lastName.trim().length()>0){
            selectedAdmin.setFirstName(firstName);
            selectedAdmin.setLastName(lastName);
            selectedAdmin.setAddressLine1(addLine1);
            selectedAdmin.setAddressLine2(addLine2);
            selectedAdmin.setCommunity(community);
            selectedAdmin.setCity(city);
            selectedAdmin.setZipCode(zipCode);
            selectedAdmin.setPhoneNo(phoneNumber);
            login.setEmail(email);
            login.setPassword(password);
            selectedAdmin.setLoginCredentials(login);
            
            jSsn1.setText("");
            jFirstName.setText("");
            jLastName.setText("");
            jEmail.setText("");
            jPhnNo.setText("");
            jZipCode.setText("");
            jAddLine1.setText("");
            jAddLine2.setText("");
            jPassword.setText("");
            
//            Email.sendMail("New User Created","Mm","aa","manju.pratuv@gmail.com");
             JOptionPane.showMessageDialog(this, "Admin Updated");  
            jTabbedPane1.setSelectedIndex(1);
            isEdit = false;
            }
            else{
                JOptionPane.showMessageDialog(this, "Fill all the fields"); 
            }
            dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Please Select a Row");
        }
        else{
            String selectedPeople =  (String) model.getValueAt(selectedRow,1);
            selectedAdmin = system.getPeopleDirectory().findPersonBySSn(selectedPeople);
            jTabbedPane1.setSelectedIndex(0);
            isEdit = true;
            jSsn1.setText(selectedAdmin.getSsn());
            jFirstName.setText(selectedAdmin.getFirstName());
            jLastName.setText(selectedAdmin.getLastName());
            jEmail.setText(selectedAdmin.getEmailId());
            jPhnNo.setText(selectedAdmin.getPhoneNo());
            jZipCode.setText(selectedAdmin.getZipCode());
//            jDateChooser2.setDate(selectedPerson.getDob());
            jCommunity.setSelectedItem(selectedAdmin.getCommunity());
            jCity.setSelectedItem(selectedAdmin.getCity());
            jAddLine1.setText(selectedAdmin.getAddressLine1());
            jCommunity.setSelectedItem(selectedAdmin.getGender());
            jAddLine2.setText(selectedAdmin.getAddressLine2());
            disableFields(false);
            jButton2.setVisible(false);
            jButton10.setVisible(true);
            jButton11.setVisible(true);
            
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jSsn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSsn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSsn1ActionPerformed

    private void jLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLastNameActionPerformed

    private void jCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCityActionPerformed
        // TODO add your handling code here:
        jCommunity.removeAllItems();
        String selectedCity = (String) jCity.getSelectedItem();
        City selected = system.getCityDirectory().getCityByName(selectedCity);
        CommunityDirectory commLog = selected.getComDir();
         for(int i = 0 ; i < commLog.getCommunityList().size();i++){
             jCommunity.addItem(commLog.getCommunityList().get(i).getName());
         }
      
    }//GEN-LAST:event_jCityActionPerformed

    public void disableFields(boolean flag){
        jSsn1.setEditable(flag);
            jFirstName.setEditable(flag);
            jLastName.setEditable(flag);
            jEmail.setEditable(flag);
            jPhnNo.setEditable(flag);
            jZipCode.setEditable(flag);
//            jDateChooser2.setDate(selectedPerson.getDob());
            jCommunity.setEditable(flag);
            jCity.setEnabled(flag);
            jAddLine1.setEditable(flag);
            jCommunity.setEnabled(flag);
            jAddLine2.setEditable(flag);
    }
    
    public void setFieldsToNull(){
            jSsn1.setText("");
            jFirstName.setText("");
            jLastName.setText("");
            jEmail.setText("");
            jPhnNo.setText("");
            jZipCode.setText("");
            jAddLine1.setText("");
            jAddLine2.setText("");
           
            
            jPassword.setText("");
    }
    public void populateTable(){
            jButton2.setVisible(true);
            jButton10.setVisible(false);
            jButton11.setVisible(false);
        for (int i = 0; i< system.getCityDirectory().getCityList().size();i++){
            jCity.addItem(system.getCityDirectory().getCityList().get(i).getCityName());
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
         for (int i =0;i<system.getPeopleDirectory().systemAdminList().size();i++){
                        
                        Object rowData[] = new Object[4];
                        rowData[0] = i;
                        rowData[1] = system.getPeopleDirectory().systemAdminList().get(i).getSsn();
                        rowData[2] = system.getPeopleDirectory().systemAdminList().get(i).getFirstName();
                        rowData[3] = system.getPeopleDirectory().systemAdminList().get(i).getLastName();
                        model.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAddLine1;
    private javax.swing.JTextField jAddLine2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jCity;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jCommunity;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jFirstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JTextField jLastName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jPassword;
    private javax.swing.JTextField jPhnNo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jSsn1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jZipCode;
    // End of variables declaration//GEN-END:variables
}
