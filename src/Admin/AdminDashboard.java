/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Tennis.Login;
import java.awt.Color;
import javax.swing.JOptionPane;


import InternalPackage.userDash;
import config.Session;
import courtDash.court;




   
public class AdminDashboard extends javax.swing.JFrame {


    public AdminDashboard() {
         
        initComponents();
        
       

  }
  Color navcolor = new Color(153,153,0);
      Color hovercolor = new Color(204,204,0);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j = new javax.swing.JPanel();
        us = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        stud = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        stulist = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uss = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dash = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        j.setBackground(new java.awt.Color(0, 102, 102));

        us.setBackground(new java.awt.Color(153, 153, 153));
        us.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usMousePressed(evt);
            }
        });
        us.setLayout(null);

        user.setBackground(new java.awt.Color(153, 153, 153));
        user.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("ADMIN");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMousePressed(evt);
            }
        });
        us.add(user);
        user.setBounds(0, 0, 130, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Log out");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        acc_name1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        acc_name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        acc_name.setForeground(new java.awt.Color(255, 255, 255));
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stud.setBackground(new java.awt.Color(204, 204, 204));
        stud.setOpaque(false);
        stud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studMouseExited(evt);
            }
        });
        stud.setLayout(null);

        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stud, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(acc_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayout.createSequentialGroup()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acc_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addGap(166, 166, 166)
                .addComponent(stud, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        stulist.setBackground(new java.awt.Color(0, 102, 102));
        stulist.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        stulist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stulistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stulistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stulistMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("COURT");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout stulistLayout = new javax.swing.GroupLayout(stulist);
        stulist.setLayout(stulistLayout);
        stulistLayout.setHorizontalGroup(
            stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(stulistLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        stulistLayout.setVerticalGroup(
            stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stulistLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(stulist);
        stulist.setBounds(70, 140, 190, 161);

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
        jLabel14.setText("TABLE");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ussLayout = new javax.swing.GroupLayout(uss);
        uss.setLayout(ussLayout);
        ussLayout.setHorizontalGroup(
            ussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ussLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(55, 55, 55))
        );
        ussLayout.setVerticalGroup(
            ussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ussLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel1.add(uss);
        uss.setBounds(320, 140, 190, 160);

        dash.setBackground(new java.awt.Color(153, 153, 153));
        dash.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        dash.setForeground(new java.awt.Color(255, 255, 255));
        dash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash.setText("DASHBOARD");
        dash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashMouseClicked(evt);
            }
        });
        jPanel1.add(dash);
        dash.setBounds(10, 20, 280, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(j, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
          Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void usMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMousePressed

    }//GEN-LAST:event_usMousePressed

    private void usMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseClicked

    }//GEN-LAST:event_usMouseClicked

    private void userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMousePressed
     
    }//GEN-LAST:event_userMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess=  Session.getInstances();
         if(sess.getUid()==0){
              JOptionPane.showMessageDialog(null,"No account, Login First!");
              Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
         }
         acc_name.setText(""+sess.getFname());
    }//GEN-LAST:event_formWindowActivated

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
      
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
      
    }//GEN-LAST:event_userMouseExited

    private void usMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseEntered
          us.setBackground(hovercolor);
    }//GEN-LAST:event_usMouseEntered

    private void usMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseExited
       us.setBackground(navcolor);
    }//GEN-LAST:event_usMouseExited

    private void studMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studMouseEntered
         stud.setBackground(hovercolor);
    }//GEN-LAST:event_studMouseEntered

    private void studMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studMouseExited
                 stud.setBackground(navcolor);
    }//GEN-LAST:event_studMouseExited

    private void stulistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulistMouseEntered
        stulist.setBackground(navcolor);
    }//GEN-LAST:event_stulistMouseEntered

    private void stulistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulistMouseExited
        stulist.setBackground( hovercolor);
    }//GEN-LAST:event_stulistMouseExited

    private void ussMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseClicked

        UserForms ufs= new  UserForms();
        ufs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ussMouseClicked

    private void ussMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseEntered
        uss .setBackground(navcolor);
    }//GEN-LAST:event_ussMouseEntered

    private void ussMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseExited
        uss .setBackground( hovercolor);
    }//GEN-LAST:event_ussMouseExited

    private void dashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseClicked
        userDash ud = new userDash();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashMouseClicked

    private void stulistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulistMouseClicked
        // TODO add your handling code here:
        court crt = new court();
        crt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stulistMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel dash;
    private javax.swing.JPanel j;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel stud;
    private javax.swing.JPanel stulist;
    private javax.swing.JPanel us;
    private javax.swing.JLabel user;
    private javax.swing.JPanel uss;
    // End of variables declaration//GEN-END:variables
}
