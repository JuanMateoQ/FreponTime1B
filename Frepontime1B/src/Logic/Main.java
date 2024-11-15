package Logic;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        GestorReserva gestor = new GestorReserva();
        //Buscar Juegos (Listar Juegos)
        System.out.println(gestor.getJuegosDisponibles());
        Juego juego = gestor.getJuegosDisponibles().get(0);
        juego.crearJuego(gestor.getJuegosDisponibles().get(0));

        Horario horario = new Horario(LocalDate.now(), LocalTime.now(), Duration.ofHours(0).plusMinutes(30));
        gestor.crearReserva(juego,horario);

    }

}