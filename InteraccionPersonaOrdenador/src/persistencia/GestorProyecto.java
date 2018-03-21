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
public class GestorProyecto {
    public GestorProyecto(){
    	
    }
    /*
    public int AñadirProyecto(Proyecto p, String fC) {
        String sql = "INSERT INTO Proyecto (Nombre, Descripcion, miembrosEquipo, responsableProyecto, fechaCreacion)"
                + " VALUES ('" + p.getNombre() + "', '" + p.getDescripcion() + "', "
                + "'" + p.getMiembros() + "', '" + p.getResponsable() + "', '"+fC+"');" ;
        try{
            PreparedStatement pstm = conexion.prepareCall( sql );      
            int res1 = pstm.executeUpdate();
            pstm.close();
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
        String sql2 = "SELECT MAX(Id) as maxid FROM Proyecto;";
        int id = 0;
        try{
            PreparedStatement pstm = conexion.prepareStatement( sql2 );
            ResultSet res = pstm.executeQuery();            
             while(res.next())
             {            
                id = Integer.parseInt(res.getString( "maxid" ));
             }
         res.close();         
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
        
        return id;
    }

    public void CargarProyectos(DefaultListModel idList, DefaultListModel nameList) {
        String sql = " SELECT Id, Nombre"
                 + " FROM Proyecto ";
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

    public String[] CargarDatosProyecto(String Id, String nombre, String descripcion, String responsable, String miembros) {
        String sql = " SELECT * FROM Proyecto WHERE Id = " + Id + " ;";
        String datos[] = new String[5];
        try{
            PreparedStatement pstm = conexion.prepareStatement( sql );
            ResultSet res = pstm.executeQuery();            
             while(res.next())
             {            
                nombre = res.getString( "Nombre" );
                descripcion = res.getString( "Descripcion" );
                miembros = res.getString("miembrosEquipo");
                responsable = res.getString("responsableProyecto");
                datos[4] = res.getString("fechaCreacion");
             }
             
         res.close();         
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
        datos[0]=nombre; datos[1]=descripcion; datos[3]=miembros; datos[2]=responsable;
        
        return datos;
    }

    public void ModificarProyecto(Proyecto p, String Id, String fI) {
        String sql = 
         "UPDATE Proyecto SET Nombre = '" + p.getNombre() + "' , Descripcion = '"
                + p.getDescripcion() + "' , responsableProyecto = '" 
                + p.getResponsable() + "' , miembrosEquipo = '" 
                + p.getMiembros()+ "', fechaCreacion = '"+fI+"' WHERE Id= " + Id + " ;";
        
        try{
            PreparedStatement pstm = conexion.prepareCall( sql );      
            int res = pstm.executeUpdate();
            pstm.close();
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
    }

    public void EliminarProyecto(String id) {
        String sql = "DELETE FROM Proyecto WHERE Id=" + id + ";";
        
        try{
            PreparedStatement pstm = conexion.prepareCall( sql );      
            int res = pstm.executeUpdate();
            pstm.close();
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
    }
    
    public String[] CargarProyectos() {
        String sql = " SELECT Id"
                 + " FROM Proyecto ";
        ArrayList<String> nombre = new ArrayList<String>();
        String[] proyects;
        try{
            PreparedStatement pstm = conexion.prepareStatement( sql );
            ResultSet res = pstm.executeQuery();            
             while(res.next())
             {            
                nombre.add(res.getString("Id"));
             }
         res.close();         
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
        proyects = new String[nombre.size()];
        for(int i = 0; i<proyects.length; i++){
            proyects[i]=(String) nombre.get(i);
        }
        
       return proyects;
    }
    public String CargarNombreProyecto(String id) {
        String nombre = "";
        String sql = " SELECT Nombre"
                 + " FROM Proyecto WHERE Id = '" + id + "' ;";
        try{
            PreparedStatement pstm = conexion.prepareStatement( sql );
            ResultSet res = pstm.executeQuery();            
             while(res.next())
             {            
                nombre = res.getString( "Nombre" );
             }
         res.close();         
        }catch( SQLException e ){
            System.err.println( e.getMessage() );
        }
        return nombre;
    }

*/
}
