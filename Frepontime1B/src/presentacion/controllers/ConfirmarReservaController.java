package presentacion.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ConfirmarReservaController {

    @FXML
    private Button confirmarReservaButton;

    @FXML
    private Button cancelarReservaButton;


    @FXML
    private void  confirmarReserva(ActionEvent event) {
        NavegacionInterfaces.cambiarVentana((Stage)confirmarReservaButton.getScene().getWindow(), "/presentacion/views/Pagar.fxml", "Seleccionar Juego");
    }

    @FXML
    private void cancelarReserva(ActionEvent event) {
        NavegacionInterfaces.cambiarVentana((Stage)cancelarReservaButton.getScene().getWindow(),"/presentacion/views/SeleccionarJuego.fxml", "Seleccionar Juego");
        }

}
