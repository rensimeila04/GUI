/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilanjutan;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class lat3 extends javax.swing.JFrame {

    /**
     * Creates new form lat3
     */
    public lat3() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        sis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jari = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb = new javax.swing.JTextField();
        tg = new javax.swing.JTextField();
        pj = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel8.setText("MASUKKAN PANJANG SISI");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(28, 25, 160, 14);
        jPanel2.add(sis);
        sis.setBounds(30, 50, 180, 40);

        jLabel9.setText("CM");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(220, 60, 15, 14);

        jButton2.setText("VOLUME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(30, 110, 90, 23);

        jTabbedPane1.addTab("Kubus", jPanel2);

        jPanel3.setLayout(null);

        jLabel10.setText("MASUKKAN PANJANG JARI JARI");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 28, 200, 14);
        jPanel3.add(jari);
        jari.setBounds(10, 50, 150, 40);

        jLabel11.setText("CM");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(180, 60, 20, 14);

        jButton3.setText("VOLUME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(40, 110, 90, 23);

        jTabbedPane1.addTab("Bola", jPanel3);

        jPanel1.setLayout(null);

        jLabel2.setText("MASUKKAN PANJANG");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 11, 110, 14);

        jLabel3.setText("MASUKKAN LEBAR");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 50, 110, 14);

        jLabel4.setText("MASUKKAN TINGGI");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 90, 110, 14);
        jPanel1.add(lb);
        lb.setBounds(120, 50, 190, 40);
        jPanel1.add(tg);
        tg.setBounds(120, 90, 190, 40);
        jPanel1.add(pj);
        pj.setBounds(120, 10, 190, 40);

        jLabel5.setText("CM");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 20, 34, 14);

        jLabel6.setText("CM");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 60, 20, 14);

        jLabel7.setText("CM");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 100, 30, 14);

        jButton1.setText("HITUNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 150, 110, 23);

        jTabbedPane1.addTab("Balok", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 80, 400, 230);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PROGRAM PENCARI VOLUME BANGUN RUANG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 370, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

int panjang, lebar, tinggi;
panjang = Integer.parseInt(pj.getText());
lebar = Integer.parseInt(lb.getText());
tinggi = Integer.parseInt(tg.getText());
int hasil =panjang*lebar*tinggi;
try{
    JOptionPane.showMessageDialog(null, "Volume Balok Adalah :"+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
}catch(Exception e){
    JOptionPane.showMessageDialog(null, "Error:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
}

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
float jarijari;
jarijari=Integer.parseInt(jari.getText());
float hasil = (float)(4/3*3.14*jarijari*jarijari*jarijari);
try{
    JOptionPane.showMessageDialog(null, "Volume Bola Adalah : "+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
}catch  (Exception e){
    JOptionPane.showMessageDialog(null,"error"+ e,"gagal",JOptionPane.WARNING_MESSAGE);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int sisi;
sisi=Integer.parseInt(sis.getText());
int hasil = sisi*sisi*sisi;
try{
    JOptionPane.showMessageDialog(null, "Volume Kubus Adalah : "+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
}catch  (Exception e){
    JOptionPane.showMessageDialog(null,"error"+ e,"gagal",JOptionPane.WARNING_MESSAGE);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lat3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jari;
    private javax.swing.JTextField lb;
    private javax.swing.JTextField pj;
    private javax.swing.JTextField sis;
    private javax.swing.JTextField tg;
    // End of variables declaration//GEN-END:variables
}
