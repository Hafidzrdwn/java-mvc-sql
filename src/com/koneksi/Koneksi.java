
package com.koneksi;

import java.sql.*;

public class Koneksi {
    private static Connection con;
    public static Connection getcon() {
        if(con == null) {
            try {
                String url = "jdbc:mysql://localhost/pbo_mvc_sekolah";
                String username = "root";
                String password = "admin";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return con;
    }
}
