    /**
     * Classe responsável por gerenciar a conexão com o banco de dados MySQL.
     * Implementa o padrão Singleton para garantir uma única instância de conexão.
     */

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/estoque";
    private static final String USER = "root";
    private static final String PASSWORD = "admin123";
    
    /**
     * Estabalece uma conexão com o banco de dados.
     * @return Objeto Connection representando a conexão.
     * @throws SQLException Em caso de erro ao estabelecer conexão.
     */
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
