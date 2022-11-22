package com.view;

import com.model.model_siswa;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public final class Siswa extends javax.swing.JFrame {
    public DefaultTableModel tblmodel;
    String header[] = {"NIS", "Nama", "Jenis Kelamin", "Jurusan"};

    public Siswa() throws SQLException {
        initComponents();
        setLocationRelativeTo(this);
        tblmodel = new DefaultTableModel(null, header);
        tabel.setModel(tblmodel);
        tabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        model.Tampil(this);
        setLebarKolom();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        cbJurusan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnBaru = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("NIS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Jurusan");

        txtNIS.setEnabled(false);
        txtNIS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNISKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNISKeyTyped(evt);
            }
        });

        txtNama.setEnabled(false);
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNamaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbLaki);
        rbLaki.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbLaki.setText("Laki-laki");
        rbLaki.setEnabled(false);

        buttonGroup1.add(rbPerempuan);
        rbPerempuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbPerempuan.setText("Perempuan");
        rbPerempuan.setEnabled(false);

        cbJurusan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rekayasa Perangkat Lunak", "Teknik Komputer dan Jaringan", "Multimedia", "Desain Komunikasi Visual", "Akuntansi dan Keuangan Lembaga", "Otomatisasi dan Tata Kelola Perkantoran", "Perhotelan", "Produksi Siaran Program Pertelevisian", "Bisnis Daring dan Pemasaran" }));
        cbJurusan.setEnabled(false);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.getTableHeader().setResizingAllowed(false);
        tabel.getTableHeader().setReorderingAllowed(false);
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        btnBaru.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBaru.setText("Baru");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setEnabled(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.setEnabled(false);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setEnabled(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKeluar.setText("Kembali");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNIS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(rbLaki)
                        .addGap(18, 18, 18)
                        .addComponent(rbPerempuan))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLaki)
                    .addComponent(rbPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean cekValidasiInput() {
        String nis = txtNIS.getText().trim();
        String nama = txtNama.getText().trim();
        String rgx = "\\d+";
        String rgxNama = "^([a-zA-Z ])+$";
        Boolean lengthState = nis.length() < 5;
        
        return !nis.equals("") && !nama.equals("") && nis.matches(rgx) && nama.matches(rgxNama) && lengthState;
    }
    
    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        try {
            model.KlikTabel(this);
        } catch (SQLException ex) {
            Logger.getLogger(Siswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtNISKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNISKeyTyped
        if(tabel.getSelectedRow() >= 0) {
            btnUbah.setEnabled(this.cekValidasiInput());
        } else {
            btnSimpan.setEnabled(this.cekValidasiInput());
        }
    }//GEN-LAST:event_txtNISKeyTyped

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        if(tabel.getSelectedRow() >= 0) {
            btnUbah.setEnabled(this.cekValidasiInput());
        } else {
            btnSimpan.setEnabled(this.cekValidasiInput());
        }
    }//GEN-LAST:event_txtNamaKeyTyped

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        try {
            model.Baru(this);
        } catch (SQLException ex) {
            Logger.getLogger(Siswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBaruActionPerformed

    private void txtNISKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNISKeyReleased
        if(tabel.getSelectedRow() >= 0) {
            btnUbah.setEnabled(this.cekValidasiInput());
        } else {
            btnSimpan.setEnabled(this.cekValidasiInput());
        }
    }//GEN-LAST:event_txtNISKeyReleased

    private void txtNamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyReleased
        if(tabel.getSelectedRow() >= 0) {
            btnUbah.setEnabled(this.cekValidasiInput());
        } else {
            btnSimpan.setEnabled(this.cekValidasiInput());
        }
    }//GEN-LAST:event_txtNamaKeyReleased

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
            model.Ubah(this);
        } catch (SQLException ex) {
            Logger.getLogger(Siswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            model.Hapus(this);
        } catch (SQLException ex) {
            Logger.getLogger(Siswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            model.Simpan(this);
        } catch (SQLException ex) {
            Logger.getLogger(Siswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed
    
    model_siswa model = new model_siswa();
    public void setColumnWidth(int kolom) {
        DefaultTableColumnModel dtcm = (DefaultTableColumnModel) tabel.getColumnModel();
        TableColumn kolomtabel = dtcm.getColumn(kolom);
        int lebar = 0;
        int margin = 10;
        int a;
        TableCellRenderer renderer = kolomtabel.getHeaderRenderer();
        if(renderer == null) {
            renderer = tabel.getTableHeader().getDefaultRenderer();
        }
        Component komponen = renderer.getTableCellRendererComponent(tabel, kolomtabel.getHeaderValue(), false, false, 0, 0);
        lebar = komponen.getPreferredSize().width;
        for(a = 0; a < tabel.getRowCount(); a++) {
            renderer = tabel.getCellRenderer(a, kolom);
            komponen = renderer.getTableCellRendererComponent(tabel, tabel.getValueAt(a, kolom), false, false, a, kolom);
            int lebarKolom = komponen.getPreferredSize().width;
            lebar = Math.max(lebar, lebarKolom);
        }
        lebar = lebar + margin;
        kolomtabel.setPreferredWidth(lebar);
    }
    
    public void setLebarKolom() {
        int a;
        for(a = 0; a < tabel.getColumnCount(); a++) {
            setColumnWidth(a);
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
            java.util.logging.Logger.getLogger(Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Siswa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Siswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBaru;
    public javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    public javax.swing.JButton btnSimpan;
    public javax.swing.JButton btnUbah;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rbLaki;
    public javax.swing.JRadioButton rbPerempuan;
    public javax.swing.JTable tabel;
    public javax.swing.JTextField txtNIS;
    public javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
