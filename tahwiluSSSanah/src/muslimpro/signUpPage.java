/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

import java.awt.Color;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sayyed
 */
public class signUpPage extends javax.swing.JFrame {
    private String id;
    String aktivitas = "SIGN UP";
    /**
     * Creates new form login
     */
    public signUpPage() {
        initComponents();
         this.setLocationRelativeTo(null);
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
        namaBelakang = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        exitPage = new javax.swing.JLabel();
        minimizePage = new javax.swing.JLabel();
        joinLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        namaBelakang.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        namaBelakang.setForeground(new java.awt.Color(204, 204, 204));
        namaBelakang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namaBelakang.setText("Last Name . . .");
        namaBelakang.setBorder(null);
        namaBelakang.setOpaque(false);
        namaBelakang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaBelakangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaBelakangFocusLost(evt);
            }
        });
        namaBelakang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                namaBelakangMouseClicked(evt);
            }
        });

        email.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setText("Email . . .");
        email.setBorder(null);
        email.setOpaque(false);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });

        exitPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPageMouseClicked(evt);
            }
        });

        minimizePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizePageMouseClicked(evt);
            }
        });

        joinLabel.setBackground(new java.awt.Color(255, 255, 255));
        joinLabel.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        joinLabel.setForeground(new java.awt.Color(255, 255, 255));
        joinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        joinLabel.setText("JOIN !");
        joinLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        joinLabel.setOpaque(true);
        joinLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                joinLabelMouseEntered(evt);
            }
        });

        firstName.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        firstName.setForeground(new java.awt.Color(204, 204, 204));
        firstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstName.setText("First Name . . .");
        firstName.setBorder(null);
        firstName.setOpaque(false);
        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFocusLost(evt);
            }
        });
        firstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstNameMouseClicked(evt);
            }
        });

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muslimpro/signUp.jpg"))); // NOI18N
        background.setText("jLabel1");
        background.setPreferredSize(new java.awt.Dimension(450, 500));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(minimizePage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(exitPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(namaBelakang, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(joinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizePage, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitPage, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180)
                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(namaBelakang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(joinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseEntered
        joinLabel.setBackground(new java.awt.Color(113, 15, 19));
        joinLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_backgroundMouseEntered

    private void minimizePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizePageMouseClicked
        // TODO add your handling code here:
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizePageMouseClicked

    private void joinLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinLabelMouseEntered
        joinLabel.setForeground(new java.awt.Color(113, 15, 19));
        joinLabel.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_joinLabelMouseEntered

    private void exitPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPageMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitPageMouseClicked

    private void firstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusGained
        if(firstName.getText().equals("First Name . . .")){
           firstName.setText("");
           firstName.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_firstNameFocusGained

    private void firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusLost
       
        if (firstName.getText().equals("")){
             firstName.setText("First Name . . .");
             firstName.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_firstNameFocusLost

    private void firstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameMouseClicked
        firstName.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_firstNameMouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
       if(email.getText().equals("Email . . .")){
          email.setText("");
          email.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (email.getText().equals("")){
            email.setText("Email . . .");
            email.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_emailFocusLost

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
       email.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_emailMouseClicked

    private void namaBelakangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaBelakangFocusGained
         if(namaBelakang.getText().equals("Last Name . . .")){
          namaBelakang.setText("");
          namaBelakang.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_namaBelakangFocusGained

    private void namaBelakangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaBelakangFocusLost
         if (namaBelakang.getText().equals("")){
            namaBelakang.setText("Last Name . . .");
            namaBelakang.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_namaBelakangFocusLost

    private void namaBelakangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namaBelakangMouseClicked
       namaBelakang.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_namaBelakangMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String nama = firstName.getText();
        String belakang = namaBelakang.getText();
        String campur = nama + " " + belakang;
        
        login masuk = new login(campur,getId());
        masuk.show();
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void joinLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinLabelMouseClicked
      signData input = new signData();
      input.setNamaDepan(firstName.getText());
      input.setNamaBelakang(namaBelakang.getText());
      String campur = firstName.getText() + " " + namaBelakang.getText();
      input.setEmail(email.getText());
      input.saveData();
        System.out.println(email);
      
      try {
                     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                     Date date = new Date();
                    
                     signData ea = new signData();
                    String sqlregister = "INSERT INTO `histori`(`aktivitas`,  `email`, `nama_lengkap`,`waktu` ) "
                            + "VALUES ('"+aktivitas+"','"+email.getText()+"','"+campur+"','"+date+"')";
                    
                    java.sql.Connection con = (Connection)koneksi.koneksiDB();
                    java.sql.PreparedStatement pstm = con.prepareStatement(sqlregister);
                    pstm.execute();
                     System.out.println("BERHASIL SIGN");
                    
                
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.toString()) ;}

    }//GEN-LAST:event_joinLabelMouseClicked

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
            java.util.logging.Logger.getLogger(signUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel background;
    public javax.swing.JTextField email;
    public javax.swing.JLabel exitPage;
    public javax.swing.JTextField firstName;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel joinLabel;
    public javax.swing.JLabel minimizePage;
    public javax.swing.JTextField namaBelakang;
    // End of variables declaration//GEN-END:variables

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
