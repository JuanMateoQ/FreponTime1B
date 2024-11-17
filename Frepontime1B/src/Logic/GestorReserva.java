package Logic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class GestorReserva {
    private ArrayList<Reserva> reservasDeEstudiantes;
    private ArrayList<Juego> juegos;
    private GestorEstudiante gestorEstudiante;

    private static GestorReserva instance;

    GestorReserva(){
        reservasDeEstudiantes = new ArrayList<Reserva>();
        juegos = new ArrayList<Juego>();
        gestorEstudiante = new GestorEstudiante();
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
        Estudiante estudiante = null;
        for(Estudiante estudianteEnLinea: gestorEstudiante.getEstudiantes()){
            if(estudianteEnLinea.isEnLínea()){
                estudiante = estudianteEnLinea;
                Reserva nuevaReserva = new Reserva(reservasDeEstudiantes.size(), juego, horario);
                estudiante.setReserva(nuevaReserva);
                reservasDeEstudiantes.add(nuevaReserva);
                GestorPago.crearPagoDeReserva(nuevaReserva, reservasDeEstudiantes, juego);
                return true;
            }
        }
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

    public ArrayList<Juego> getJuegosDisponibles() {
        ArrayList<Juego> auxJuegos = new ArrayList();
        for(int i = 0; i < reservasDeEstudiantes.size(); i++){
            if(juegos.get(i).getEstado()){
                auxJuegos.add(juegos.get(i));
            }
        }
        return auxJuegos;
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
    public void imprimirEstudianteEnLinea(){
        for(Estudiante estudiante: gestorEstudiante.getEstudiantes()){
            if(estudiante.isEnLínea()){
                System.out.println("\nEstudiante en línea: \n" + estudiante);
            }
        }
    }

}
