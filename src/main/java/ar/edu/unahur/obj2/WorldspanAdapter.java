package ar.edu.unahur.obj2;


import ar.edu.unahur.obj2.proveedores.Worldspan;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class WorldspanAdapter implements Adaptador{

    private Worldspan Worldspan;

    public WorldspanAdapter(Worldspan worldspan) {
        Worldspan = worldspan;
    }

    @Override
    public List<Vuelo> disponibilidad(DateTime fecha, String origen, String destino) {
        return Worldspan.searchFlights(fecha.getDayOfMonth(),fecha.getMonthOfYear(),fecha.getYear(), origen, destino);
        }

    @Override
    public Boleto reserva(Vuelo vuelo, Set<Pasajero> pasajeros) {
        return Worldspan.bookFlight(vuelo,pasajeros);
    }
}
