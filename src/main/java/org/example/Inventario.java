package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Inventario {
    Producto[] productos;

    public Inventario(Producto[] productos) {
        this.productos = productos;
    }

    double calcularValorInventario(Producto[] productos) {
        double valorTotal = 0;
        for (int i = 0; i < productos.length; i++) {
            valorTotal += productos[i].Precio * productos[i].CantidadEnStock;
        }
        return valorTotal;
    }

    void encontrarProductoMasCaro(Producto[] productos) {
        double expensiveProduct = productos[0].getPrecio();
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && (productos[i].getPrecio() > expensiveProduct)) {
                expensiveProduct += productos[i].getPrecio();
                System.out.println("El producto más caro ahora cuesta " + expensiveProduct);
            } else {
                System.out.println("El producto más caro no está aquí");
            }
        }
    }

    void encontrarProductoMasCaro1(Producto[] productos) {
        double expensiveProduct = productos[0].getPrecio();
        double aux = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && (productos[i].getPrecio() > expensiveProduct)) {
                for (int j = i + 1; j < productos.length - 1; j++) {

                }
            }
        }
    }

    void realizarVenta(String nombreProducto, int cantidadVendida) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getNombre().equals(nombreProducto)) {
                if (productos[i].getCantidadEnStock() >= cantidadVendida) {
                    productos[i].CantidadEnStock -= cantidadVendida;
                    System.out.println("Venta realizada. Quedan " + productos[i].getCantidadEnStock() + " unidades de " + productos[i].getNombre() + ".");
                } else {
                    System.out.println("Venta no realizada. Stock insuficiente.");
                }
                return; // Salir del bucle una vez que se encuentra el producto.
            }
        }
        System.out.println("Producto no encontrado.");


    }
}
