package ar.edu.unahur.obj2;

import java.util.List;
import java.util.Set;
import org.joda.time.DateTime;
public interface Adaptador {

     List<Vuelo> disponibilidad(DateTime fecha, final String origen, final String destino);
     Boleto reserva(Vuelo vuelo, Set<Pasajero> pasajeros);


}
