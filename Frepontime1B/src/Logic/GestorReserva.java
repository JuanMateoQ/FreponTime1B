package Logic;

import java.util.ArrayList;

public class GestorReserva {
    private ArrayList<Reserva> reservasDeEstudiantes;
    private ArrayList<Juego> juegos;
    private GestorEstudiante gestorEstudiante;

    private static GestorReserva instance;

    private GestorReserva(){
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

    public ArrayList<Juego> getJuegosDisponibles() {
        ArrayList<Juego> auxJuegos = new ArrayList();
        for(int i = 0; i < reservasDeEstudiantes.size(); i++){
            if(juegos.get(i).getEstado()){
                auxJuegos.add(juegos.get(i));
            }
        }
        return auxJuegos;
    }
}
