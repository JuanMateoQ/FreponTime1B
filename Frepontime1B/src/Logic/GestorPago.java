package Logic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class GestorPago {
    private ArrayList<Pago> pagos;

    public GestorPago() {
        pagos = new ArrayList<>();
    }

    public void crearPagoDeReserva(Reserva nuevaReserva, ArrayList<Reserva> reservasDeEstudiantes, Juego juego) {
        Ticket ticket = new Ticket("T-N" + nuevaReserva.getNumero(), LocalDate.now(), LocalTime.now());
        Pago nuevoPago = new Pago(reservasDeEstudiantes.size(), juego.getPrecioPorHora(), false, ticket);
        pagos.add(nuevoPago);
        nuevaReserva.setPago(nuevoPago); // Asociar el pago a la reserva
        System.out.println("Reserva creada con éxito. Ticket generado: " + ticket.getCodigo());
    }
    public boolean pagarReserva(Reserva reservaAPagar) {
        if (reservaAPagar.getPago().isEstadoPago()) {
            System.out.println("El pago ya fue confirmado.");
            return false;
        }

        reservaAPagar.getPago().setEstadoPago(true); // Marcar el pago como pagado
        reservaAPagar.setEstadoReserva(true); // Activa la reserva
        System.out.println("Pago confirmado. Reserva activada para uso.");
        return true;
    }
}
