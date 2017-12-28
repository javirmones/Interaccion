package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AgenteDAO {

	public AgenteDAO() {

	}

	public static Connection getConexion() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/bbdd_ipo"
					+ "?autoReconnect=true&useSSL=false";
			String user = "root";
			String pass = "1234";
			con = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al conectar con la base de datos.");
			e.printStackTrace();
		}

		return con;
	}
}
