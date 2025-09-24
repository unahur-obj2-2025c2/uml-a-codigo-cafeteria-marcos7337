package ar.edu.unahur.productos.comidas;

public class Tostado extends Comestible{

    private tipoTostado tipo;

    public Tostado(String nombre, Double precioBase, Integer pesoGr, tipoTostado tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto() {
        Double costoAdicional = 0.0;
        switch (this.tipo) {
            case JAMON_Y_QUESO:
                costoAdicional = 5.0;
                break;
            case SALAME_Y_QUESO:
                costoAdicional = 4.0;
                break;
        }
        return costoAdicional;
    }
    
}
