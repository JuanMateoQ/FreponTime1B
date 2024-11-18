package presentacion.controllers;

import Logic.GestorReserva;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SeleccionarJuegoController {
    @FXML
    public Button cerrarSesionButton;
    @FXML
    public Button billarButton;
    @FXML
    public Button pingPongButton;

    GestorReserva gestorReserva = GestorReserva.getInstance();
    @FXML
    public void cerrarSesion(ActionEvent event) {
        System.out.println(gestorReserva.buscarEstudiante(true));
        gestorReserva.buscarEstudiante(true).setEnLinea(false);
        NavegacionInterfaces.cambiarVentana((Stage) cerrarSesionButton.getScene().getWindow(), "/presentacion/views/login.fxml", "Login...");
        System.out.println(gestorReserva.buscarEstudiante(true));
    }
    @FXML
    public void seleccionarBillar(ActionEvent event) { //0 --> Billar, 1--> PingPong
        //TODO: LOGICA
        NavegacionInterfaces.cambiarVentana((Stage) billarButton.getScene().getWindow(), "/presentacion/views/HorarioJuegos.fxml", "Horario Juego");
    }
    @FXML
    public void seleccionarPingPong(ActionEvent event) {
        //TODO: LOGICA
        NavegacionInterfaces.cambiarVentana((Stage) pingPongButton.getScene().getWindow(), "/presentacion/views/HorarioJuegos.fxml", "Horario Juego");
    }
}
