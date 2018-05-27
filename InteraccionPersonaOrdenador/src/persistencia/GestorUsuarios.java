package persistencia;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import dominio.Usuario;

public class GestorUsuarios {
	public static DefaultListModel<Usuario> usuarios=new DefaultListModel();
	
	public GestorUsuarios() {
		//for (int i=0;i<2;i++) {
		

		//}
	}
	public DefaultListModel<Usuario> getLista(){
		return usuarios;
	}
	public void Inicializacion() {
		Usuario u1=new Usuario("Ragnar","el Rojo","ragnar@gmail.com","12345",618195555,"jefe","Agresivo","Calle del lirio","/iconos/stalin.png");
		Usuario u2=new Usuario("Lenin","el Rojo","lenin@gmail.com","12345",618195555,"jefazo","Pacifico","Calle del loto","/iconos/Vladimir_Lenin.png");
		Usuario u3=new Usuario("Setch","Rollins","architec@wwe.com","12345",618195556,"policia","Tranquilo","Calle de la rosa","/iconos/seth.png");
		usuarios.addElement(u1);
		usuarios.addElement(u2);
		usuarios.addElement(u3);
	}
	public void ActualizarList(Usuario u){
		usuarios.addElement(u);
	}

}
