package Logic;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class GestorEstudiante {
    private ArrayList<Estudiante> estudiantes;
    private String codigoDeVerificacion;
    private Estudiante estudianteAux;
    private File estudianteFile;

    public GestorEstudiante() {
        estudiantes = new ArrayList<>();
        estudianteFile = new File("FreponTime1B/src/Datos/Estudiantes.txt");
        GestorArchivos.cargarEstudiantes(this, estudianteFile);
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
                System.out.printf("Inicio de sesión correcto");
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
        this.codigoDeVerificacion = generarCódigoRandom(1000,9999);
        if(!correosElectrónicos.enviarMensajeDeVerificaciónDeRegistro(estudiante.getCorreoElectrónico(),
                this.codigoDeVerificacion, estudiante.getUsuario())){
            return false;
        }
        return true;
    }

    public boolean verificarCodigo(String codigo) {
        return this.codigoDeVerificacion.compareTo(codigo) == 0;
    }

    public void preservarPosibleEstudiante(Estudiante estudianteAux) {
        this.estudianteAux = estudianteAux;
    }

    public void guardarPosibleEstudiante() {
        agregarEstudiante(this.estudianteAux);
        GestorArchivos.guardarEstudiantes(this, estudianteFile);
    }
}
