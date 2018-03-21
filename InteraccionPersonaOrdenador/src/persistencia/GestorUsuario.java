/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author absit
 */
public class GestorUsuario {
	public GestorUsuario() {
		
	}
	/*
	 *public void CargarUsuarios(DefaultListModel nameList) {
        String sql = " SELECT nombreUsuario"
                 + " FROM Usuario ";
        try{
            PreparedStatement pstm = conexion.prepareStatement( sql );
            ResultSet res = pstm.executeQuery();            
             while(res.next())
             {            
                nameList.addElement(res.getString("nombreUsuario"));
             }
         res.close();         
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
    }

    public String[] CargarDatosUsuario(String nombre) {
        String sql = " SELECT * FROM Usuario WHERE nombreUsuario = '" + nombre + "' ;";
        String datos[] = new String[5];
        try{
            PreparedStatement pstm = conexion.prepareStatement( sql );
            ResultSet res = pstm.executeQuery();            
             while(res.next())
             {            
                datos[0] = res.getString( "nombreUsuario" );
                datos[1] = res.getString( "DNI" );
                datos[2] = res.getString("Estudios");
                datos[3] = res.getString("Rol");
                datos[4] = res.getString("Foto");
             }
             
         res.close();         
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }        
        return datos;
    }

    public String CargarRol(String usuarioAct) {
        String sql = " SELECT Rol FROM Usuario WHERE nombreUsuario = '" + usuarioAct + "' ;";
        String rol = "";
        try{
            PreparedStatement pstm = conexion.prepareStatement( sql );
            ResultSet res = pstm.executeQuery();            
             while(res.next())
             {            
                rol = res.getString("Rol");
             }
             
         res.close();         
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
        
        return rol;
    }
    //EN ESTE METODO HAY UN FALLO, EL ID QUE DEVUELVE ES NULL 
     * public String[] CargarUsuarios() {
        String sql = " SELECT nombreUsuario"
                 + " FROM Usuario ";
        ArrayList<String> nombre = new ArrayList<String>();
        String[] users;
        try{
            PreparedStatement pstm = conexion.prepareStatement( sql );
            ResultSet res = pstm.executeQuery();            
             while(res.next())
             {            
                nombre.add(res.getString("nombreUsuario"));
             }
         res.close();         
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
        users = new String[nombre.size()];
        for(int i = 0; i<users.length; i++){
            users[i]=nombre.get(i);
        }
       return users; 
    }
      public void EliminarUsuario(String dato) {
        String sql = "DELETE FROM Usuario WHERE nombreUsuario= '" + dato + "';";
        
        try{
            PreparedStatement pstm = conexion.prepareCall( sql );      
            int res = pstm.executeUpdate();
            pstm.close();
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
    }
     public void AñadirUsuario(Usuario u) {
        String sql = "INSERT INTO Usuario (nombreUsuario, DNI, Estudios, Rol)"
                + " VALUES ('" + u.getNombre() + "', '" + u.getDni() + "', "
                + "'" + u.getEstudios() + "', '" + u.getRol() + "');" ;
        
        try{
            PreparedStatement pstm = conexion.prepareCall( sql );      
            int res1 = pstm.executeUpdate();
            pstm.close();
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
    }
       public void ModificarUsuario(Usuario u) {
	        System.out.println(u.getNombre());
	        String sql = 
	         "UPDATE Usuario SET nombreUsuario = '" + u.getNombre() + "' , DNI = '"
	                + u.getDni() + "' , Estudios = '" 
	                + u.getEstudios() + "' , Rol = '" 
	                + u.getRol() + "'  WHERE nombreUsuario = '" + u.getNombre() + "' ;";
	        
	        try{
	            PreparedStatement pstm = conexion.prepareCall( sql );      
	            int res = pstm.executeUpdate();
	            pstm.close();
	        }catch( SQLException e ){
	            System.err.println( e.getMessage() );
	        }
	    }
	     public String FechaUltimoAcceso(String usuario) {
        String fecha = "";
        String sql = " SELECT ultimoAcceso"
                 + " FROM Login " + "  WHERE Nombre = '" + usuario + "' ;";
        
        try{
            PreparedStatement pstm = conexion.prepareStatement( sql );
            ResultSet res = pstm.executeQuery();            
             while(res.next())
             {            
                fecha = res.getString("ultimoAcceso");
             }
         res.close();         
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
        
        return fecha;
    }
    
    public void AñadirUsuario(Usuario u, String ruta) {
        String sql = "INSERT INTO Usuario (nombreUsuario, DNI, Estudios, Rol, Foto)"
                + " VALUES ('" + u.getNombre() + "', '" + u.getDni() + "', "
                + "'" + u.getEstudios() + "', '" + u.getRol() + "', '" + ruta +"');" ;
        
        try{
            PreparedStatement pstm = conexion.prepareCall( sql );      
            int res1 = pstm.executeUpdate();
            pstm.close();
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
    }
        public void modificarFechaAcceso(String usuario, String ultimoAcceso) {
        String sql = 
         "UPDATE Login SET ultimoAcceso = '" + ultimoAcceso + "'  WHERE Nombre = '" + usuario + "' ;";
        try{
            PreparedStatement pstm = conexion.prepareCall( sql );      
            int res = pstm.executeUpdate();
            pstm.close();
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
    }
	 */
}
