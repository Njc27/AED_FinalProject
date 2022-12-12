/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hopsital;

import static java.lang.String.valueOf;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import HospitalEnterprise.Appointments;
import HospitalEnterprise.AppointmentsCatalouge;
import ComEnterprise.City;
import ComEnterprise.CityCatalouge;
import ComEnterprise.Community;
import HospitalEnterprise.Doctor;
import HospitalEnterprise.DoctorCatalouge;
import HospitalEnterprise.EncounterHistory;
import HospitalEnterprise.Hospital;
import ComEnterprise.House;
import ComEnterprise.LoginInfo;
import ComEnterprise.People;
import HospitalEnterprise.PeopleCatalouge;

/**
 *
 * @author namithajc
 */
public class BookAppointment extends javax.swing.JPanel {

    /**
     * Creates new form BookAppointment
     */
    
    
    JSplitPane jSplitPane2;
    CityCatalouge cityLog;
    DoctorCatalouge doctor;
   
    public BookAppointment(JSplitPane jSplitPane2, CityCatalouge cityLog) {
        initComponents();
        //jDateChooser2.getJCalendar().setMinSelectableDate(new Date());
        this.cityLog = cityLog;
        this.jSplitPane2 = jSplitPane2;
        //jTSelectDoc.setText(selDoctor.getPerson().getName());
        //jTSelectDoc.setEditable(false);
        //disableTextFields();
        for (int i = 0; i< cityLog.size();i++){
            jcity.addItem(cityLog.get(i).getCityName());
        }


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPatientPhoneNo = new javax.swing.JTextField();
        jLPatName = new javax.swing.JLabel();
        jLPatDob = new javax.swing.JLabel();
        jLPatAge = new javax.swing.JLabel();
        jLPatGender = new javax.swing.JLabel();
        jLPatPhone = new javax.swing.JLabel();
        jPatientName = new javax.swing.JTextField();
        jTPatientAge = new javax.swing.JTextField();
        jPatientGender = new javax.swing.JTextField();
        jPatientEmail = new javax.swing.JTextField();
        jLPatEmail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPassword = new javax.swing.JTextField();
        jcity = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCommunity = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jAptNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jstNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        jLabel1.setText("Enter Details to Register As Patient");

        jPatientPhoneNo.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPatientPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientPhoneNoActionPerformed(evt);
            }
        });
        jPatientPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPatientPhoneNoKeyReleased(evt);
            }
        });

        jLPatName.setBackground(new java.awt.Color(247, 247, 255));
        jLPatName.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatName.setText("Name:");

        jLPatDob.setBackground(new java.awt.Color(247, 247, 255));
        jLPatDob.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatDob.setText("Date Of Birth:");

        jLPatAge.setBackground(new java.awt.Color(247, 247, 255));
        jLPatAge.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatAge.setText("Age:");

        jLPatGender.setBackground(new java.awt.Color(247, 247, 255));
        jLPatGender.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatGender.setText("Gender:");

        jLPatPhone.setBackground(new java.awt.Color(247, 247, 255));
        jLPatPhone.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatPhone.setText("Phone:");

        jPatientName.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientNameActionPerformed(evt);
            }
        });

        jTPatientAge.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jTPatientAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPatientAgeActionPerformed(evt);
            }
        });

        jPatientGender.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPatientGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientGenderActionPerformed(evt);
            }
        });

        jPatientEmail.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientEmailActionPerformed(evt);
            }
        });
        jPatientEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPatientEmailKeyReleased(evt);
            }
        });

        jLPatEmail.setBackground(new java.awt.Color(247, 247, 255));
        jLPatEmail.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatEmail.setText("Email:");

        jLabel3.setBackground(new java.awt.Color(247, 247, 255));
        jLabel3.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel3.setText("ID:");

        jId.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser2.setBackground(new java.awt.Color(247, 247, 255));

        jButton4.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jButton4.setText("Register");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(247, 247, 255));
        jLabel2.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel2.setText("Create Password:");

        jPassword.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordKeyReleased(evt);
            }
        });

        jcity.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcityActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(247, 247, 255));
        jLabel4.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel4.setText("City:");

        jLabel6.setBackground(new java.awt.Color(247, 247, 255));
        jLabel6.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel6.setText("Community:");

        jCommunity.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCommunityActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(247, 247, 255));
        jLabel7.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel7.setText("Apt No:");

        jAptNo.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(247, 247, 255));
        jLabel8.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel8.setText("Street Name:");

        jstNo.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(247, 247, 255));
        jLabel9.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel9.setText("ZipCode:");

        jSt.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N

        jLabel10.setBackground(new java.awt.Color(247, 247, 255));
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));

        jLabel11.setBackground(new java.awt.Color(247, 247, 255));
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));

        jLabel12.setBackground(new java.awt.Color(247, 247, 255));
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1)
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPatName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPatDob, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPatAge, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPatGender, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPatEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPatientEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLPatPhone)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAptNo)
                    .addComponent(jstNo)
                    .addComponent(jSt)
                    .addComponent(jPatientPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(322, 322, 322))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel4)
                    .addComponent(jcity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPatName)
                    .addComponent(jPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPatDob)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jAptNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPatAge)
                        .addComponent(jTPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jstNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPatGender)
                            .addComponent(jPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPatPhone)
                            .addComponent(jPatientPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPatEmail)
                            .addComponent(jPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdActionPerformed

    private void jPatientPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientPhoneNoActionPerformed

    private void jPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientEmailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPatientEmailActionPerformed

    private void jPatientGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientGenderActionPerformed

    private void jTPatientAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPatientAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPatientAgeActionPerformed

    private void jPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = jId.getText(); 
        String selectedCity = (String) jcity.getSelectedItem();
        City city = cityLog.searchCity(selectedCity);
        String selectedComm = (String) jCommunity.getSelectedItem();
        People people = city.getCommunityCatalog().searchCommunity(selectedComm).getPeopleCatalog().searchPeople(id);
        if(people!=null){
            if(people.getLoginInfo().getUserName().trim().length()> 0){
               JOptionPane.showMessageDialog(this, "You already have a account Sign in");
            }
            else{
            LocalDate curDate = LocalDate.now();
            Instant instant = people.getDob().toInstant();
            ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
            LocalDate givenDate = zone.toLocalDate();
            int age  = Period.between(givenDate,curDate).getYears();
            jPatientName.setText(people.getName());
            jDateChooser2.setDate(people.getDob());
            jPatientGender.setText(people.getGender());
//            jPatientAddress.setText(people.getHouse().getApartementNo()+"," + people.getHouse().getStreetName()+"," + people.getHouse().getZipCode());
            jPatientPhoneNo.setText(people.getPhone());
            jPatientEmail.setText(people.getEmail());
            jTPatientAge.setText(valueOf(age));
            jAptNo.setText(people.getHouse().getApartementNo());
            jstNo.setText(people.getHouse().getStreetName());
            jSt.setText(people.getHouse().getZipCode());
            disableTextFields();
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = jId.getText();
        String selectedCity = (String) jcity.getSelectedItem();
        String selectedComm = (String) jCommunity.getSelectedItem();
        City city = cityLog.searchCity(selectedCity);
        People people =  city.getCommunityCatalog().searchCommunity(selectedComm).getPeopleCatalog().searchPeople(id);
        if(people != null){
        String name = jPatientName.getText();
        Date dob = jDateChooser2.getDate();
        String gender = jPatientGender.getText();
        String phoneNo = jPatientPhoneNo.getText();
        String email = jPatientEmail.getText();
        String password = jPassword.getText();
        
        String aptNo = jAptNo.getText();
        String stNo = jstNo.getText();
        String zip = jSt.getText();
        
       people.setId(id);
        people.setName(name);
        people.setPhone(phoneNo);
        people.setHouse(new House(aptNo,stNo,zip));
        people.setEncounterHistory(new EncounterHistory());
        people.setDob(dob);
        people.setEmail(email);
        people.setGender(gender);
        people.setLoginInfo(new LoginInfo(name+id,password));
        if(name.trim().length() == 0 ||id.trim().length() == 0|| gender.trim().length() == 0 || phoneNo.trim().length() == 0|| email.trim().length() == 0 ){
            JOptionPane.showMessageDialog(this, "All Fields must be entered");
        }
        else{
//            hosp.getPatientCatalouge().addPatient(people);
            PatientLogin patLog = new PatientLogin(jSplitPane2,cityLog);
            jSplitPane2.setRightComponent(patLog);
        }
        }
        else{
        people = new People();
        String name = jPatientName.getText();
        Date dob = jDateChooser2.getDate();
        String gender = jPatientGender.getText();
        String phoneNo = jPatientPhoneNo.getText();
        String email = jPatientEmail.getText();
        String password = jPassword.getText();
        people.setDob(dob);
        people.setEmail(email);
        people.setGender(gender);
        people.setLoginInfo(new LoginInfo(name+id,password));
        if(name.trim().length() == 0 ||id.trim().length() == 0|| gender.trim().length() == 0 || phoneNo.trim().length() == 0|| email.trim().length() == 0 ){
            JOptionPane.showMessageDialog(this, "All Fields must be entered");
        }
        else{
            city.getCommunityCatalog().searchCommunity(selectedComm).getPeopleCatalog().addPeople(people);
//            hosp.getPatientCatalouge().addPatient(people);   
            PatientLogin patLog = new PatientLogin(jSplitPane2,cityLog);
            jSplitPane2.setRightComponent(patLog);
        }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcityActionPerformed
        // TODO add your handling code here:
         String selectedCity = (String) jcity.getSelectedItem();
        City selected  = new City();
        jCommunity.removeAllItems();
        selected = cityLog.searchCity(selectedCity);
        for (int i =0;i<selected.getCommunityCatalog().size();i++){
            Community comm = new Community();
            comm = selected.getCommunityCatalog().get(i);
            jCommunity.addItem(comm.getCommunityName());
        }
    }//GEN-LAST:event_jcityActionPerformed

    private void jCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCommunityActionPerformed

    private void jPatientEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPatientEmailKeyReleased
        // TODO add your handling code here:
        String pattern = "^[a-zA-Z0-9._]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{2,5}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(jPatientEmail.getText());
        if(!mat.matches()){
            jLabel12.setText("Email is incorrect");
        }
        else{
            jLabel12.setText(null);
        }
    }//GEN-LAST:event_jPatientEmailKeyReleased

    private void jPatientPhoneNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPatientPhoneNoKeyReleased
        // TODO add your handling code here:
        String pattern = "^[0-9]{10}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(jPatientPhoneNo.getText());
        if(!mat.matches()){
            jLabel10.setText("cell no. is incorrect");
        }
        else{
            jLabel10.setText(null);
        }
    }//GEN-LAST:event_jPatientPhoneNoKeyReleased

    private void jPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyReleased
        // TODO add your handling code here:
         String pattern = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(jPassword.getText());
        if(!mat.matches()){
            jLabel11.setText("Password should contain Minimum eight characters, at least one letter and one number");
        }
        else{
            jLabel11.setText(null);
        }
    }//GEN-LAST:event_jPasswordKeyReleased

    public void disableTextFields(){
        jPatientName.setEditable(false);
        jDateChooser2.setEnabled(false);
        jPatientGender.setEditable(false);
//        jPatientAddress.setEditable(false);
        jPatientPhoneNo.setEditable(false);
        jPatientEmail.setEditable(false);
        jTPatientAge.setEditable(false);
        jAptNo.setEditable(false);
        jstNo.setEditable(false);
        jSt.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAptNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCommunity;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLPatAge;
    private javax.swing.JLabel jLPatDob;
    private javax.swing.JLabel jLPatEmail;
    private javax.swing.JLabel jLPatGender;
    private javax.swing.JLabel jLPatName;
    private javax.swing.JLabel jLPatPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPassword;
    private javax.swing.JTextField jPatientEmail;
    private javax.swing.JTextField jPatientGender;
    private javax.swing.JTextField jPatientName;
    private javax.swing.JTextField jPatientPhoneNo;
    private javax.swing.JTextField jSt;
    private javax.swing.JTextField jTPatientAge;
    private javax.swing.JComboBox<String> jcity;
    private javax.swing.JTextField jstNo;
    // End of variables declaration//GEN-END:variables
}
