package clienteDaoService;

import modelo.ClienteComex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection con;
    ClienteDAO(Connection connection) {
        this.con = connection;
    }

    public void cadastrarCliente(ClienteComex dadosCliente) {

        String sql = "INSERT INTO clientes (nome, cpf, email, profissao, telefone)" +
                "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, dadosCliente.nome);
            preparedStatement.setString(2, dadosCliente.cpf);
            preparedStatement.setString(3, dadosCliente.email);
            preparedStatement.setString(4, dadosCliente.profissao);
            preparedStatement.setString(5, dadosCliente.telefone);
            preparedStatement.execute();
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar o cliente: " + e);
        }
    }

    public void deletarCliente(int idCliente) {
        String sql = "DELETE FROM clientes WHERE id = ?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, idCliente);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            con.close();
            System.out.println("Cliente deletado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar cliente: " + e);
        }
    }
}
