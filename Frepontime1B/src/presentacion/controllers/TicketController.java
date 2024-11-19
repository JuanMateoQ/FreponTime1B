package presentacion.controllers;

import Logic.Estudiante;
import Logic.Ticket;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class TicketController {

    @FXML
    private Button continuarButton;

    @FXML
    private TableView<Estudiante> tablaEstudiante;
    @FXML
    private TableView<Ticket> tablaTicket;

    @FXML
    private TableColumn columnaNombre;

    @FXML
    private TableColumn columnApellido;

    @FXML
    private TableColumn columnaUsuario;

    @FXML
    private TableColumn columnaCodigo;
    @FXML
    private TableColumn columnaFecha;
    @FXML
    private TableColumn columnaHora;

    @FXML
    private ImageView imagenTicket;

    @FXML
    public void continuar (ActionEvent event) {

        NavegacionInterfaces.mostrarAlerta("Pago Valido", "Su pago ha sido validado.");
        NavegacionInterfaces.cambiarVentana((Stage) continuarButton.getScene().getWindow(),
                "/presentacion/views/SeleccionarJuego.fxml", "Seleccionar Juego");
    }

}


