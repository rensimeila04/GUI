/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Asus
 */
public class latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form latihan4
     */
    public latihan4() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        tkj = new javax.swing.JRadioButton();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        rpl = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setText("BIODATA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 130, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 50, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 130, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Hobi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 170, 34, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Hasil");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 240, 26, 17);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(100, 50, 180, 30);
        getContentPane().add(absen);
        absen.setBounds(100, 90, 180, 30);

        tkj.setText("TKJ");
        getContentPane().add(tkj);
        tkj.setBounds(150, 130, 43, 23);

        c1.setText("Programing");
        getContentPane().add(c1);
        c1.setBounds(90, 160, 100, 23);

        c2.setText("Animator");
        getContentPane().add(c2);
        c2.setBounds(90, 180, 100, 23);

        c3.setText("Teknisi");
        getContentPane().add(c3);
        c3.setBounds(200, 160, 80, 23);

        c4.setText("Designer");
        getContentPane().add(c4);
        c4.setBounds(200, 180, 80, 23);

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(50, 210, 80, 23);

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 210, 80, 23);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(230, 210, 51, 23);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 260, 250, 140);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        rpl.setText("RPL");
        rpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rplActionPerformed(evt);
            }
        });
        jPanel1.add(rpl);
        rpl.setBounds(100, 140, 43, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 460, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rplActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String Nm = nama.getText();
        String abs = absen.getText();
        String jurusan;
        String hobi="";
        if (rpl.isSelected()) {
            jurusan = "RPL";
            
        }else if (tkj.isSelected()) {
            jurusan = "TKJ";
        }else   {
            jurusan = " ";
        }
        if (c1.isSelected()) 
            hobi+=c1.getText();
            
        if (c2.isSelected()) 
            hobi+=c2.getText();
        if (c3.isSelected()) 
            hobi+=c3.getText();
        if (c4.isSelected()) 
            hobi+=c4.getText();
        hasil.setText("Nama Siswa\t: "+Nm+"\nAbsen\t:"+abs+"\nJurusan\t:"+jurusan+"\nHobi\t:"+hobi);
         
        
    }//GEN-LAST:event_submitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hasil.setText("");
        nama.setText("");
        absen.setText("");
        buttonGroup1.clearSelection();
        c1.setSelected(false);
        c2.setSelected(false);
        c3.setSelected(false);
        c4.setSelected(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JTextArea hasil;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton rpl;
    private javax.swing.JButton submit;
    private javax.swing.JRadioButton tkj;
    // End of variables declaration//GEN-END:variables
}
