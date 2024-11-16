package presentacion.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField correoElectronico;

    @FXML
    private PasswordField contrasenia;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    // Método para manejar el evento de inicio de sesión
    @FXML
    private void iniciarSesion(ActionEvent event) {
        NavegacionInterfaces.cambiarVentana((Stage)loginButton.getScene().getWindow(), "/presentacion/views/HorarioJuegos.fxml", "Juegos");
    }

    @FXML
    private void registrar(ActionEvent event) {
        NavegacionInterfaces.cambiarVentana((Stage)registerButton.getScene().getWindow(),"/presentacion/views/registro.fxml", "Registro");
    }

}
