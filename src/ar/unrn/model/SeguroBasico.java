package ar.unrn.model;

import java.util.ArrayList;

public abstract class SeguroBasico implements Seguro{

    private Double monto;
    private String descripcion;
    private final Double porcentajeDescuentoPorAcumulacion = 0.05;


    public SeguroBasico(Double monto, String descripcion){
        if (descripcion == null || descripcion.isEmpty())
            throw new RuntimeException("Debe existir una descripcion");
        if (monto<0)
            throw new RuntimeException("El monto ingresado debe superar los 0 $");

        this.descripcion = descripcion;
        this.monto = monto;

    }

    @Override
    public Double obtenerMonto() {
        return this.monto;
    }

    @Override
    public void agregarSeguroAlgrupo(Seguro seguro) {
        throw new RuntimeException("SeguroBasico no puede anexar");
    }
}
