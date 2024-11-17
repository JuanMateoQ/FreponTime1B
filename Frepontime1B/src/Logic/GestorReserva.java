package Logic;

import java.io.File;
import java.util.ArrayList;

public class GestorReserva {
    private ArrayList<Reserva> reservasDeEstudiantes;
    private ArrayList<Juego> juegos;
    private GestorEstudiante gestorEstudiante;
    private File reservasFile;
    private File juegosFile;


    private static GestorReserva instance;

    private GestorReserva(){
        reservasDeEstudiantes = new ArrayList<Reserva>();
        juegos = new ArrayList<Juego>();
        gestorEstudiante = new GestorEstudiante();
        GestorArchivos.cargarJuegos(this, juegosFile);
        GestorArchivos.cargarReservas(this, reservasFile);
        //TODO: va a ser la clase principal, todos los demás gestores se inicializan aquí
    }
    public static GestorReserva getInstance() {
        if (instance == null) {
            instance = new GestorReserva();
        }
        return instance;
    }

    public boolean crearReserva(Juego juego, Horario horario) {
        if(existirReservasDuplicadas(juego, horario)){
            return false;
        }
        //TODO: verificación de multas.
        Reserva aux = new Reserva(reservasDeEstudiantes.size(), juego, horario);
        reservasDeEstudiantes.add(aux);
        return true;
    }

    private boolean existirReservasDuplicadas(Juego juego, Horario horario) {
        for(int i = 0; i < reservasDeEstudiantes.size(); i++){
            if(reservasDeEstudiantes.get(i).getJuego().equals(juego) && reservasDeEstudiantes.get(i).getHorario().equals(horario)){
                return true;
            }
        }
        return false;
    }

    public boolean iniciarSesion(String correo, String contrasena) {
        return gestorEstudiante.iniciarSesion(correo, contrasena);
    }

    public boolean enviarCodigo(Estudiante estudianteAux) {
        return gestorEstudiante.enviarCodigo(estudianteAux);
    }

    public boolean buscarEstudiante(String usuario) {
        return gestorEstudiante.buscarEstudiante(usuario);
    }

    public boolean verificarCodigo(String codigo) {
        return gestorEstudiante.verificarCodigo(codigo);
    }

    public void preservarPosibleEstudiante(Estudiante estudianteAux) {
        gestorEstudiante.preservarPosibleEstudiante(estudianteAux);
    }

    public void guardarPosibleEstudiante() {
        gestorEstudiante.guardarPosibleEstudiante();
    }

    public void agregarJuegos(Juego juego) {
        juegos.add(juego);
    }

    public void agregarReserva(Reserva reserva) {
        this.reservasDeEstudiantes.add(reserva);
    }
}
