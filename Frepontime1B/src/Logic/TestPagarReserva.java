package Logic;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestPagarReserva {
    public static void main(String[] args) {
        GestorArchivos Gest = new GestorArchivos();
        GestorReserva gestorReserva = GestorReserva.getInstance();

        //Inicia sesión
        gestorReserva.getGestorEstudiante().iniciarSesion("juan.cofre@epn.edu.ec", "123456");
        //T-N0 1

        //Crea la reserva en base a un juego y horario que hay elegido
        //Aqui se instancia por el ejemplo
        Reserva reserva = null;
        reserva = gestorReserva.crearReserva(new Juego("Billar",true,2.5),
                new Horario(LocalDate.of(2024,11,22), LocalTime.of(13,30), Duration.ofMinutes(1)));

        //Se realizó la reserva o si no hay reservas duplicadas
        if(reserva != null) {
            Estudiante estudianteConReserva = null;
            for(Estudiante estudianteEnLinea: gestorReserva.getGestorEstudiante().getEstudiantes()){
                if (estudianteEnLinea.isEnLínea()){
                    estudianteConReserva = estudianteEnLinea;
                    System.out.println("Estudiante en línea: \n" + estudianteEnLinea);
                }
            }

            //Se paga la reserva
            gestorReserva.getGestorPago().pagarReserva(reserva);
            System.out.println(estudianteConReserva);

            //Como se pago la reserva, se paga cada uno de los datos necesarios
            GestorArchivos.guardarReservas(gestorReserva, new File("Frepontime1B/src/Datos/Reserva.txt"));
            GestorArchivos.guardarReservasDeEstudiantes(gestorReserva, new File("Frepontime1B/src/Datos/ReservasDeEstudiante.txt"));
            GestorArchivos.guardarTickets(gestorReserva.getGestorPago(),new File("Frepontime1B/src/Datos/Tickets.txt"));
            GestorArchivos.guardarPagos(gestorReserva.getGestorPago(),new File("Frepontime1B/src/Datos/Pagos.txt"));
            GestorArchivos.guardarPagosTicket(gestorReserva.getGestorPago(), new File("Frepontime1B/src/Datos/PagosTickets.txt"));
        } else {
            System.out.println("Hay reservas duplicadas");
        }

    }
}
