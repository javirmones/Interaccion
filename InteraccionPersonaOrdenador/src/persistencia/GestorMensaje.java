/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

/**
 *
 * @author absit
 */
public class GestorMensaje {

	Connection conexion;
	PreparedStatement pstm;
	ResultSet res;

	public void CargarMensajes(DefaultListModel nameList_m, String usuario) {
		String sql = " SELECT Id" + " FROM Mensajes WHERE Usuario = '" + usuario + "' OR Usuario = 'ALL' ;";
		try {
			pstm = conexion.prepareStatement(sql);
			res = pstm.executeQuery();
			while (res.next()) {
				nameList_m.addElement(res.getString("Id"));
			}
			res.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	public ResultSet ConsultarMensajes(String usuario, String selectedIndex) {

		String mensaje = "";
		String sql = " SELECT *" + " FROM Mensajes " + "  WHERE Id = " + selectedIndex + " AND (Usuario = '" + usuario
				+ "' OR Usuario = 'ALL');";

		try {
			pstm = conexion.prepareStatement(sql);
			res = pstm.executeQuery();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return res;
	}

	public void enviarMensaje(String usuario, String mensaje) {
		String sql = "INSERT INTO Mensajes (Usuario, Mensaje)" + " VALUES ('" + usuario + "', '" + mensaje + "');";

		try {
			pstm = conexion.prepareCall(sql);
			int res1 = pstm.executeUpdate();
			pstm.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	public void EliminarMensaje(String selected) {
		String sql = "DELETE FROM Mensajes WHERE Id= " + selected + ";";

		try {
			pstm = conexion.prepareCall(sql);
			int rest = pstm.executeUpdate();
			pstm.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
