/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriela.tienda.model;

public abstract class Producto {
    protected String nombre;
    protected int cantidad;
    protected String color;
    protected double precio;
    protected String talla;

    public Producto(String nombre, int cantidad, String color, double precio, String talla) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.color = color;
        this.precio = precio;
        this.talla = talla;
    }

    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
    public String getColor() { return color; }
    public double getPrecio() { return precio; }
    public String getTalla() { return talla; }

    public abstract String getTipoProducto();
    public abstract void mostrarInfo();
}
