package Logic;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    private String código;
    private boolean válido;
    private LocalDate fechaReserva;
    private LocalTime horaReserva;

    public Ticket(String código, LocalDate fechaReserva, LocalTime horaReserva) {
        this.código = código;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
    }

    public String getCodigo() {
        return código;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "código='" + código + '\'' +
                '}';
    }
}
