package presentacion.controllers;

import Logic.Pago;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class PagarController {

    @FXML
    private Button regresarButton;
    @FXML
    private Button finalizarButton;
    @FXML
    private TextField validarTextField;
    @FXML
    private TableView<Pago> tablaPagos;
    @FXML
    private TableColumn columnaUsuario;
    @FXML
    private TableColumn columnaFecha;
    @FXML
    private TableColumn columnaHora;
    @FXML
    private TableColumn columnaDuracion;


    @FXML
    private void regresarConfirmaReserva(ActionEvent event) {

        NavegacionInterfaces.cambiarVentana((Stage) regresarButton.getScene().getWindow(),
                "/presentacion/views/SeleccionarJuego.fxml", "Seleccionar Juego...");
    }
    @FXML
    private void finalizar(ActionEvent event) {

        NavegacionInterfaces.cambiarVentana((Stage) finalizarButton.getScene().getWindow(),
                "/presentacion/views/Ticket.fxml", "Ticket...");
    }
}



