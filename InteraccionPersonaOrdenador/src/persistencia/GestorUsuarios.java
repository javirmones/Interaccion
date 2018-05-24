package persistencia;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import dominio.Usuario;

public class GestorUsuarios {
	public DefaultListModel<Usuario> usuarios=new DefaultListModel();
	
	public GestorUsuarios() {
		//for (int i=0;i<2;i++) {
		int i=1;
			Usuario u1=new Usuario(i,"Ragnar","el Rojo","ragnar@gmail.com","12345",618195555,"/iconos/stalin.png");
			i++;
			Usuario u2=new Usuario(i,"Lenin","el Rojo","lenin@gmail.com","12345",618195555,"/iconos/Vladimir_Lenin.png");
			usuarios.addElement(u1);
			usuarios.addElement(u2);
		//}
	}
	public DefaultListModel<Usuario> getLista(){
		return usuarios;
	}
	public void ActualizarList(Usuario u){
		usuarios.addElement(u);
	}

}
