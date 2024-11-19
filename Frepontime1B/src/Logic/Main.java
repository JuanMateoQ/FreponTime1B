package Logic;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        GestorReserva gestorReserva = GestorReserva.getInstance();
        System.out.println(gestorReserva.getJuegosDisponibles());
        for(int i = 0; i < gestorReserva.getGestorEstudiante().getEstudiantes().size(); i++){
            System.out.println(gestorReserva.getGestorEstudiante().getEstudiantes().get(i));
        }

    }

}