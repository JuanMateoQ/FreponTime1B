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
        if (buscarEstudiante(estudiante.getUsuario())) {
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
                estudiante.setEnLinea(true);
                return true;
            }
        }
        return false;
    }

    public boolean buscarEstudiante(String usuario) {
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getUsuario().equals(usuario)) {
                return true;
            }
        }
        return false;
    }
    public void imprimirEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
    private String generarCódigoRandom(int limiteInferior, int limiteSuperior) {
        Random random = new Random();
        return Integer.toString(random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior);
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public boolean enviarCodigo(Estudiante estudiante) {
        GestorCorreosElectrónicos correosElectrónicos = new GestorCorreosElectrónicos();
        if(!correosElectrónicos.enviarMensajeDeVerificaciónDeRegistro(estudiante.getCorreoElectrónico(),
                generarCódigoRandom(1000,9999), estudiante.getUsuario())){
            return false;
        }
        return true;
    }
}
