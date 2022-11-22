package com.model;

import com.controller.controller_auth;
import com.koneksi.Koneksi;
import com.view.Login;
import com.view.MainMenu;
import com.view.Register;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class model_auth implements controller_auth {

    @Override
    public void Daftar(Register user) throws SQLException {
        String username = user.txtUsername.getText();
        String password = String.valueOf(user.txtPassword.getPassword());
        String confirm_pass = String.valueOf(user.txtConfirmPassword.getPassword());
        String cekuser = null;
        
        try {
 
            Connection con = Koneksi.getcon();
 
            Statement st = (Statement) con.createStatement();
 
            String query = "SELECT username FROM user WHERE username = '"+username+"' ";
 
            ResultSet rs = st.executeQuery(query);
 
            while(rs.next()){
                cekuser = rs.getString("username");
            }
 
            rs.close();
            st.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
        if(cekuser!=null){
            
            String pesan = "Username Sudah Terdaftar, Silahkan Ganti Yang lain!";
 
            JOptionPane.showMessageDialog(null,pesan,"ERROR", JOptionPane.ERROR_MESSAGE);
            user.txtUsername.setText("");
            user.txtPassword.setText("");
            user.txtConfirmPassword.setText("");
            user.btnSubmitRegister.setEnabled(false);
            return;
        }
 
        if(!password.equals(confirm_pass)){
            
            String pesan = "Confirm Password Tidak Cocok!";
 
            JOptionPane.showMessageDialog(null,pesan,"ERROR", JOptionPane.ERROR_MESSAGE);
            user.txtPassword.setText("");
            user.txtConfirmPassword.setText("");
            user.btnSubmitRegister.setEnabled(false);
 
        } else {
 
            try {
 
                Connection con = Koneksi.getcon();
                String query = "INSERT INTO user(username,password) VALUES ('"+username+"', '"+password+"')";
                PreparedStatement prepare = (PreparedStatement) con.prepareStatement(query);
                prepare.executeUpdate(query);
 
                String pesan = "SELAMAT AKUN ANDA BERHASIL TERDAFTAR!";
 
                JOptionPane.showMessageDialog(null,pesan,"BERHASIL", JOptionPane.INFORMATION_MESSAGE); 
                
                user.dispose();
                new Login().setVisible(true);
 
            } catch (SQLException e){
                System.out.println(e);
            }
 
        }
    }

    @Override
    public void Login(Login user) throws SQLException {
        String username = user.txtUsername.getText().trim();
        String password = String.valueOf(user.txtPassword.getPassword()).trim();
        
        String cekUsername = null, cekPassword = null;
        try {
 
            Connection con = Koneksi.getcon();
 
            Statement st = (Statement) con.createStatement();
 
            String query = "SELECT * FROM user WHERE username = '"+username+"' AND password = '"+password+"'";
 
            ResultSet rs = st.executeQuery(query);
 
            while(rs.next()){
                cekUsername = rs.getString("username");
                cekPassword = rs.getString("password");
            }
 
            rs.close();
            st.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
        if(cekUsername == null && cekPassword == null){
 
            String pesan = "Username Atau Password Salah!";
 
            JOptionPane.showMessageDialog(null,pesan,"ERROR", JOptionPane.ERROR_MESSAGE);
            user.txtUsername.setText("");
            user.txtPassword.setText("");
            user.btnLoginSubmit.setEnabled(false);
 
        } else {
 
            String pesan = "Login Berhasil!";
 
            JOptionPane.showMessageDialog(null,pesan,"BERHASIL", JOptionPane.INFORMATION_MESSAGE);

            new MainMenu().setVisible(true);

            user.dispose();
 
        }
    }
    
}
