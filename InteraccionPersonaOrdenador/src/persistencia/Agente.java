package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Agente {

	private Connection conn;
	
	public Agente () {
		this.conn=this.getConexion();
	}

	public static Connection getConexion() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String user = "root";
			String pass = "1234";
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbdd_ipo?user="+user+"&password="+pass+"&useSSL=false");
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