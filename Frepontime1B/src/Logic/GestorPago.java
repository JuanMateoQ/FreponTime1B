package Logic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class GestorPago {

    public static void crearPagoDeReserva(Reserva nuevaReserva, ArrayList<Reserva> reservasDeEstudiantes, Juego juego) {
        Ticket ticket = new Ticket("T-N" + nuevaReserva.getNumero(), LocalDate.now(), LocalTime.now());
        Pago nuevoPago = new Pago(reservasDeEstudiantes.size(), juego.getPrecioPorHora(), false, ticket);
        nuevaReserva.setPago(nuevoPago); // Asociar el pago a la reserva
        System.out.println("Reserva creada con éxito. Ticket generado: " + ticket.getCodigo());
    }
}
