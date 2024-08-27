package org.example;

public class Producto {

    String Nombre;
    double Precio;
    public int CantidadEnStock;

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getCantidadEnStock() {
        return CantidadEnStock;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        CantidadEnStock = cantidadEnStock;
    }

    public Producto(String nombre, double precio, int cantidadEnStock) {
        Nombre = nombre;
        Precio = precio;
        CantidadEnStock = cantidadEnStock;
    }
}
