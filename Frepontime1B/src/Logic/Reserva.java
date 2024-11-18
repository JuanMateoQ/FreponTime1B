package Logic;

public class Reserva {
    private int numero;
    private boolean estadoDeReserva;
    private Horario horario;
    private Juego juego;
    private Pago pagoReserva;


    public Reserva(int numero, Juego juego, Horario horario) {
        this.numero = numero;
        this.juego = juego;
        this.estadoDeReserva = false;
        this.horario = horario;
    }

    public Juego getJuego() {
        return this.juego;
    }

    public Horario getHorario() {
        return this.horario;
    }

    public boolean isEstadoDeReserva() {
        return estadoDeReserva;
    }

    public int getNumero() {
        return numero;
    }

    public void setPago(Pago nuevoPago) {
        pagoReserva = nuevoPago;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "numero=" + numero +
                "\n juego=" + juego +
                "\n horario=" + horario +
                "\n pagoReserva=" + pagoReserva +
                '}';
    }
}
