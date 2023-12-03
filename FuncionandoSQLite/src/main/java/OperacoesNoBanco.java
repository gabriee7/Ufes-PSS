/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nitro5WIN10
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacoesNoBanco {

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Carregar o driver JDBC
            Class.forName("org.sqlite.JDBC");

            // Estabelecer a conexão com o banco de dados
            String url = "jdbc:sqlite:meubanco.db";
            connection = DriverManager.getConnection(url);

            System.out.println("Conexão com o SQLite estabelecida com sucesso.");

            // Inserir dados na tabela
            inserirDados(connection, "John Doe");
            inserirDados(connection, "Jane Doe");

            // Recuperar dados da tabela
            recuperarDados(connection);

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

    private static void inserirDados(Connection connection, String nome) throws SQLException {
        String insertSQL = "INSERT INTO usuarios (nome) VALUES (?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, nome);
            preparedStatement.executeUpdate();
            System.out.println("Dados inseridos com sucesso.");
        }
    }

    private static void recuperarDados(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM usuarios";

        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");

                System.out.println("ID: " + id + ", Nome: " + nome);
            }
        }
    }
}

