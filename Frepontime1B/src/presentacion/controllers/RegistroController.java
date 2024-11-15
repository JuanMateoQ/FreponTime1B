package presentacion.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistroController {
    @FXML
    private TextField nombreCompletoField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField facultadTextField;
    @FXML
    private TextField phoneTextField;

    @FXML
    private Button registerButton;
    @FXML
    private Button regresarButton;

    @FXML
    public void registrar(ActionEvent event){
        String nombreAux = nombreCompletoField.getText();
        String emailAux = emailTextField.getText();
        String facultadAux = facultadTextField.getText();
        String phoneAux = phoneTextField.getText();

    }
    @FXML
    public void regresar(ActionEvent event){
        NavegacionInterfaces.cambiarVentana((Stage)regresarButton.getScene().getWindow(), "/presentacion/views/login.fxml", "Login");
    }

}
