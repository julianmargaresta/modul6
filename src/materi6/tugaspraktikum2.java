/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi6;

/**
 *
 * @author M12RjUL14n
 */
public class tugaspraktikum2 extends javax.swing.JFrame {
 String jns ="";
    int jml;
   
    public tugaspraktikum2() {
        initComponents();
        getJumlah();
        setJenis();
        Panel.setVisible(false);
        pilihanbil.setEnabled(false);
        bil1.setVisible(false);
        bil2.setVisible(false);
        bil3.setVisible(false);
        bil4.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        pilihanbil = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jenis = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ket = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        bil1 = new javax.swing.JTextField();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        bil2 = new javax.swing.JTextField();
        bil3 = new javax.swing.JTextField();
        bil4 = new javax.swing.JTextField();
        JButton1 = new javax.swing.JButton();
        thasil = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Panel.setLayout(null);

        pilihanbil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        pilihanbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanbilActionPerformed(evt);
            }
        });
        Panel.add(pilihanbil);
        pilihanbil.setBounds(120, 70, 143, 20);

        jLabel1.setText("PROGRAM ARITMATIKA");
        Panel.add(jLabel1);
        jLabel1.setBounds(149, 11, 115, 14);

        jLabel2.setText("jenis aritmatika");
        Panel.add(jLabel2);
        jLabel2.setBounds(23, 46, 72, 14);

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "penjumlahan", "pengurangan", "perkalian", "pembagian" }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        Panel.add(jenis);
        jenis.setBounds(150, 40, 143, 20);

        jLabel3.setText("operasi");
        Panel.add(jLabel3);
        jLabel3.setBounds(23, 114, 35, 14);
        Panel.add(ket);
        ket.setBounds(133, 134, 128, 35);

        jLabel4.setText("Jumlah Bilangan");
        Panel.add(jLabel4);
        jLabel4.setBounds(23, 183, 76, 14);

        b1.setText("Bilangan 1");
        Panel.add(b1);
        b1.setBounds(23, 221, 49, 14);

        bil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bil1ActionPerformed(evt);
            }
        });
        Panel.add(bil1);
        bil1.setBounds(143, 218, 143, 20);

        b2.setText("Bilangan 2");
        Panel.add(b2);
        b2.setBounds(23, 264, 49, 14);

        b3.setText("Bilangan 3");
        Panel.add(b3);
        b3.setBounds(23, 302, 49, 14);

        b4.setText("Bilangan 4");
        Panel.add(b4);
        b4.setBounds(23, 340, 49, 14);
        Panel.add(bil2);
        bil2.setBounds(143, 261, 143, 20);
        Panel.add(bil3);
        bil3.setBounds(143, 299, 143, 20);
        Panel.add(bil4);
        bil4.setBounds(143, 337, 143, 20);

        JButton1.setText("HASIL");
        JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton1ActionPerformed(evt);
            }
        });
        Panel.add(JButton1);
        JButton1.setBounds(225, 375, 61, 23);
        Panel.add(thasil);
        thasil.setBounds(143, 409, 141, 64);

        getContentPane().add(Panel);
        Panel.setBounds(20, 110, 350, 380);

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
       setJenis();
    }//GEN-LAST:event_jenisActionPerformed
    if(jenis.getSelectedItem().equals("Penjumlahan")){
            jns="Penjumlahan";
            ket.setText("Penjumlahan");
            panel.setVisible(true);
            pilihanbil.setEnabled(true);
        }
        else if (jenis.getSelectedItem().equals("Pengurangan")){
            jns="Pengurangan";
            ket.setText("Pengurangan");
            panel.setVisible(true);
            pilihanbil.setEnabled(true);
        }
        else if (jenis.getSelectedItem().equals("Perkalian")){
            jns="Perkalian";
            ket.setText("Perkalian");
            panel.setVisible(true);
            pilihanbil.setEnabled(true);
        }
        else if (jenis.getSelectedItem().equals("Pembagian")){
            jns="Pembagian";
            ket.setText("Pembagian");
            panel.setVisible(true);
            pilihanbil.setEnabled(true);
        }
        
}
    private void pilihanbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanbilActionPerformed
        getJumlah();
    }//GEN-LAST:event_pilihanbilActionPerformed

    private void JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton1ActionPerformed
        Double hsl = 0.0;
        Double a1, a2, a3, a4 = Double.parseDouble(b1.getText().toString());
        a1 = Double.parseDouble(b1.getText().toString());
         a2 = Double.parseDouble(b1.getText().toString());
          a3 = Double.parseDouble(b1.getText().toString());
           a4 = Double.parseDouble(b1.getText().toString());
        if(jns.equals("penjumlahan")){
            if(jml == 2){
            hsl = a1 + a2;
            thasil.setText(""+a1 + "+"+a2+"="+hsl);
        }
            if(jml == 3){
            hsl = a1 + a2 + a3;
            thasil.setText(""+a1 + "+"+a2+"+"+a3+"="+hsl);
        }
            
            if(jml == 4){
            hsl = a1 + a2 + a3 + a4;
            thasil.setText(""+a1 + "+"+a2+"+"+a3+"+"+a4+"="+hsl);
        }
        }
        else if(jns.equals("Pengurangan")){
            if(jml == 2){
                hsl = a1-a2;
                thasil.setText(""+a1+ " - "+a2+ " = " +hsl);
            }
            else if(jml == 3){
                hsl = a1-a2-a3;
                thasil.setText(""+a1+ " - "+a2+ " - "+a3+ " = " +hsl);
            }
             else if(jml == 4){
                hsl = a1-a2-a3-a4;
                thasil.setText(""+a1+ " - "+a2+ " - "+a3+ " - "+a4+ " = " +hsl);
            }
        }
        else if(jns.equals("Perkalian")){
            if(jml == 2){
                hsl = a1*a2;
                thasil.setText(""+a1+ " x "+a2+ " = " +hsl);
            }
            else if(jml == 3){
                hsl = a1*a2*a3;
                thasil.setText(""+a1+ " x "+a2+ " x "+a3+ " = " +hsl);
            }
             else if(jml == 4){
                hsl = a1*a2*a3*a4;
                thasil.setText(""+a1+ " x "+a2+ " x "+a3+ " x "+a4+ " = " +hsl);
            }
        }
        else if(jns.equals("Pembagian")){
            if(jml == 2){
                hsl = a1/a2;
                thasil.setText(""+a1+ " : "+a2+ " = " +hsl);
            }
            else if(jml == 3){
                hsl = a1/a2/a3;
                thasil.setText(""+a1+ " : "+a2+ " : "+a3+ " = " +hsl);
            }
             else if(jml == 4){
                hsl = a1/a2/a3/a4;
                thasil.setText(""+a1+ " : "+a2+ " : "+a3+ " : "+a4+ " = " +hsl);
            }
}
    }//GEN-LAST:event_JButton1ActionPerformed

    private void bil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bil1ActionPerformed
    public void getJumlah(){
        if(pilihanbil.getSelectedItem().equals("2")){
            bil3.setVisible(false);
            bil4.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            bil1.setVisible(true);
            bil2.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            jml = 2;
        }
        else if(pilihanbil.getSelectedItem().equals("3")){
            bil1.setVisible(true);
            bil2.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            bil3.setVisible(true);
            bil4.setVisible(false);
            b3.setVisible(true);
            b4.setVisible(false);
            jml = 3;
        }
        else if(pilihanbil.getSelectedItem().equals("4")){
            bil1.setVisible(true);
            bil2.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            bil3.setVisible(true);
            bil4.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            jml = 4;
        }
    }
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
            java.util.logging.Logger.getLogger(tugaspraktikum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tugaspraktikum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tugaspraktikum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tugaspraktikum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tugaspraktikum2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton1;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JTextField bil1;
    private javax.swing.JTextField bil2;
    private javax.swing.JTextField bil3;
    private javax.swing.JTextField bil4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JLabel ket;
    private javax.swing.JComboBox<String> pilihanbil;
    private javax.swing.JTextField thasil;
    // End of variables declaration//GEN-END:variables



}
