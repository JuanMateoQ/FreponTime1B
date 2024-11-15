public class Estudiante {
    private String nombre;
    private String apellido;
    private String usuario;
    private String correoElectrónico;

    public Estudiante(String nombre, String apellido,String usuario, String correoElectrónico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.correoElectrónico = correoElectrónico;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
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
