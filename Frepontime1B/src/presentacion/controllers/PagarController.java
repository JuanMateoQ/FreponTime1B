package presentacion.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.event.ActionEvent;

public class PagarController {

    @FXML
    private Button regresarButton;

    @FXML
    private TableView<?> tablaPagos;

    @FXML
    private TableColumn<?, ?> columnaNombre;

    @FXML
    private TableColumn<?, ?> columnaMonto;

    @FXML
    private TableColumn<?, ?> columnaFecha;

    @FXML
    public void initialize() {
        // Configura la acción del botón "Regresar"
        regresarButton.setOnAction(this::regresarConfirmaReserva);

        // Aquí puedes agregar la lógica de inicialización para la tabla
        configurarTabla();
    }

    private void regresarConfirmaReserva(ActionEvent event) {
        // Lógica para regresar a la pantalla de confirmación de reserva
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Regresar");
        alert.setHeaderText(null);
        alert.setContentText("Volviendo a la pantalla de confirmación de reserva.");
        alert.showAndWait();


    }

    private void configurarTabla() {
        // Configura la tabla con columnas o datos específicos si es necesario
        // Por ejemplo, podrías agregar celdas, listeners, o cargar datos aquí
    }
}



