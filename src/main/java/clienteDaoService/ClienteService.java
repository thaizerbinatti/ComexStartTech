package clienteDaoService;

import modelo.ClienteComex;
import connection.ConnectionFactory;

public class ClienteService {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        ClienteDAO dao = new ClienteDAO(connectionFactory.conexaoComex());

        // Cadastrar cliente
        ClienteComex cliente = new ClienteComex("Camila", "76841058765", "camila@gmail.com", "Cantora", "1144427834");
        dao.cadastrarCliente(cliente);

        // Excluir cliente
        int excluirCliente = 3;
        dao.deletarCliente(excluirCliente);
    }
}