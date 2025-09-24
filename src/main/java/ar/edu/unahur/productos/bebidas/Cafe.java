package ar.edu.unahur.productos.bebidas;

public class Cafe extends Bebible{
    
    private Boolean conLeche;

    public Cafe(String nombre, Double precioBase, Integer capacidadML, Boolean conLeche) {
        super(nombre, precioBase, capacidadML);
        this.conLeche = conLeche;
    }

    @Override
    public Double doCosto() {
        return (this.conLeche)? 5.0 : 0.0;
    }
}
