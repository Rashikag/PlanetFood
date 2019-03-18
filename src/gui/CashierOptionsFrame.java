/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import pojo.UserProfile;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashika
 */
public class CashierOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form CashierOptionsFrame
     */
    public CashierOptionsFrame() {
        initComponents();

          super.setLocationRelativeTo(null);
          String st=UserProfile.getUsername();
       jlHello.setText("Hello "+ st);
    }
 public String getOptions()
 {
     if(jrbTakeOrder.isSelected())
     {
         return jrbTakeOrder.getText();
     }
         
     else if(jrbViewOrder.isSelected())
             {
             return jrbViewOrder.getText();
             }
     else if(jrbMenuList.isSelected())
             {
             return jrbViewOrder.getText();
             }
     else 
             return jrbViewOrder.getText();
             
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jrbTakeOrder = new javax.swing.JRadioButton();
        jrbViewOrder = new javax.swing.JRadioButton();
        jrbMenuList = new javax.swing.JRadioButton();
        jrbTransactions = new javax.swing.JRadioButton();
        jlHello = new javax.swing.JLabel();
        jbDo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLANET FOOD CASHIER PANEL");

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Make A Choice");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jrbTakeOrder.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbTakeOrder);
        jrbTakeOrder.setForeground(new java.awt.Color(255, 255, 255));
        jrbTakeOrder.setText("Take Order");

        jrbViewOrder.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbViewOrder);
        jrbViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        jrbViewOrder.setText("View Order");

        jrbMenuList.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbMenuList);
        jrbMenuList.setForeground(new java.awt.Color(255, 255, 255));
        jrbMenuList.setText("View Menu List");

        jrbTransactions.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbTransactions);
        jrbTransactions.setForeground(new java.awt.Color(255, 255, 255));
        jrbTransactions.setText("View Transactions");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrbTransactions)
                    .addComponent(jrbTakeOrder, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbViewOrder, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbMenuList, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jrbTakeOrder)
                .addGap(18, 18, 18)
                .addComponent(jrbViewOrder)
                .addGap(18, 18, 18)
                .addComponent(jrbMenuList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jrbTransactions)
                .addGap(26, 26, 26))
        );

        jlHello.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlHello.setForeground(new java.awt.Color(255, 255, 255));

        jbDo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbDo.setForeground(new java.awt.Color(255, 255, 255));
        jbDo.setText("Do");
        jbDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlHello, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jbDo)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlHello)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbDo)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoActionPerformed
        // TODO add your handling code here:
         String task=getOptions();
           if(task==null)
           {
              JOptionPane.showMessageDialog(null,"Please make a choice","Error",JOptionPane.ERROR_MESSAGE); 
              return;
           }
          else
           {
               JFrame jf=null;
           if(task.equals("Take Order"))
               jf=new TakeOrderFrame();
           else if(task.equals("View Order"))
               jf=new ViewOrderFrame();
           else if(task.equals("View Menu List"))
               jf=new ViewOrderFrame();
           else if(task.equals("View Transactions"))
               jf=new ViewOrderFrame();
            this.dispose();
          jf.setVisible(true);
         
           }
    }//GEN-LAST:event_jbDoActionPerformed

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
            java.util.logging.Logger.getLogger(CashierOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbDo;
    private javax.swing.JLabel jlHello;
    private javax.swing.JRadioButton jrbMenuList;
    private javax.swing.JRadioButton jrbTakeOrder;
    private javax.swing.JRadioButton jrbTransactions;
    private javax.swing.JRadioButton jrbViewOrder;
    // End of variables declaration//GEN-END:variables
}