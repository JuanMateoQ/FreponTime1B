package Logic;

import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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

    public static void cargarJuegos(GestorReserva gestorReserva, File archivoJuegos) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivoJuegos));
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
                gestorReserva.agregarJuegos(new Juego(nombreJuego, buenEstado, precioPorHora));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void cargarReservas(GestorReserva gestorReserva, File archivoReservas) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoReservas))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                // Separar los elementos de la línea
                String[] datos = linea.split(" ");
                int numero = Integer.parseInt(datos[0]);
                String nombreJuego = datos[1];
                boolean estadoDeReserva = Boolean.parseBoolean(datos[2]);
                LocalDate fecha = LocalDate.parse(datos[3]); // Formato: yyyy-MM-dd
                LocalTime hora = LocalTime.parse(datos[4]);   // Formato: HH:mm
                Duration tiempo = Duration.ofMinutes(Long.parseLong(datos[5])); // Minutos

                // Crear el objeto Horario
                Horario horario = new Horario(fecha, hora, tiempo);

                // Obtener los detalles del juego
                boolean estadoJuego = Boolean.parseBoolean(datos[6]);
                double precioPorHora = Double.parseDouble(datos[7]);

                // Crear el objeto Juego
                Juego juego = new Juego(nombreJuego, estadoJuego, precioPorHora);

                // Crear el objeto Reserva
                Reserva reserva = new Reserva(numero, juego, horario, estadoDeReserva);

                // Agregar la reserva a la lista
                gestorReserva.agregarReserva(reserva);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

    }
    public static void guardarReservas(File archivoReservas, ArrayList<Reserva> reservas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoReservas))) {
            // Formatos de fecha y hora
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

            for (Reserva reserva : reservas) {
                // Extraer los datos de la reserva
                int numero = reserva.getNumero();
                String nombreJuego = reserva.getJuego().getNombre();
                boolean estadoDeReserva = reserva.gestEstadoDeReserva();

                // Extraer los datos del horario
                Horario horario = reserva.getHorario();
                String fecha = horario.getFecha().format(formatoFecha);
                String hora = horario.getHora().format(formatoHora);
                long duracionMinutos = horario.getTiempo().toMinutes();

                // Extraer los datos del juego
                Juego juego = reserva.getJuego();
                boolean estadoJuego = juego.getEstado();
                double precioPorHora = juego.getTiempoPorHora();

                // Crear la línea de texto con todos los datos
                String linea = numero + " " + nombreJuego + " " + estadoDeReserva + " " +
                        fecha + " " + hora + " " + duracionMinutos + " " + estadoJuego + " " + precioPorHora;

                // Escribir la línea en el archivo
                writer.write(linea);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void cargarReservasDeEstudiantes(GestorReserva gestorReserva, File reservasDeEstudiantes) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(reservasDeEstudiantes));
            String estudiante;
            String usuarioEstudiante;
            int numeroDeReserva;

            while ((estudiante = reader.readLine()) != null) {
                // Procesar la línea
                usuarioEstudiante = estudiante.split(" ")[0];
                numeroDeReserva =Integer.parseInt(estudiante.split(" ")[1]);
                gestorReserva.agregarReservasAlEstudiante(usuarioEstudiante, numeroDeReserva);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

