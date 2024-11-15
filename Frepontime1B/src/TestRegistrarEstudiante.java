import java.util.Random;

public class TestRegistrarEstudiante {
    public static void main(String[] args) {
        GestorEstudiante gestorEstudiante = new GestorEstudiante();
        registrarEstudiante(gestorEstudiante);
        buscarEstudiante(gestorEstudiante);
    }

    private static void buscarEstudiante(GestorEstudiante gestorEstudiante) {
        System.out.println("====================Búsqueda de un estudiante====================");
        String usuarioEstudianteBuscado = "pepe789";

        if(gestorEstudiante.buscarEstudiante(usuarioEstudianteBuscado) != null) {
            System.out.println("Estudiante encontrado");
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

        // Generar y enviar el código de verificación
        //GestorCorreosElectrónicos correosElectrónicos = new GestorCorreosElectrónicos();
        //correosElectrónicos.enviarMensajeDeVerificaciónDeRegistro(correo, códigoVerificación, usuario);

        //Después de validar el correo electrónico con el código de verificación
        gestorEstudiante.agregarEstudiante(new Estudiante(nombre, apellido, usuario, correo));
        gestorEstudiante.agregarEstudiante(new Estudiante(nombre, apellido, usuario, correo));
        gestorEstudiante.agregarEstudiante(new Estudiante("Pepe", "1", "pepe1", "correopepe1@gmail.com"));
        gestorEstudiante.agregarEstudiante(new Estudiante("Pepe", "2", "pepe2", "correopepe2@gmail.com"));
        gestorEstudiante.agregarEstudiante(new Estudiante("Pepe", "3", "pepe3", "correopepe3@gmail.com"));
        gestorEstudiante.agregarEstudiante(new Estudiante("Pepe", "4", "pepe4", "correopepe4@gmail.com"));

        System.out.println("Estudiantes registrados");
        gestorEstudiante.imprimirEstudiantes();
    }

    private static String generarCódigoRandom(int limiteInferior, int limiteSuperior) {
        Random random = new Random();
        return Integer.toString(random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior);
    }
}
