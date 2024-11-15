package Logic;

import java.io.File;
import java.util.Random;


public class TestRegistrarEstudiante {
    public static void main(String[] args) {
        GestorEstudiante gestorEstudiante = new GestorEstudiante();
        File archivoEstudiante = new File("Frepontime1B/src/Datos/Estudiantes.txt");
        //GestorArchivos.cargarEstudiantes(gestorEstudiante, archivoEstudiante);
        registrarEstudiante(gestorEstudiante);
        buscarEstudiante(gestorEstudiante);
        GestorArchivos.guardarEstudiantes(gestorEstudiante, archivoEstudiante);

        System.out.println("\\n\n Estudiantes registrados:\n");
        gestorEstudiante.imprimirEstudiantes();
    }

    private static void buscarEstudiante(GestorEstudiante gestorEstudiante) {
        System.out.println("====================Búsqueda de un estudiante====================");
        String usuarioEstudianteBuscado = "pepe789";

        if(gestorEstudiante.buscarEstudiante(usuarioEstudianteBuscado) != null) {
            System.out.println("Logic.Estudiante encontrado");
        } else{
            System.out.println("No existe estudiante con el usuario " + usuarioEstudianteBuscado);
        }
        System.out.println(gestorEstudiante.buscarEstudiante(usuarioEstudianteBuscado));
    }

    private static void registrarEstudiante(GestorEstudiante gestorEstudiante) {
        System.out.println("====================Registro de un estudiante====================");

        // Información por pedir
        String códigoVerificación = generarCódigoRandom(1000, 9999);
        String correo = "juan.cofre@epn.edu.ec";
        String usuario = "juanChest";
        String nombre = "Juan";
        String apellido = "Cofre";
        String contraseña = "123456";

        // Generar y enviar el código de verificación
        //GestorCorreosElectrónicos correosElectrónicos = new GestorCorreosElectrónicos();
        //correosElectrónicos.enviarMensajeDeVerificaciónDeRegistro(correo, códigoVerificación, usuario);

        //Después de validar el correo electrónico con el código de verificación
        gestorEstudiante.agregarEstudiante(new Estudiante(apellido, nombre, usuario, correo, contraseña));
        gestorEstudiante.agregarEstudiante(new Estudiante(apellido, nombre, usuario, correo, contraseña));
        gestorEstudiante.agregarEstudiante(new Estudiante("uno", "Pepe", "pepe1", "correopepe1@gmail.com", "1234"));
        gestorEstudiante.agregarEstudiante(new Estudiante("dos", "Pepe", "pepe2", "correopepe2@gmail.com", "1234"));
        gestorEstudiante.agregarEstudiante(new Estudiante("tres", "Pepe", "pepe3", "correopepe3@gmail.com", "1234"));
        gestorEstudiante.agregarEstudiante(new Estudiante("cuatro", "Pepe", "pepe4", "correopepe4@gmail.com", "1234"));

        gestorEstudiante.agregarEstudiante(new Estudiante("Huilca", "Fernando", "FH", "fernando2@gmail.com", "1234"));
    }


    private static String generarCódigoRandom(int limiteInferior, int limiteSuperior) {
        Random random = new Random();
        return Integer.toString(random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior);
    }
}
