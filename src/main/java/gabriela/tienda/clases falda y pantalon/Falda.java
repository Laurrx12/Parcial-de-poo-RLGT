/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriela.tienda.model;

import gabriela.tienda.interfaces.Vendible;

public class Falda extends Producto implements Vendible {
    public Falda(String nombre, int cantidad, String color, double precio, String talla) {
        super(nombre, cantidad, color, precio, talla);
    }

    @Override
    public String getTipoProducto() { return "Falda"; }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " (" + color + ", talla " + talla + ") - " 
                           + cantidad + " disponibles - $" + precio);
    }

    @Override
    public void vender(int cantidad) {
        if (cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se vendieron " + cantidad + " faldas. Quedan " + this.cantidad + ".");
        } else {
            System.out.println("No hay suficiente stock.");
        }
    }
}
