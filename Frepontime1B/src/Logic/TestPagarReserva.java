package Logic;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestPagarReserva {
    public static void main(String[] args) {
        GestorArchivos Gest = new GestorArchivos();
        GestorReserva gestorReserva = GestorReserva.getInstance();
        gestorReserva.getGestorEstudiante().iniciarSesion("juan.cofre@epn.edu.ec", "123456");

        gestorReserva.crearReserva(new Juego("Billar",true,2.5), new Horario(LocalDate.now(), LocalTime.now(), Duration.ofMinutes(1)));
        Estudiante estudianteConReserva = null;
        for(Estudiante estudianteEnLinea: gestorReserva.getGestorEstudiante().getEstudiantes()){
            if (estudianteEnLinea.isEnLínea()){
                estudianteConReserva = estudianteEnLinea;
                System.out.println("Estudiante en línea: \n" + estudianteEnLinea);
            }
        }
        int i = 0;
        for(Reserva reserva: gestorReserva.getReservasDeEstudiantes()){
            if(reserva.getNumero() == estudianteConReserva.getNumerosDeReservas().get(i)){
                System.out.println();
            }
        }
        GestorArchivos.guardarTickets(gestorReserva.getGestorPago(),new File("Frepontime1B/src/Datos/Tickets.txt"));
        GestorArchivos.guardarPagos(gestorReserva.getGestorPago(),new File("Frepontime1B/src/Datos/Pagos.txt"));
        GestorArchivos.guardarPagosTicket(gestorReserva.getGestorPago(), new File("Frepontime1B/src/Datos/PagosTickets.txt"));
    }
}
