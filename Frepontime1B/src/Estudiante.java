public class Estudiante {
    private String apellido;
    private String nombre;
    private String usuario;
    private String correoElectrónico;
    private boolean enLínea;

    public Estudiante(String apellido, String nombre,String usuario, String correoElectrónico) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.usuario = usuario;
        this.correoElectrónico = correoElectrónico;
        this.enLínea = false;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                ", apellido='" + apellido + '\'' +
                "nombre='" + nombre + '\'' +
                ", usuario='" + usuario + '\'' +
                ", correoElectrónico='" + correoElectrónico + '\'' +
                '}';
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
}
