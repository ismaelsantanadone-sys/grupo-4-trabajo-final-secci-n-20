import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLite {

    public static Connection conectar() {
        Connection con = null;

        try {
            // FORZAR carga del driver (evita el error "No suitable driver")
            Class.forName("org.sqlite.JDBC");

            con = DriverManager.getConnection("jdbc:sqlite:UASD2.db");
            System.out.println("Conectado a la BD");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver SQLite no encontrado");
        } catch (SQLException e) {
            System.out.println("Error conexión: " + e.getMessage());
        }

        return con;
    }
}
