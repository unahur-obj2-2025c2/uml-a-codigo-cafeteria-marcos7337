package ar.edu.unahur.productos.comidas;

public class Medialuna extends Comestible{
    private tipoMedialuna tipo;

    public Medialuna(String nombre, Double precioBase, Integer pesoGr, tipoMedialuna tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto() {
        Double costoAdicional = 0.0;
        switch (this.tipo) {
            case DE_MANTECA:
                costoAdicional = 3.0;
                break;
            case DE_GRASA:
                costoAdicional = 1.0;
                break;
            case CON_DULCE_DE_LECHE:
                costoAdicional = 5.0;
                break;
        }
        return costoAdicional;
    }
}
