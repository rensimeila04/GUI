/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilanjutan;

/**
 *
 * @author Asus
 */
public class gl1 extends javax.swing.JFrame {

    /**
     * Creates new form gl1
     */
    public gl1() {
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

        jurusan = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ABSEN = new javax.swing.JTextField();
        ALAMAT = new javax.swing.JTextField();
        NAMA = new javax.swing.JTextField();
        RDB1 = new javax.swing.JRadioButton();
        RDB2 = new javax.swing.JRadioButton();
        KELAS = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("NAMA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(9, 60, 60, 14);

        jLabel2.setText("ABSEN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 110, 70, 14);

        jLabel3.setText("KELAS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 160, 70, 14);

        jLabel4.setText("JURUSAN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 200, 70, 14);

        jLabel5.setText("ALAMAT");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 240, 70, 14);

        jLabel6.setText("===BIODATA===");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 10, 100, 14);

        ABSEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABSENActionPerformed(evt);
            }
        });
        getContentPane().add(ABSEN);
        ABSEN.setBounds(100, 100, 190, 30);
        getContentPane().add(ALAMAT);
        ALAMAT.setBounds(100, 230, 190, 30);
        getContentPane().add(NAMA);
        NAMA.setBounds(100, 60, 190, 30);

        jurusan.add(RDB1);
        RDB1.setText("RPL");
        getContentPane().add(RDB1);
        RDB1.setBounds(100, 200, 50, 23);

        jurusan.add(RDB2);
        RDB2.setText("TKJ");
        RDB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDB2ActionPerformed(evt);
            }
        });
        getContentPane().add(RDB2);
        RDB2.setBounds(220, 200, 43, 23);

        KELAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X RPL 5", "X RPL 6", "X RPL 7", " " }));
        getContentPane().add(KELAS);
        KELAS.setBounds(100, 160, 110, 20);

        jButton1.setBackground(new java.awt.Color(204, 255, 153));
        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 280, 80, 23);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 280, 55, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\LOGO.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 10, 340, 370);

        setBounds(0, 0, 416, 407);
    }// </editor-fold>//GEN-END:initComponents

    private void RDB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RDB2ActionPerformed

    private void ABSENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABSENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ABSENActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nama = NAMA.getText();
        String absen = ABSEN.getText();
        String kelas = KELAS.getSelectedItem().toString();
        String jurusan = "";
        String alamat = ALAMAT.getText();
        if (RDB1.isSelected()) 
            jurusan = "RPL";
        else if (RDB2.isSelected()) 
            jurusan = "TKJ";
        else 
            
        if (KELAS.getSelectedItem() == "X RPL 1") {
        }
        if (KELAS.getSelectedItem() == "X RPL 2") {

        }
        if (KELAS.getSelectedItem() == "X RPL 3") {

        }
        if (KELAS.getSelectedItem() == "X RPL 4") {

        }
        if (KELAS.getSelectedItem() == "X RPL 5") {

        }
        if (KELAS.getSelectedItem() == "X RPL 6") {
        }
        if (KELAS.getSelectedItem() == "X RPL 7") {

        }
        new gl2(nama,absen, kelas,jurusan,alamat).setVisible(true);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(gl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gl1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ABSEN;
    private javax.swing.JTextField ALAMAT;
    private javax.swing.JComboBox<String> KELAS;
    private javax.swing.JTextField NAMA;
    private javax.swing.JRadioButton RDB1;
    private javax.swing.JRadioButton RDB2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.ButtonGroup jurusan;
    // End of variables declaration//GEN-END:variables
}
