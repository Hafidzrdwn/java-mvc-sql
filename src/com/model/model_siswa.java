package com.model;
import com.controller.controller_siswa;
import com.koneksi.Koneksi;
import com.view.Siswa;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class model_siswa implements controller_siswa {
    String jk;

    @Override
    public void Simpan(Siswa siswa) throws SQLException {
        if(siswa.rbLaki.isSelected()) {
          jk = "Laki-laki";  
        } else {
          jk = "Perempuan";  
        }
        
        try {
            Connection con = Koneksi.getcon();
            String sql = "INSERT INTO siswa VALUES(?,?,?,?)";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, siswa.txtNIS.getText());
            prepare.setString(2, siswa.txtNama.getText());
            prepare.setString(3, jk);
            prepare.setString(4, (String) siswa.cbJurusan.getSelectedItem());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan!!");
            prepare.close();
            Baru(siswa);
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        } finally {
            Tampil(siswa);
            siswa.setLebarKolom();
        }
    }

    @Override
    public void Ubah(Siswa siswa) throws SQLException {
        if(siswa.rbLaki.isSelected()) {
          jk = "Laki-laki";  
        } else {
          jk = "Perempuan";  
        }
        
        try {
            Connection con = Koneksi.getcon();
            String sql = "UPDATE siswa SET nama=?, jenis_kelamin=?, "
                    + "jurusan=? WHERE NIS=?";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(4, siswa.txtNIS.getText());
            prepare.setString(1, siswa.txtNama.getText());
            prepare.setString(2, jk);
            prepare.setString(3, (String) siswa.cbJurusan.getSelectedItem());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil diubah!!");
            prepare.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        } finally {
            Tampil(siswa);
            siswa.setLebarKolom();
            Baru(siswa);
        }
    }

    @Override
    public void Hapus(Siswa siswa) throws SQLException {
        try {
            Connection con = Koneksi.getcon();
            String sql = "DELETE FROM siswa WHERE NIS=?";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, siswa.txtNIS.getText());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus!!");
            prepare.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        } finally {
            Tampil(siswa);
            siswa.setLebarKolom();
            Baru(siswa);
        }
    }
    
    @Override
    public void Tampil(Siswa siswa) throws SQLException {
        siswa.tblmodel.getDataVector().removeAllElements();
        siswa.tblmodel.fireTableDataChanged();
        
        try {
            Connection con = Koneksi.getcon();
            Statement stt = con.createStatement();
            // Query untuk menampilkan semua data pada tabel siswa
            // dengan urutan NIS dari kecil ke besar
            String sql = "SELECT * FROM siswa ORDER BY NIS ASC";
            ResultSet res = stt.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[8];
                ob[0] = res.getString(1);
                ob[1] = res.getString(2);
                ob[2] = res.getString(3);
                ob[3] = res.getString(4);
                siswa.tblmodel.addRow(ob);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void Baru(Siswa siswa) throws SQLException {
        siswa.btnUbah.setEnabled(false);
        siswa.btnSimpan.setEnabled(false);
        siswa.btnHapus.setEnabled(false);
        
        if(siswa.tabel.getSelectedRow() >= 0) {
            siswa.txtNIS.setEnabled(false);
            siswa.tabel.getSelectionModel().clearSelection();
        } else {
            siswa.txtNIS.setEnabled(!siswa.txtNIS.isEnabled());
        }
        siswa.txtNIS.setText("");
        
        siswa.txtNama.setEnabled(!siswa.txtNama.isEnabled());
        siswa.txtNama.setText("");
        
        siswa.rbLaki.setEnabled(!siswa.rbLaki.isEnabled());
        siswa.rbPerempuan.setEnabled(!siswa.rbPerempuan.isEnabled());
        siswa.rbLaki.setSelected(true);
        
        siswa.cbJurusan.setEnabled(!siswa.cbJurusan.isEnabled());
        siswa.cbJurusan.setSelectedIndex(0);
        siswa.btnBaru.setText((siswa.btnBaru.getText().equals("Baru")) ? "Batal" : "Baru" );
    }

    @Override
    public void KlikTabel(Siswa siswa) throws SQLException {
        siswa.txtNama.setEnabled(true);
        siswa.rbLaki.setEnabled(true);
        siswa.rbPerempuan.setEnabled(true);
        siswa.cbJurusan.setEnabled(true);
        siswa.btnBaru.setText("Batal");
        siswa.btnUbah.setEnabled(true);
        siswa.btnHapus.setEnabled(true);
        
        try {
            int pilih = siswa.tabel.getSelectedRow();
            if(pilih == -1) {
                return;
            }

            siswa.txtNIS.setText(siswa.tblmodel.getValueAt(pilih,0).toString());
            siswa.txtNama.setText(siswa.tblmodel.getValueAt(pilih,1).toString());
            siswa.cbJurusan.setSelectedItem(siswa.tblmodel.getValueAt(pilih,3).toString());
            jk = String.valueOf(siswa.tblmodel.getValueAt(pilih, 2));
        } catch (Exception e) {
            System.out.println(e);
        }
        
        // memberi nilai jk pada radio button
        if(siswa.rbLaki.getText().equals(jk)) {
            siswa.rbLaki.setSelected(true);
        } else {
            siswa.rbPerempuan.setSelected(true);
        }
    }
}
