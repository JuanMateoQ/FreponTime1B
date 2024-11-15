package Logic;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class GestorEstudiante {
    private ArrayList<Estudiante> estudiantes;
    public GestorEstudiante() {
        estudiantes = new ArrayList<>();
        GestorArchivos.cargarEstudiantes(this, new File("src/Datos/Estudiantes.txt"));
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
    public boolean iniciarSesion (String correo, String contrasena){
        for(Estudiante estudiante: estudiantes){
            if(estudiante.getCorreoElectrónico().compareTo(correo) == 0 && estudiante.getContraseña().compareTo(contrasena) ==0){
                return true;
            }
        }
        return false;
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
    private static String generarCódigoRandom(int limiteInferior, int limiteSuperior) {
        Random random = new Random();
        return Integer.toString(random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior);
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
