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
}
