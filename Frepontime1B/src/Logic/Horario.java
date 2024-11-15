package Logic;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {
    private LocalDate fecha;
    private LocalTime hora;
    private Duration tiempo;

    public Horario(LocalDate fecha, LocalTime hora, Duration tiempo) {
        this.fecha = fecha;
        this.hora = hora;
        this.tiempo = tiempo;
    }
}
