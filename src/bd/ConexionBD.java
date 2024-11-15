
package bd;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Nibbinthoroniel
 * @version 13 nov 2024
 */

public class ConexionBD {
    
    public Connection obtenerConexion(){
        
        Connection conexion = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Diver");
            
            conexion = DriverManager.getConnection("url de conexion con bd", "root", "contraseña");
            
            System.out.println("Conexion exitosa");
            
        } catch (Exception e) {
            System.out.println("No se logró conectar a la BD");
        }
        
        return conexion;
        
    }
    
}
