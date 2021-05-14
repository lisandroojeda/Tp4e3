package ar.unrn.model;

import java.util.ArrayList;

public class SeguroPaquete implements Seguro{


    private final Double porcentajeDescuentoPorAcumulacion = 0.05;
    private ArrayList<Seguro> anexosSeguros;

    public SeguroPaquete(){
        this.anexosSeguros = new ArrayList<>();
    }

    private Double aplicarDescuento() {
        Double monto = 0.0;
        Double descuento = 0.0;
        for (Seguro seguro: this.anexosSeguros){
            descuento = seguro.obtenerMonto() * porcentajeDescuentoPorAcumulacion;
            monto += seguro.obtenerMonto() - descuento;
        }
        return monto;
    }

    @Override
    public Double obtenerMonto() {
        return aplicarDescuento();
    }

    @Override
    public void agregarSeguroAlgrupo(Seguro seguro) {
        anexosSeguros.add(seguro);
    }




}
