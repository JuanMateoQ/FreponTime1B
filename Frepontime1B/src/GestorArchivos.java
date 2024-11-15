import java.io.*;

public class GestorArchivos {

    public static void guardarEstudiantes(GestorEstudiante gestorEstudiante, File archivoEstudiante) {
        try {
            FileWriter writer = new FileWriter(archivoEstudiante);
            for(Estudiante estudiante: gestorEstudiante.getEstudiantes()){
                writer.write(estudiante.getApellido() + " "
                        + estudiante.getNombre() + " "
                        + estudiante.getUsuario() + " "
                        + estudiante.getCorreoElectrónico() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void cargarEstudiantes (GestorEstudiante gestorEstudiante, File archivoEstudiante){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivoEstudiante));
            String estudiante;
            String apellidoEstudiante;
            String nombreEstudiante;
            String usuarioEstudiante;
            String correoEstudiante;
            while ((estudiante = reader.readLine()) != null) {
                // Procesar la línea
                apellidoEstudiante = estudiante.split(" ")[0];
                nombreEstudiante = estudiante.split(" ")[1];
                usuarioEstudiante = estudiante.split(" ")[2];
                correoEstudiante = estudiante.split(" ")[3];
                gestorEstudiante.agregarEstudiante(new Estudiante(apellidoEstudiante, nombreEstudiante, usuarioEstudiante, correoEstudiante));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

