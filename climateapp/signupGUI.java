/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package climateapp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author shaun
 */
public class signupGUI extends javax.swing.JFrame {

    /**
     * Creates new form signupGUI
     */
    public signupGUI() {
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

        leftJpnl = new javax.swing.JPanel();
        welcomeJlbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rightJpnl2 = new javax.swing.JPanel();
        loginJlbl = new javax.swing.JLabel();
        emailJlbl2 = new javax.swing.JLabel();
        passwordJlbl2 = new javax.swing.JLabel();
        ageJlbl2 = new javax.swing.JLabel();
        emailJtf2 = new javax.swing.JTextField();
        ageJtf = new javax.swing.JTextField();
        createJbtn = new javax.swing.JButton();
        homeJtbn = new javax.swing.JButton();
        passwordJpf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftJpnl.setBackground(new java.awt.Color(0, 153, 153));

        welcomeJlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        welcomeJlbl.setForeground(new java.awt.Color(255, 255, 102));
        welcomeJlbl.setText("WELCOME");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("TO THE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("SEA LIFE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("APPLICATION");

        javax.swing.GroupLayout leftJpnlLayout = new javax.swing.GroupLayout(leftJpnl);
        leftJpnl.setLayout(leftJpnlLayout);
        leftJpnlLayout.setHorizontalGroup(
            leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJpnlLayout.createSequentialGroup()
                .addGroup(leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftJpnlLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(leftJpnlLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(welcomeJlbl))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        leftJpnlLayout.setVerticalGroup(
            leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJpnlLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(welcomeJlbl)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightJpnl2.setBackground(new java.awt.Color(255, 255, 255));

        loginJlbl.setBackground(new java.awt.Color(0, 0, 0));
        loginJlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginJlbl.setForeground(new java.awt.Color(0, 153, 153));
        loginJlbl.setText("SIGN UP");

        emailJlbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailJlbl2.setText("Email:");

        passwordJlbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordJlbl2.setText("Password");

        ageJlbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageJlbl2.setText("Age:");

        emailJtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJtf2ActionPerformed(evt);
            }
        });

        createJbtn.setBackground(new java.awt.Color(255, 255, 102));
        createJbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createJbtn.setText("Create Account");
        createJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJbtnActionPerformed(evt);
            }
        });

        homeJtbn.setBackground(new java.awt.Color(255, 255, 102));
        homeJtbn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homeJtbn.setText("Menu");
        homeJtbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeJtbnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightJpnl2Layout = new javax.swing.GroupLayout(rightJpnl2);
        rightJpnl2.setLayout(rightJpnl2Layout);
        rightJpnl2Layout.setHorizontalGroup(
            rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJpnl2Layout.createSequentialGroup()
                .addGroup(rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightJpnl2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailJlbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordJlbl2)
                            .addComponent(ageJlbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rightJpnl2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailJtf2)
                                    .addComponent(ageJtf)
                                    .addComponent(passwordJpf, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))))
                    .addGroup(rightJpnl2Layout.createSequentialGroup()
                        .addComponent(homeJtbn)
                        .addGap(140, 140, 140)
                        .addComponent(loginJlbl))
                    .addGroup(rightJpnl2Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(createJbtn)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        rightJpnl2Layout.setVerticalGroup(
            rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJpnl2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginJlbl)
                    .addComponent(homeJtbn))
                .addGap(18, 18, 18)
                .addComponent(emailJlbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordJlbl2)
                .addGap(2, 2, 2)
                .addComponent(passwordJpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ageJlbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ageJtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(createJbtn)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftJpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightJpnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(leftJpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightJpnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailJtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJtf2ActionPerformed

    private void createJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJbtnActionPerformed
        // TODO add your handling code here:
        String email = emailJtf.getText();
        String pass = new String(passwordJpf.getPassword()); //convert password to string because it is in a password text field
        int age = Integer.parseInt(ageJtf.getText());
        if (age < 18){
            JOptionPane.showMessageDialog(null,"You are too young to create an account");
        }
        else{
            JOptionPane.showMessageDialog(null,"You are old enough to create an account");
        }
        
        //declare file handling objectss
        File outFile;
        FileWriter fw;
        BufferedWriter bw;
        
        try{
            //create objects
            outFile = new File("signup.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);
            
            //use objects
            bw.write(email);
            bw.write(pass);
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(null, "Signed up successfully");
        }
        catch(IOException e){
            System.out.println("Error"+e);
        }
    }//GEN-LAST:event_createJbtnActionPerformed

    private void homeJtbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeJtbnActionPerformed
        // TODO add your handling code here:
        welcomeGUI myGUI = new welcomeGUI(); //opening up the seaGUI
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeJtbnActionPerformed

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
            java.util.logging.Logger.getLogger(signupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageJlbl;
    private javax.swing.JLabel ageJlbl1;
    private javax.swing.JLabel ageJlbl2;
    private javax.swing.JTextField ageJtf;
    private javax.swing.JButton createJbtn;
    private javax.swing.JLabel emailJlbl;
    private javax.swing.JLabel emailJlbl1;
    private javax.swing.JLabel emailJlbl2;
    private javax.swing.JTextField emailJtf;
    private javax.swing.JTextField emailJtf1;
    private javax.swing.JTextField emailJtf2;
    private javax.swing.JButton homeJtbn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel leftJpnl;
    private javax.swing.JLabel loginJlbl;
    private javax.swing.JLabel passwordJlbl;
    private javax.swing.JLabel passwordJlbl1;
    private javax.swing.JLabel passwordJlbl2;
    private javax.swing.JPasswordField passwordJpf;
    private javax.swing.JPanel rightJpnl;
    private javax.swing.JPanel rightJpnl1;
    private javax.swing.JPanel rightJpnl2;
    private javax.swing.JLabel signupJlbl;
    private javax.swing.JLabel signupJlbl1;
    private javax.swing.JLabel welcomeJlbl;
    // End of variables declaration//GEN-END:variables
}
