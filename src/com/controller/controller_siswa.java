package com.controller;
import com.view.Siswa;
import java.sql.SQLException;

public interface controller_siswa {
    public void Simpan(Siswa siswa) throws SQLException;
    public void Ubah(Siswa siswa) throws SQLException;
    public void Hapus(Siswa siswa) throws SQLException;
    public void Tampil(Siswa siswa) throws SQLException;
    public void Baru(Siswa siswa) throws SQLException;
    public void KlikTabel(Siswa siswa) throws SQLException;
}
