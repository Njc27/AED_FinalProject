/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hopsital;

/**
 *
 * @author namithajc
 */
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    public PatientJPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPatientName = new javax.swing.JTextField();
        jLPatDob = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLPatGender = new javax.swing.JLabel();
        jLPatPhone = new javax.swing.JLabel();
        jPatientName1 = new javax.swing.JTextField();
        jTPatientAge = new javax.swing.JTextField();
        jPatientGender = new javax.swing.JTextField();
        jPatientEmail = new javax.swing.JTextField();
        jLPatEmail = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jId1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jstNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPatientPhoneNo = new javax.swing.JTextField();
        jLPatName1 = new javax.swing.JLabel();
        jLPatDob1 = new javax.swing.JLabel();
        jLPatAge = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jcity = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCommunity = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jAptNo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("HelpCare");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 18, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lifesavers - Waiting.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 53, -1, 200));

        jPatientName.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientNameActionPerformed(evt);
            }
        });

        jLPatDob.setBackground(new java.awt.Color(247, 247, 255));
        jLPatDob.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatDob.setText("Date Of Birth:");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLPatGender.setBackground(new java.awt.Color(247, 247, 255));
        jLPatGender.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatGender.setText("Gender:");
        jPanel2.add(jLPatGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLPatPhone.setBackground(new java.awt.Color(247, 247, 255));
        jLPatPhone.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatPhone.setText("Phone:");
        jPanel2.add(jLPatPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jPatientName1.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPatientName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientName1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPatientName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 161, -1));

        jTPatientAge.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jTPatientAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPatientAgeActionPerformed(evt);
            }
        });
        jPanel2.add(jTPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 161, -1));

        jPatientGender.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPatientGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientGenderActionPerformed(evt);
            }
        });
        jPanel2.add(jPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 161, -1));

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
        jPanel2.add(jPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 161, -1));

        jLPatEmail.setBackground(new java.awt.Color(247, 247, 255));
        jLPatEmail.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatEmail.setText("Email:");
        jPanel2.add(jLPatEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setBackground(new java.awt.Color(247, 247, 255));
        jLabel5.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel5.setText("SSN:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jId1.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jId1ActionPerformed(evt);
            }
        });
        jPanel2.add(jId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 161, -1));

        jButton2.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel8.setBackground(new java.awt.Color(247, 247, 255));
        jLabel8.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel8.setText("Street Name:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jstNo.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPanel2.add(jstNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 161, -1));

        jLabel9.setBackground(new java.awt.Color(247, 247, 255));
        jLabel9.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel9.setText("ZipCode:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jSt.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPanel2.add(jSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 161, -1));

        jLabel12.setBackground(new java.awt.Color(247, 247, 255));
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 389, -1, 32));

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
        jPanel2.add(jPatientPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 161, -1));

        jLPatName1.setBackground(new java.awt.Color(247, 247, 255));
        jLPatName1.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatName1.setText("Name:");
        jPanel2.add(jLPatName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLPatDob1.setBackground(new java.awt.Color(247, 247, 255));
        jLPatDob1.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatDob1.setText("Date Of Birth:");
        jPanel2.add(jLPatDob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLPatAge.setBackground(new java.awt.Color(247, 247, 255));
        jLPatAge.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLPatAge.setText("Age:");
        jPanel2.add(jLPatAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jButton4.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jcity.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcityActionPerformed(evt);
            }
        });
        jPanel2.add(jcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 161, 30));

        jLabel6.setBackground(new java.awt.Color(247, 247, 255));
        jLabel6.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel6.setText("City:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jLabel7.setBackground(new java.awt.Color(247, 247, 255));
        jLabel7.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel7.setText("Community:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jCommunity.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCommunityActionPerformed(evt);
            }
        });
        jPanel2.add(jCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 161, 31));

        jLabel10.setBackground(new java.awt.Color(247, 247, 255));
        jLabel10.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jLabel10.setText("Apt No:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jAptNo.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jPanel2.add(jAptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 161, -1));

        jButton5.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jButton6.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jButton6.setText("Register");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLPatDob)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLPatDob)
                .addContainerGap(699, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add and Edit Patient ", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(312, 312, 312))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(1054, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View and Delete Patient", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCommunityActionPerformed

    private void jcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcityActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPatientPhoneNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPatientPhoneNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientPhoneNoKeyReleased

    private void jPatientPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientPhoneNoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jId1ActionPerformed

    private void jPatientEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPatientEmailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientEmailKeyReleased

    private void jPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientEmailActionPerformed

    private void jPatientGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientGenderActionPerformed

    private void jTPatientAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPatientAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPatientAgeActionPerformed

    private void jPatientName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientName1ActionPerformed

    private void jPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAptNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jCommunity;
    private javax.swing.JTextField jId1;
    private javax.swing.JLabel jLPatAge;
    private javax.swing.JLabel jLPatDob;
    private javax.swing.JLabel jLPatDob1;
    private javax.swing.JLabel jLPatEmail;
    private javax.swing.JLabel jLPatGender;
    private javax.swing.JLabel jLPatName1;
    private javax.swing.JLabel jLPatPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPatientEmail;
    private javax.swing.JTextField jPatientGender;
    private javax.swing.JTextField jPatientName;
    private javax.swing.JTextField jPatientName1;
    private javax.swing.JTextField jPatientPhoneNo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSt;
    private javax.swing.JTextField jTPatientAge;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcity;
    private javax.swing.JTextField jstNo;
    // End of variables declaration//GEN-END:variables
}
