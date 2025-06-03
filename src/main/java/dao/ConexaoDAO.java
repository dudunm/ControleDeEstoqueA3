package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/estoque";
    private static final String USER = "root";
    private static final String PASSWORD = "admin123";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
