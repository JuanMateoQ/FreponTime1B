package Logic;

public class Pago {
    private int nPago;
    private double monto;
    private boolean estadoDePago;
    private Ticket ticket;

    public Pago(int nPago, double monto, boolean estadoDePago, Ticket reserva) {
        this.nPago = nPago;
        this.monto = monto;
        this.estadoDePago = estadoDePago;
        this.ticket = reserva;
    }
}
