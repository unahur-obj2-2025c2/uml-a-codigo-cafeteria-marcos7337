package ar.edu.unahur.obj2.composite.consumibles;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Consumible{

    private String nombre;
    private Double precio; // No se usa
    private List<Consumible> productos = new ArrayList<>();

    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Combo(String nombre, Double precio, List<Consumible> productos) {
        this.nombre = nombre;
        this.precio = precio;
        this.productos = productos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void agregarProducto(Consumible producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(Consumible producto) {
        this.productos.remove(producto);
    }

    @Override
    public Double costo() {
        return this.productos.stream().mapToDouble(p -> p.costo()).sum();
    }
}
