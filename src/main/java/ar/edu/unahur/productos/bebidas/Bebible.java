package ar.edu.unahur.productos.bebidas;

import ar.edu.unahur.productos.Producto;

public abstract class Bebible extends Producto{

    protected Integer capacidadML;

    public Bebible(String nombre, Double precioBase, Integer capacidadML) {
        super(nombre, precioBase);
        this.capacidadML = capacidadML;
    }

    @Override
    public Double costo() {
        return super.costo() + this.doCosto();
    }

    public abstract Double doCosto();
}