package Logic;

import java.io.*;

public class GestorArchivos {

    public static void guardarEstudiantes(GestorEstudiante gestorEstudiante, File archivoEstudiante) {
        try {
            FileWriter writer = new FileWriter(archivoEstudiante);
            for (Estudiante estudiante : gestorEstudiante.getEstudiantes()) {
                writer.write(estudiante.getApellido() + " "
                        + estudiante.getNombre() + " "
                        + estudiante.getUsuario() + " "
                        + estudiante.getCorreoElectrónico() + " "
                        + estudiante.getContraseña() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void cargarEstudiantes(GestorEstudiante gestorEstudiante, File archivoEstudiante) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivoEstudiante));
            String estudiante;
            String apellidoEstudiante;
            String nombreEstudiante;
            String usuarioEstudiante;
            String correoEstudiante;
            String contraseñaEstudiante;
            while ((estudiante = reader.readLine()) != null) {
                // Procesar la línea
                apellidoEstudiante = estudiante.split(" ")[0];
                nombreEstudiante = estudiante.split(" ")[1];
                usuarioEstudiante = estudiante.split(" ")[2];
                correoEstudiante = estudiante.split(" ")[3];
                contraseñaEstudiante = estudiante.split(" ")[4];
                gestorEstudiante.agregarEstudiante(new Estudiante(apellidoEstudiante, nombreEstudiante, usuarioEstudiante, correoEstudiante, contraseñaEstudiante));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void cargarJuegos(GestorReserva gestorReserva, File archivoReserva) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivoReserva));
            String juego;
            String nombreJuego;
            boolean buenEstado;
            double precioPorHora;
            while ((juego = reader.readLine()) != null) {
                // Procesar la línea
                nombreJuego = juego.split(" ")[0];
                buenEstado = Boolean.parseBoolean(juego.split(" ")[1]);
                precioPorHora = Double.parseDouble(juego.split(" ")[2]);
                //TODO: Hacer función agregarJuegos en gestor reserva
                //gestorReserva.agregarJuegos(new Juego(nombreJuego, buenEstado, precioPorHora));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

