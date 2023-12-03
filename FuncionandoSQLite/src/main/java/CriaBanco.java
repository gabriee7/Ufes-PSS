import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaBanco {

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Carregar o driver JDBC
            Class.forName("org.sqlite.JDBC");

            // Estabelecer a conexão com o banco de dados
            String url = "jdbc:sqlite:meubanco.db"; // Nome do banco de dados
            connection = DriverManager.getConnection(url);

            System.out.println("Conexão com o SQLite estabelecida com sucesso.");

            // Criar uma tabela de exemplo
            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS usuarios (id INTEGER PRIMARY KEY, nome TEXT);";
            statement.execute(createTableSQL);

            System.out.println("Tabela criada com sucesso.");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar a conexão no bloco finally para garantir a liberação dos recursos
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}