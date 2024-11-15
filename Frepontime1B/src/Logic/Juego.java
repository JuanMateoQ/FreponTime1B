package Logic;

public class Juego {
    private String nombre;
    private boolean buenEstado;
    private double precioPorHora;

    public Juego(String nombre, boolean estado, double precioPorHora) {
        this.nombre = nombre;
        this.buenEstado = estado;
        this.precioPorHora = precioPorHora;
    }
    public Juego (){
        this.nombre = null;
    }

    public boolean getEstado() {
        return buenEstado;
    }

    @Override
    public String toString() {
        return "Logic.Juego{" +
                "nombre='" + nombre + '\'' +
                ", buenEstado=" + buenEstado +
                ", precioPorHora=" + precioPorHora +
                '}';
    }

    public void crearJuego(Juego juego) {
        this.nombre = juego.nombre;
        this.buenEstado = juego.buenEstado;
        this.precioPorHora = juego.precioPorHora;
    }
}
