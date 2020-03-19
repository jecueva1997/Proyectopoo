/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_venta;

/**
 *
 * @author reati
 */
public class Producto {
    
    private String nombre;
    private String unidada_medida;
    private int cantidad;
    private double precio;
    private String tipo;

    public Producto(String nombre, String unidada_medida, int cantidad, 
            double precio) {
        this.nombre = nombre;
        this.unidada_medida = unidada_medida;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Producto(String nombre){
        this.nombre = nombre;
    }

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the unidada_medida
     */
    public String getUnidada_medida() {
        return unidada_medida;
    }

    /**
     * @param unidada_medida the unidada_medida to set
     */
    public void setUnidada_medida(String unidada_medida) {
        this.unidada_medida = unidada_medida;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
