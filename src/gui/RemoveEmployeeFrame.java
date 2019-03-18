/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.EmpDao;
import pojo.EmpPojo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rashika
 */
public class RemoveEmployeeFrame extends javax.swing.JFrame {
    ArrayList<EmpPojo> eList;
    private String eid;
    

    /**
     * Creates new form RemoveEmployeeFrame
     */
    public RemoveEmployeeFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
    }
     public void showInTable()
    {  
       
            
            if(eList.isEmpty()==true)
            {
                JOptionPane.showMessageDialog(null,"Sorry no data available","Error",JOptionPane.ERROR_MESSAGE);
                
            }
            else
            {
                Object[] row=new Object[4];
                DefaultTableModel model=(DefaultTableModel)jTableDetail.getModel();
                for(EmpPojo e:eList)
                {
                row[0]=e.getEmpno();
                row[1]=e.getEname();
                row[2]=e.getEjob();
                row[3]=e.getSal();
                
                model.addRow(row);
                }
            
            }
             
    }
     public boolean validateInput()
{
    if(textEmpId.getText().isEmpty())
        return false;
    else 
        return true;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textEmpId = new javax.swing.JTextField();
        jbSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetail = new javax.swing.JTable();
        jbDel = new javax.swing.JButton();
        jbBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REMOVE EMPLOYEE");

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EmpId");

        jbSearch.setBackground(new java.awt.Color(0, 153, 153));
        jbSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbSearch.setForeground(new java.awt.Color(255, 255, 255));
        jbSearch.setText("Search");
        jbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSearchActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTableDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpId", "Ename", "Job", "Salary"
            }
        ));
        jScrollPane1.setViewportView(jTableDetail);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        jbDel.setBackground(new java.awt.Color(0, 153, 153));
        jbDel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbDel.setForeground(new java.awt.Color(255, 255, 255));
        jbDel.setText("Delete Emp");
        jbDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDelActionPerformed(evt);
            }
        });

        jbBack.setBackground(new java.awt.Color(0, 153, 153));
        jbBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbBack.setForeground(new java.awt.Color(255, 255, 255));
        jbBack.setText("Back");
        jbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jbSearch))
                            .addComponent(jLabel1)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jbDel)
                .addGap(122, 122, 122)
                .addComponent(jbBack)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(textEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbSearch))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDel)
                    .addComponent(jbBack))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSearchActionPerformed
        // TODO add your handling code here:
 try
 {
      if(textEmpId.getText().isEmpty())
               return;
          eid=textEmpId.getText();
                eList=EmpDao.getEmployeeDataById(eid); 
                showInTable();
 }  
  catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null,"Error while connecting to  database"," Exception!",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
       }
  
    }//GEN-LAST:event_jbSearchActionPerformed

    private void jbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackActionPerformed
        // TODO add your handling code here:
          AdminOptionsFrame  addemp=new AdminOptionsFrame();
        addemp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbBackActionPerformed

    private void jbDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDelActionPerformed
        // TODO add your handling code here:
       if(validateInput()==false)
        {
           JOptionPane.showMessageDialog(null,"There is no employee available for this Employee ID"," Exception!",JOptionPane.INFORMATION_MESSAGE);
        }
        try
        { EmpPojo e=new EmpPojo();
           // String catname=(String)comboCategory.getSelectedItem();
            String empno=textEmpId.getText();
            e.setEmpno(empno);
          if(EmpDao.removeEmployee(empno))
           {    
           JOptionPane.showMessageDialog(null,"Product deleted"," Exception!",JOptionPane.INFORMATION_MESSAGE);
           textEmpId.setText(" ");
             DefaultTableModel model=(DefaultTableModel)jTableDetail.getModel();
             //jTableDetail.setRowCount(0);
           }
         else
              
               JOptionPane.showMessageDialog(null,"Product not deleted"," Exception!",JOptionPane.INFORMATION_MESSAGE);       
        }
        catch(SQLException sq)
                {
                  JOptionPane.showMessageDialog(null,"Error in Sql"+sq," input Error!",JOptionPane.ERROR_MESSAGE);
            sq.printStackTrace();  
                }
            
    }//GEN-LAST:event_jbDelActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetail;
    private javax.swing.JButton jbBack;
    private javax.swing.JButton jbDel;
    private javax.swing.JButton jbSearch;
    private javax.swing.JTextField textEmpId;
    // End of variables declaration//GEN-END:variables
}
