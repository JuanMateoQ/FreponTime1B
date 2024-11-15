import java.util.ArrayList;

public class GestorEstudiante {
    private ArrayList<Estudiante> estudiantes;
    public GestorEstudiante() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (buscarEstudiante(estudiante.getUsuario()) != null) {
            System.out.println("El estudiante con usuario: " + estudiante.getUsuario()
                    + " ya está registrado");
            return;
        }
        estudiantes.add(estudiante);
        System.out.println("Se registrado un estudiante con éxito");
        System.out.println(estudiante);
    }

    public Estudiante buscarEstudiante(String usuario) {
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getUsuario().equals(usuario)) {
                return estudiante;
            }
        }
        return null;
    }
    public void imprimirEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
