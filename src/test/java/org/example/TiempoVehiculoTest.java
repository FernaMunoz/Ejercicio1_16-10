package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TiempoVehiculoTest {

    @Test
    public void testTiempoRecorridoAuto() {
        TiempoVehiculo tiempoVehiculo = new TiempoVehiculo();
        int opcion = 1;
        double distancia = 100.0;
        double resultado = tiempoVehiculo.tiempoRecorrido(opcion, distancia);
        double velocidadAuto = 100.0;
        double tiempo = distancia / velocidadAuto;

        assertEquals(tiempo, resultado, 1.0);
    }

    @Test
    public void testTiempoRecorridoMoto() {
        TiempoVehiculo tiempoVehiculo = new TiempoVehiculo();
        int opcion = 2;
        double distancia = 100.0;
        double resultado = tiempoVehiculo.tiempoRecorrido(opcion, distancia);
        double velocidadMoto = 120.0;
        double tiempo = distancia / velocidadMoto;

        assertEquals(tiempo, resultado, 1.2);
    }

    @Test
    public void testTiempoRecorridoBicicleta(){
        TiempoVehiculo tiempoVehiculo = new TiempoVehiculo();
        int opcion = 3;
        double distancia = 100.0;
        double resultado = tiempoVehiculo.tiempoRecorrido(opcion, distancia);
        double velocidadBicicleta = 20.0;
        double tiempo = distancia / velocidadBicicleta;

        assertEquals(tiempo, resultado, 0.2);
    }
}
//segun las pruebas unitarias todo es verdadero