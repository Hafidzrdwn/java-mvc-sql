package com.controller;
import com.view.Register;
import com.view.Login;
import java.sql.SQLException;

public interface controller_auth {
    public void Daftar(Register user) throws SQLException;
    public void Login(Login user) throws SQLException;
}
