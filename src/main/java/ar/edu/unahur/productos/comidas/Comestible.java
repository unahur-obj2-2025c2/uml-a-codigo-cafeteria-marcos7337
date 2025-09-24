package ar.edu.unahur.productos.comidas;

import ar.edu.unahur.productos.Producto;

public abstract class Comestible extends Producto{

    protected Integer pesoGr;

    public Comestible(String nombre, Double precioBase, Integer pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }

    @Override
    public Double costo() {
        return super.costo() + this.doCosto();
    }
    
    public abstract Double doCosto();
}
