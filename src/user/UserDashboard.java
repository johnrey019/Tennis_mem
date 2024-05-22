/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Tennis.Login;
import java.awt.Color;
import javax.swing.JOptionPane;

import InternalPackage.userDash;
import config.Session;




   
public class UserDashboard extends javax.swing.JFrame {


    
    public UserDashboard() {
         
        initComponents();
        
        
  }
      Color navcolor = new Color(153,153,0);
      Color hovercolor = new Color(204,204,0);
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();
        acc_user = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        desh = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        uss = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        gra = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dash = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        j.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Log out");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        acc_name1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_name1.setForeground(new java.awt.Color(255, 255, 255));
        acc_name1.setText("USER");

        acc_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc_user.setForeground(new java.awt.Color(255, 255, 255));
        acc_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(acc_name1)
                        .addGap(348, 348, 348)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(acc_user, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(acc_name1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc_user, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(30, 30, 30))
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        desh.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        uss.setBackground(new java.awt.Color(0, 102, 102));
        uss.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        uss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ussMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ussMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ussMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CHANGE PASS");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ussLayout = new javax.swing.GroupLayout(uss);
        uss.setLayout(ussLayout);
        ussLayout.setHorizontalGroup(
            ussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ussLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(55, 55, 55))
        );
        ussLayout.setVerticalGroup(
            ussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ussLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(uss);
        uss.setBounds(340, 180, 200, 160);

        gra.setBackground(new java.awt.Color(0, 102, 102));
        gra.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        gra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Assigned");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout graLayout = new javax.swing.GroupLayout(gra);
        gra.setLayout(graLayout);
        graLayout.setHorizontalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );
        graLayout.setVerticalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graLayout.createSequentialGroup()
                .addGroup(graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(gra);
        gra.setBounds(80, 170, 200, 160);

        dash.setBackground(new java.awt.Color(153, 153, 153));
        dash.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        dash.setForeground(new java.awt.Color(255, 255, 255));
        dash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash.setText("DASHBOARD");
        jPanel1.add(dash);
        dash.setBounds(10, 20, 270, 44);

        javax.swing.GroupLayout deshLayout = new javax.swing.GroupLayout(desh);
        desh.setLayout(deshLayout);
        deshLayout.setHorizontalGroup(
            deshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deshLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        deshLayout.setVerticalGroup(
            deshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(j, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
          Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess=  Session.getInstances();
         if(sess.getUid()==0){
              JOptionPane.showMessageDialog(null,"No account, Login First!");
              Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
         }
         acc_user.setText(""+sess.getFname());
    }//GEN-LAST:event_formWindowActivated

    private void ussMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseExited
        uss .setBackground(hovercolor);
    }//GEN-LAST:event_ussMouseExited

    private void ussMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseEntered
        uss .setBackground(navcolor);
    }//GEN-LAST:event_ussMouseEntered

    private void ussMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseClicked

        accountDetails adt= new  accountDetails();
        adt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ussMouseClicked

    private void graMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graMouseExited
        gra .setBackground(hovercolor);
    }//GEN-LAST:event_graMouseExited

    private void graMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graMouseEntered
        gra .setBackground(navcolor);
    }//GEN-LAST:event_graMouseEntered

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel acc_user;
    private javax.swing.JLabel dash;
    private javax.swing.JPanel desh;
    private javax.swing.JPanel gra;
    private javax.swing.JPanel j;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel uss;
    // End of variables declaration//GEN-END:variables
}
