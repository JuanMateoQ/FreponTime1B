package presentacion.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;

public class TicketController {

    @FXML
    private Button continuarButton;

    @FXML
    private TableView<?> tablaTicket;

    @FXML
    private TableColumn<?, ?> columnaUsuario;

    @FXML
    private TableColumn<?, ?> columnaFecha;

    @FXML
    private TableColumn<?, ?> columnaHora;

    @FXML
    private TableColumn<?, ?> columnaDuracion;

    @FXML
    private ImageView imagenTicket;

    @FXML
    public void initialize() {
        // Configurar la acción del botón "Continuar"
        continuarButton.setOnAction(this::continuar);

        // Configuración adicional de la tabla
        configurarTabla();
    }

    private void continuar(ActionEvent event) {
        // Lógica para la acción del botón "Continuar"
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Continuar");
        alert.setHeaderText(null);
        alert.setContentText("Procesando continuación...");
        alert.showAndWait();

        // Agregar lógica adicional para la siguiente pantalla o acción
    }

    private void configurarTabla() {
        // Aquí puedes configurar la tabla, como agregar datos o personalizar las celdas
    }
}


