
package Controlador;

import Modelo.Producto;
import bd.ConexionBD;
import java.sql.Connection;

/**
 * @author Nibbinthoroniel
 * @version 13 nov 2024
 */

public class RegistroProducto {
    
    public boolean agregarProducto(Producto producto){
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            
            //  REQUIERE CONEXIÓN CON BASE DE DATOS
            
        } catch (Exception e) {
        }
        return true;
    }
    
}
