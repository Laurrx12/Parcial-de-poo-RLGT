/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gabriela.tienda;

import java.util.ArrayList;
import gabriela.tienda.model.*;

public class Tienda {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Chaqueta("Chaqueta de cuero", 10, "Negro", 250000, "M"));
        productos.add(new Pantalon("Jeans clásicos", 20, "Azul", 120000, "32"));
        productos.add(new Camiseta("Blusa ligera", 15, "Blanco", 80000, "S"));
        productos.add(new Falda("Falda plisada", 8, "Rojo", 95000, "L"));

        for (Producto p : productos) {
            p.mostrarInfo();
        }

        Chaqueta chaqueta = (Chaqueta) productos.get(0);
        chaqueta.aplicarDescuento(10);

        Pantalon jeans = (Pantalon) productos.get(1);
        jeans.vender(5);

        Camiseta blusa = (Camiseta) productos.get(2);
        blusa.vender(3);
    }
}
