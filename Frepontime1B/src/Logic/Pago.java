package Logic;

public class Pago {
    private int nPago;
    private double monto;
    private boolean estadoPago;
    private Ticket reserva;

    public Pago(int nPago, double monto, boolean estadoPago) {
        this.nPago = nPago;
        this.monto = monto;
        this.estadoPago = estadoPago;
    }

    public void setnPago(int nPago) {
        this.nPago = nPago;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public void setReserva(Ticket reserva) {
        this.reserva = reserva;
    }

    public int getnPago() {
        return nPago;
    }

    public double getMonto() {
        return monto;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public Ticket getReserva() {
        return reserva;
    }

    public void setTicket(Ticket ticket) {
        this.reserva = ticket;
    }
}
