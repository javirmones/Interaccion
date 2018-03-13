package persistencia;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;
import dominio.Usuario;

public class LeerUsuario {

	final static Scanner TECLADO = new Scanner(System.in);
	protected static List<Usuario> usuario = new LinkedList();// matriz formada por los usuarios

	public static List<Usuario> leer() throws Exception {// metodo para crear la matriz de empleados
		String empleados = "usuarios.txt";
		File f = new File(empleados);// identificamos el fichero
		Scanner datos = new Scanner(f);// creamos el escaner para que los lea el fichero f
		int x;
		datos.nextLine();
		x = datos.nextInt();// le introducimos a x el numero de empleados que va a tener la matriz

		// usuario = new Usuario[x];//creamos la matriz empleados en funcion de x
		cargar(empleados);
		datos.close();// cerramos el fichero
		return usuario;

	}

	public static void cargar(String fich) throws Exception {// metodo para cargar el fichero
		String idusuario;
		String nombre;
		String apellidos;
		String email;
		String DNI;
		String contrasenia;
		String fecha;
		Scanner datos = new Scanner(new FileReader(fich));// creamos el escaner para leer el fichero en funcion del
															// fichero que le introducimos

		while (datos.hasNext()) {// bucle para leer el fichero mientras hallan lineas que leer

			datos.nextLine();
			int x = datos.nextInt();// leemos el numero de empleados
			datos.nextLine();
			for (int i = 0; i < x; i++) { // con el numero de empleados sabemos cuantas vueltas ha de dar el lector
				datos.nextLine();
				idusuario = datos.nextLine();// leemos el nombre
				datos.nextLine();
				nombre = datos.nextLine();// l
				datos.nextLine();
				apellidos = datos.nextLine();// l
				datos.nextLine();
				email = datos.nextLine();// l
				datos.nextLine();
				DNI = datos.nextLine();// l
				datos.nextLine();
				contrasenia = datos.nextLine();// l
				datos.nextLine();
				fecha = datos.nextLine();// l
				// Usuario u= new Usuario(idusuario,nombre, apellidos,DNI, email,
				// contrasenia,fecha);
				// usuario.add(u);

			}

		}
		datos.close();// cerramos el fichero
	}
}
