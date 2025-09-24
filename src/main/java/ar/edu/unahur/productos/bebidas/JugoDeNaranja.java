package ar.edu.unahur.productos.bebidas;

public class JugoDeNaranja extends Bebible{

    public JugoDeNaranja(String nombre, Double precioBase, Integer capacidadML) {
        super(nombre, precioBase, capacidadML);
    }

    @Override
    public Double doCosto() {
        return (this.capacidadML >= 750)? 10.0 : 0.0; 
    }
}
