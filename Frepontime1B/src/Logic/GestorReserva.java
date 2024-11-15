package Logic;

import java.util.ArrayList;

public class GestorReserva {

    private ArrayList<Reserva> reservasDeEstudiantes;
    private ArrayList<Juego> juegos;

    public GestorReserva(){
        reservasDeEstudiantes = new ArrayList();
        juegos = new ArrayList();
        //TODO: leer los atributos del txt
        //TODO: va a ser la clase principal, todos los demás gestores se inicializan aquí

    }

    public boolean crearReserva(Juego juego, Horario horario) {
        Reserva aux = new Reserva(reservasDeEstudiantes.size(), juego, horario);
        reservasDeEstudiantes.add(aux);

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
