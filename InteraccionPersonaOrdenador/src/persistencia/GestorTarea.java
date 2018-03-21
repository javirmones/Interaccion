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
public class GestorTarea {
    
	public GestorTarea() {
		
	}
	/*
	 public String AñadirTarea(Tarea p, String fI, String fF, String ruta) {
	        
	        String sql = "INSERT INTO Tarea (Proyecto, Nombre, Prioridad, Estado, usuarioResponsable, Descripcion, fechaCreacion, fechaFinalizacion, FotoAdjunta)"
	                + " VALUES ('" + p.getProyecto() + "', '" + p.getNombre() + "', '" + p.getPrioridad()+ "', "
	                + "'" + p.getEstado() + "', '" + p.getUsuarioResponsable() + "' ,'" + p.getDescripcion() + "', '" + fI + "', '" + fF + "', '" + ruta + "');" ;
	        try{
	            PreparedStatement pstm = conexion.prepareCall( sql );      
	            int res1 = pstm.executeUpdate();
	            pstm.close();
	        }catch( SQLException e ){
	            System.err.println( e.getMessage() );
	        }
	        
	        String sql2 = "SELECT MAX(Id) as maxid FROM Tarea;";
	        String id = "";
	        try{
	            PreparedStatement pstm = conexion.prepareStatement( sql2 );
	            ResultSet res = pstm.executeQuery();            
	             while(res.next())
	             {            
	                 id = res.getString("maxid");
	             }
	         res.close();         
	        }catch( SQLException e ){
	            System.err.println( e.getMessage() );
	        }
	        
	        return id;
	    }

	 public void CargarTareas(DefaultListModel nameList, DefaultListModel idList) {
	        String sql = " SELECT Id, Nombre"
	                 + " FROM Tarea ";
	        try{
	            PreparedStatement pstm = conexion.prepareStatement( sql );
	            ResultSet res = pstm.executeQuery();            
	             while(res.next())
	             {            
	                idList.addElement(res.getString( "Id" ));
	                nameList.addElement(res.getString("Nombre"));
	             }
	         res.close();         
	        }catch( SQLException e ){
	            System.err.println( e.getMessage() );
	        }
	    }
	 public String[] CargarDatosTarea(String ID) {
	        String sql = " SELECT * FROM Tarea WHERE Id = " + ID + " ;";
	        String datos[] = new String[9];
	        try{
	            PreparedStatement pstm = conexion.prepareStatement( sql );
	            ResultSet res = pstm.executeQuery();            
	             while(res.next())
	             {            
	                datos[0] = res.getString( "Proyecto" );
	                datos[1] = res.getString( "Nombre" );
	                datos[2] = res.getString("Prioridad");
	                datos[3] = res.getString("Estado");
	                datos[4] = res.getString("usuarioResponsable");
	                datos[5] = res.getString("Descripcion");
	                datos[6] = res.getString("fechaCreacion");
	                datos[7] = res.getString("fechaFinalizacion");
	                datos[8] = res.getString("FotoAdjunta");
	             }
	             
	         res.close();         
	        }catch( SQLException e ){
	            System.err.println( e.getMessage() );
	        }        
	        return datos;
	    }

	    public void ModificarTarea(String selectedValue, Tarea p, String fI, String fF, String ruta) {
	        String sql = 
	         "UPDATE Tarea SET Proyecto = " + p.getProyecto() + " , Nombre = '"
	                + p.getNombre() + "' , Prioridad = '" 
	                + p.getPrioridad() + "' , Estado = '" 
	                + p.getEstado() + "', usuarioResponsable = '" 
	                + p.getUsuarioResponsable() + "', fechaCreacion = '" + fI + "', fechaFinalizacion = '"+ fF+"', Descripcion = '" 
	                + p.getDescripcion() + "', FotoAdjunta = '" + ruta + "'  WHERE Id= " + selectedValue + " ;";
	        
	        try{
	            PreparedStatement pstm = conexion.prepareCall( sql );      
	            int res = pstm.executeUpdate();
	            pstm.close();
	        }catch( SQLException e ){
	            System.err.println( e.getMessage() );
	        }
	    }

	    public void EliminarTarea(String selectedValue) {
	        String sql = "DELETE FROM Tarea WHERE Id= " + selectedValue + ";";
	        
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
