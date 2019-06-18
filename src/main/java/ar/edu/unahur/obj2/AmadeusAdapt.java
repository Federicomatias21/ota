package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Amadeus;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class AmadeusAdapt implements Adaptador{
    private Amadeus amadeus;

    public AmadeusAdapt(Amadeus amadeus) {
        this.amadeus = amadeus;
    }

    @Override
    public List<Vuelo> disponibilidad(DateTime fecha, String origen, String destino) {
       return amadeus.executeSearch(fecha, origen, destino);
    }

    @Override
    public Boleto reserva(Vuelo vuelo, Set<Pasajero> pasajeros) {
       return amadeus.executeBook(vuelo,pasajeros);


    }
}
