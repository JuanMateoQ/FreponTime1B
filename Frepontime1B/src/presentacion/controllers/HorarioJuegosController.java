package presentacion.controllers;

import Logic.Juego;
import Logic.GestorReserva;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class HorarioJuegosController {
    public static Juego juegoAux;

    @FXML
    private Button regresarButton;

    @FXML
    private Button reservarButton;

    @FXML
    private CheckBox seleccionar910Button;

    @FXML
    private CheckBox seleccionar1011Button;

    @FXML
    private CheckBox seleccionar1112Button;

    @FXML
    private CheckBox seleccionar1213Button;

    @FXML
    private CheckBox seleccionar1314Button;

    @FXML
    private CheckBox seleccionar1415Button;

    @FXML
    private CheckBox seleccionar1516Button;

    @FXML
    private CheckBox seleccionar1617Button;

    @FXML
    private CheckBox seleccionar1718Button;



    @FXML
    private void regresarSeleccionarJuego(ActionEvent event) {
        //TODO: LOGICA
        NavegacionInterfaces.cambiarVentana((Stage)regresarButton.getScene().getWindow(),"/presentacion/views/SeleccionarJuego.fxml", "Regresar a seleccionar juego");
    }

    @FXML
    private void reservarJuego(ActionEvent event) {
        //TODO: LOGICA
        NavegacionInterfaces.cambiarVentana((Stage)reservarButton.getScene().getWindow(),"/presentacion/views/VerificaciónDeCodigo.fxml", "Reservar juego");
    }

    @FXML
    private void seleccionar910(ActionEvent event) {
        //TODO: LOGICA
        /*miCheckBox.setOnAction(event -> {
    if (miCheckBox.isSelected()) {
        System.out.println("El CheckBox está seleccionado");
    } else {
        System.out.println("El CheckBox no está seleccionado");
    }
});*/
    }

    @FXML
    private void seleccionar1011(ActionEvent event) {
        //TODO: LOGICA
    }

    @FXML
    private void seleccionar1112(ActionEvent event) {
        //TODO: LOGICA
    }

    @FXML
    private void seleccionar1213(ActionEvent event) {
        //TODO: LOGICA
    }

    @FXML
    private void seleccionar1314(ActionEvent event) {
        //TODO: LOGICA
    }

    @FXML
    private void seleccionar1415(ActionEvent event) {
        //TODO: LOGICA
    }

    @FXML
    private void seleccionar1516(ActionEvent event) {
        //TODO: LOGICA
    }

    @FXML
    private void seleccionar1617(ActionEvent event) {
        //TODO: LOGICA
    }

    @FXML
    private void seleccionar1718(ActionEvent event) {
        //TODO: LOGICA
    }
}
