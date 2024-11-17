package presentacion.controllers;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class HorarioJuegosController {

    @FXML
    private Button reservaBillarButton;

    @FXML
    private Button reservaPingPongButton;

    @FXML
    private CheckBox checkBoxHora1;
    @FXML
    private CheckBox checkBoxHora2;
    // Añadir aquí todas las CheckBox correspondientes a los horarios...

    @FXML
    public void initialize() {
        reservaBillarButton.setOnAction(event -> procesarReserva("Billar"));
        reservaPingPongButton.setOnAction(event -> procesarReserva("Ping Pong"));
    }

    private void procesarReserva(String juego) {
        // Ejemplo de lógica de reserva para el juego seleccionado.
        StringBuilder horasSeleccionadas = new StringBuilder("Horas reservadas para " + juego + ":\n");

        // Verifica cada checkbox; aquí solo se muestran dos, pero puedes agregar todas las necesarias.
        if (checkBoxHora1.isSelected()) horasSeleccionadas.append("09:00am a 10:00am\n");
        if (checkBoxHora2.isSelected()) horasSeleccionadas.append("10:00am a 11:00am\n");

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Confirmación de Reserva");
        alert.setHeaderText(null);
        alert.setContentText(horasSeleccionadas.toString());
        alert.showAndWait();
    }
}
