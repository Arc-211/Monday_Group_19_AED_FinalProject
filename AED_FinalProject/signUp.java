package main;

import GymEnterprise.MemberLogin;
import Pharmacy.InventoryEnterpriseLogin;
import bankEnterprise.financialLogin;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import emergencyEnterprise.emergencyLogin;
import javax.swing.JOptionPane;
//import java.sql.Connection;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import universitysystem.JDBCConnection;
//import view.panel.login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package view.panel;

import javax.swing.JOptionPane;
import university.uniLogin;

/**
 *
 * @author Team AAJ
 */
public class signUp extends javax.swing.JFrame {

    /**
     * Creates new form signUp
     */
    public signUp() {
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

        jPanel1 = new javax.swing.JPanel();
        submitBtn = new javax.swing.JButton();
        comboRole = new javax.swing.JComboBox<>();
        jLabelLogoSignUp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn);
        submitBtn.setBounds(690, 580, 110, 24);

        comboRole.setBackground(new java.awt.Color(204, 204, 204));
        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "University Enterprise", "Emergency Enterprise", "Financial Enterprise", "Pharmacy Enterprise", "Gym Enterprise" }));
        comboRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoleActionPerformed(evt);
            }
        });
        jPanel1.add(comboRole);
        comboRole.setBounds(640, 530, 212, 23);

        jLabelLogoSignUp.setBackground(new java.awt.Color(204, 51, 0));
        jLabelLogoSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NortheasternUniversity-logo_small-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabelLogoSignUp);
        jLabelLogoSignUp.setBounds(640, 290, 221, 195);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/main_image_copy-removebg-preview-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1030, 560, 440, 410);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("University Enterprise System");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 170, 670, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main landing.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1480, 930);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        String str =  comboRole.getSelectedItem().toString();
        
        if(str.equals("University Enterprise")){
            setVisible(false);
            new uniLogin().setVisible(true);
        }else if(str.equals("Emergency Enterprise")){
            setVisible(false);
            new emergencyLogin().setVisible(true);
        }else if(str.equals("Financial Enterprise")){
            setVisible(false);
            new financialLogin().setVisible(true);
        }else if(str.equals("Pharmacy Enterprise")){
            setVisible(false);
            new InventoryEnterpriseLogin().setVisible(true);
        }else if(str.equals("Gym Enterprise")){
            setVisible(false);
            new MemberLogin().setVisible(true);
        }
        else{
            setVisible(false);
        }
        
         

//            try{
//                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
//
//                System.out.println("connection open");
//                java.sql.Statement statement = connection.createStatement();
//
//                statement.executeUpdate("insert into universitysystem.login" + "(role, username, password)" + "values ('"+role+"','"+username+"', '"+password+"')");
//                JOptionPane.showMessageDialog(null, "User successfully added!");
//
//                setVisible(false);
//                //new login().setVisible(true);
//                
//            }
            

    }//GEN-LAST:event_submitBtnActionPerformed

    private void comboRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRoleActionPerformed
        

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogoSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}