package ar.unrn.test;

import ar.unrn.model.SeguroMedico;
import ar.unrn.model.SeguroPaquete;
import ar.unrn.model.SeguroVida;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CargaDeUnSeguroSinDescuentos {

    private SeguroMedico seguroMedico;

    private SeguroPaquete paquete1;
    private Double montoEsperado;


    @BeforeEach
    public void Carga() {
        seguroMedico = new SeguroMedico(500.00,"Seguro médico");

        montoEsperado = 500.0;
    }

    @Test
    public void calcularMontoSeguro(){
        assertEquals(montoEsperado,seguroMedico.obtenerMonto());
    }
}
