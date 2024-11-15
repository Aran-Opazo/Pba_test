package Modelo;

/**
 * @author Nibbinthoroniel
 * @version 13 nov 2024
 */

public class Producto {
    
    private String idProducto,nombreProd;
    private int precioProd;

    public Producto() {
    }

    public Producto(String idProducto, String nombreProd, int precioProd) {
        this.idProducto = idProducto;
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public int getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(int precioProd) {
        this.precioProd = precioProd;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProd=" + nombreProd + ", precioProd=" + precioProd + '}';
    }

}
