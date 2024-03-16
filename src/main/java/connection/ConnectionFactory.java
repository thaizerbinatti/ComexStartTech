package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection conexaoComex() {
        try {
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/cliente_comex?user=root&password=alura123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
