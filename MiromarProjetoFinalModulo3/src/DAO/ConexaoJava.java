package DAO;

import Model.ConstantesConexao;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author miromar
 */
public class ConexaoJava {
    
    /**
     * Este método conecta com o banco de dados MySql
     * importanto url,driver,usuario e senha da classe ConstantesConexao
     * @return 
     */
    public static Connection conectar() {
        ConstantesConexao constantes = new ConstantesConexao();
        Connection con = null;
        try {

            Class.forName(constantes.getDriver());
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no Driver " + ex);
        }

        try {
            con = (Connection) DriverManager.getConnection(constantes.getUrl(),constantes.getUsuario(), constantes.getSenha());
            System.out.println("Conectado com Sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro na Conexao " + ex);
        }

        return con;
    }
   
}
   


