package com.example.cyber.jdbc;

import android.util.Log;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
    static final String JDC_URL = "jdbc:mysql://127.0.0.1:3306/?user=root";
    private Connection conn;

    public DBConnection()
    {
        super();

        try
        {
            this.conn = DriverManager.getConnection(JDC_URL);
            if(this.conn != null)
            {System.out.println("connection successful");}
        }
        catch (SQLException e)
        {e.printStackTrace();}
    }
}
