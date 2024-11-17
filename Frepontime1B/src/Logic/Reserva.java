package Logic;

public class Reserva {
    private int numero;
    private boolean estadoDeReserva;
    private Horario horario;
    private Juego juego;

    public Reserva(int numero, Juego juego, Horario horario) {
        this.numero = numero;
        this.juego = juego;
        this.estadoDeReserva = true;
        this.horario = horario;
    }

    public Reserva(int numero, Juego juego, Horario horario, boolean estadoDeReserva) {
        this.numero = numero;
        this.juego = juego;
        this.estadoDeReserva = estadoDeReserva;
        this.horario = horario;
    }

    public Juego getJuego() {
        return this.juego;
    }

    public Horario getHorario() {
        return this.horario;
    }

    public int getNumero() {
        return this.numero;
    }

    public boolean gestEstadoDeReserva() {
        return this.estadoDeReserva;
    }
}
