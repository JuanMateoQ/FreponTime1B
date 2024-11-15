package presentacion.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML
    private TextField correoElectronico;

    @FXML
    private PasswordField contrasenia;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;
/*
    // Método para manejar el evento de inicio de sesión
    @FXML
    private void handleLogin(ActionEvent event) {
        String email = correoElectronico.getText();
        String password = contrasenia.getText();

        if (email.isEmpty() || password.isEmpty()) {
            showAlert("Error", "Por favor, complete todos los campos.");
            return;
        }

        // Aquí iría la lógica de autenticación, por ejemplo:
        if (authenticate(email, password)) {
            showAlert("Éxito", "Inicio de sesión exitoso.");
            // Redirige al usuario a la siguiente vista de la aplicación
        } else {
            showAlert("Error", "Correo electrónico o contraseña incorrectos.");
        }
    }

    // Método para manejar el evento de registro
    @FXML
    private void handleRegister(ActionEvent event) {
        // Redirige al formulario de registro o ejecuta la lógica correspondiente
        showAlert("Registro", "Función de registro no implementada.");
    }

    // Método de autenticación simple (aquí debes conectar con tu lógica de autenticación real)
    private boolean authenticate(String email, String password) {
        // Ejemplo simple de autenticación
        return email.equals("usuario@ejemplo.com") && password.equals("contraseña123");
    }

    // Método para mostrar alertas
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }*/
}
