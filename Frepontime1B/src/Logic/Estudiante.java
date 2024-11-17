package Logic;

public class Estudiante {
    private String apellido;
    private String nombre;
    private String usuario;
    private String correoElectrónico;
    private String contraseña;
    private Reserva reserva;

    private boolean enLínea;

    public Estudiante(String apellido, String nombre, String usuario, String correoElectrónico, String contraseña) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.usuario = usuario;
        this.correoElectrónico = correoElectrónico;
        this.contraseña = contraseña;
        this.enLínea = false;
    }

    public boolean isEnLínea() {
        return enLínea;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCorreoElectrónico() {
        return correoElectrónico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setEnLinea(boolean enLínea) {
        this.enLínea = enLínea;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva nuevaReserva) {
        this.reserva = nuevaReserva;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", usuario='" + usuario + '\'' +
                ", correoElectrónico='" + correoElectrónico + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", enLínea=" + enLínea +
                "\n reserva=" + reserva +
                '}';
    }
}
