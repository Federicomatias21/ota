package ar.edu.unahur.obj2;

import org.joda.time.DateTime;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Ota {

    private DistribuidorDeTrafico distribuidorDeTrafico;

    public Ota(DistribuidorDeTrafico distribuidorDeTrafico) {
        this.distribuidorDeTrafico = distribuidorDeTrafico;
    }

    public List<Vuelo> buscarVuelos(DateTime fecha, String origen, String destino) {

        Adaptador Proveedor = distribuidorDeTrafico.proveedor();
        return Proveedor.disponibilidad(fecha, origen, destino);
    }

    public Boleto reservar(Vuelo vuelo, Set<Pasajero> pasajeros) {
        Adaptador Proovedor = distribuidorDeTrafico.proveedor();
        return Proovedor.reserva(vuelo,pasajeros);
    }


}
