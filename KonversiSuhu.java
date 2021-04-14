// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2 A - Sistem Informasi 
// Mata Kuliah  : Pemrograman Lanjut
// Hari/Tanggal : Jum'at 9 April 2021 

package GUI;

public class KonversiSuhu extends javax.swing.JFrame {
    double Celcius;
    double Farenheit;
    double Kelvin;
    double Reamur;

    public KonversiSuhu() {
        initComponents();
    }
    private void Celcius(){
         Celcius = Double.parseDouble(txtSuhu.getText());
         Farenheit = Celcius * 1.8 + 32;
         Kelvin = Celcius +273.15;
         Reamur = Celcius * 0.8;
        lblCelcius.setText(Celcius+" Celcius");
        lblFarenheit.setText(Farenheit+" Farenheit");
        lblKelvin.setText(Kelvin+" Kelvin");
        lblReamur.setText(Reamur+" Reamur");  
    }
    private void Farenheit(){
         Farenheit = Double.parseDouble(txtSuhu.getText());
         Celcius = (Farenheit - 32) / 1.8;
         Reamur = (Farenheit - 32) / 2.25;
         Kelvin = (Farenheit + 459.67) / 1.8;
        lblCelcius.setText(Celcius+" Celcius");
        lblFarenheit.setText(Farenheit+" Farenheit");
        lblKelvin.setText(Kelvin+" Kelvin");
        lblReamur.setText(Reamur+" Reamur");
    }
    private void Kelvin(){
         Kelvin = Double.parseDouble(txtSuhu.getText());
         Farenheit = Kelvin * 1.8 - 459.67;
         Celcius = Kelvin - 273.15;
         Reamur = (Kelvin - 273.15) * 0.8;
        lblCelcius.setText(Celcius+" Celcius");
        lblFarenheit.setText(Farenheit+" Farenheit");
        lblKelvin.setText(Kelvin+" Kelvin");
        lblReamur.setText(Reamur+" Reamur");     
    }
    private void Reamur(){
         Reamur = Double.parseDouble(txtSuhu.getText());
         Farenheit = (Reamur * 2.25) + 32;
         Kelvin = (Reamur / 0.8) + 273.15;
         Celcius = (Reamur / 0.8);
        lblCelcius.setText(Celcius+" Celcius");
        lblFarenheit.setText(Farenheit+" Farenheit");
        lblKelvin.setText(Kelvin+" Kelvin");
        lblReamur.setText(Reamur+" Reamur");  
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLebel2 = new javax.swing.JLabel();
        lblCelcius = new javax.swing.JLabel();
        lblFarenheit = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        lblReamur = new javax.swing.JLabel();
        btnKonversi = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtSuhu = new javax.swing.JTextField();
        rbCelcius = new javax.swing.JRadioButton();
        rbFarenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Aplikasi Konversi Suhu");

        jLebel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLebel2.setText("Hasil Konversi ");

        lblCelcius.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCelcius.setText("Celcius");

        lblFarenheit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFarenheit.setText("Farenheit");

        lblKelvin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblKelvin.setText("Kelvin");

        lblReamur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReamur.setText("Reamur");

        btnKonversi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtSuhu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        rbCelcius.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbCelcius.setText("Celcius");

        rbFarenheit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbFarenheit.setText("Farenheit");

        rbKelvin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbKelvin.setText("Kelvin");

        rbReamur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbReamur.setText("Reamur");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Masukan Suhu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSuhu)
                            .addComponent(btnKonversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbCelcius)
                                        .addGap(10, 10, 10)
                                        .addComponent(rbFarenheit)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbKelvin)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbReamur))))))
                    .addComponent(jLebel2)
                    .addComponent(lblCelcius)
                    .addComponent(lblFarenheit)
                    .addComponent(lblKelvin)
                    .addComponent(lblReamur)
                    .addComponent(jLabel7))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCelcius)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbFarenheit)
                        .addComponent(rbKelvin)
                        .addComponent(rbReamur)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKonversi)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLebel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCelcius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFarenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKelvin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReamur)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        if (rbCelcius.isSelected()){
            Celcius();
        }else if(rbFarenheit.isSelected()){
            Farenheit();
        }else if(rbKelvin.isSelected()){
            Kelvin();
        }else if(rbReamur.isSelected()){
            Reamur();
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSuhu.setText("");
        lblCelcius.setText("Celcius");
        lblFarenheit.setText("Farenheit");
        lblKelvin.setText("Kelvin");
        lblReamur.setText("Reamur");
        rbCelcius.setSelected(false);
        rbFarenheit.setSelected(false);
        rbKelvin.setSelected(false);
        rbReamur.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLebel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelcius;
    private javax.swing.JLabel lblFarenheit;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JLabel lblReamur;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFarenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
