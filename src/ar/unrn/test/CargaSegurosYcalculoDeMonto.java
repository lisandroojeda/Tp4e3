package ar.unrn.test;

import ar.unrn.model.SeguroBasico;
import ar.unrn.model.SeguroMedico;
import ar.unrn.model.SeguroPaquete;
import ar.unrn.model.SeguroVida;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CargaSegurosYcalculoDeMonto {

    private SeguroMedico seguroMedico;
    private SeguroVida seguroVida;

    private SeguroPaquete paquete1;
    private Double montoEsperado;


    @BeforeEach
    public void Carga() {
        seguroMedico = new SeguroMedico(500.00,"Seguro médico");
        seguroVida = new SeguroVida(450.00,"seguro vida");

        paquete1 = new SeguroPaquete();

        paquete1.agregarSeguroAlgrupo(seguroMedico);
        paquete1.agregarSeguroAlgrupo(seguroVida);

       montoEsperado = 902.5;
    }

    @Test
    public void calcularMontoSeguro(){
        assertEquals(montoEsperado,paquete1.obtenerMonto());

    }
}
