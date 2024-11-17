package Logic;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestReservaPago {
    public static void main(String[] args) {
        //Instancias
        GestorReserva gestorReserva = new GestorReserva();
        Juego billar = new Juego("billar", false, 2.5);
        Horario horario = new Horario(LocalDate.of(2024,11,13), LocalTime.of(12,0), Duration.ofHours(1));

        //Inicio sesión
        gestorReserva.iniciarSesion("juan.cofre@epn.edu.ec", "123456");

        //Realiza la reserva
        gestorReserva.crearReserva(billar, horario);
        gestorReserva.imprimirEstudianteEnLinea();
    }
}
