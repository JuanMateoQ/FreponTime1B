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

    public boolean getEstado() {
        return buenEstado;
    }

    @Override
    public String toString() {
        return "Juego: " +
                "nombre='" + nombre + '\'' +
                ", buenEstado=" + buenEstado +
                ", precioPorHora=" + precioPorHora;
    }

    public void crearJuego(Juego juego) {
        this.nombre = juego.nombre;
        this.buenEstado = juego.buenEstado;
        this.precioPorHora = juego.precioPorHora;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Juego juego = (Juego) obj;
        return this.nombre.equals(juego.nombre) && this.buenEstado == juego.buenEstado
                && this.precioPorHora == juego.precioPorHora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getTiempoPorHora() {
        return this.precioPorHora;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }
}
