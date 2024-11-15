package presentacion.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private TextField correoElectronico;

    @FXML
    private PasswordField contrasenia;

    @FXML
    private Button registerButton;

    @FXML
    private void initialize() {
        // Configuración inicial si es necesario
    }

    @FXML
    private void iniciarSesion(MouseEvent event) {
        String email = correoElectronico.getText();
        String password = contrasenia.getText();

        // Validación de datos de ejemplo
        if (email.isEmpty() || password.isEmpty()) {
            mostrarAlerta("Error", "Por favor, ingresa tu correo electrónico y contraseña.");
        } else if (validarCredenciales(email, password)) {
            mostrarAlerta("Éxito", "Inicio de sesión exitoso.");
            // Aquí puedes cambiar de escena o avanzar en la aplicación
        } else {
            mostrarAlerta("Error", "Credenciales incorrectas. Intenta nuevamente.");
        }
    }

    @FXML
    private void registrarse(MouseEvent event) {
        mostrarAlerta("Registro", "Funcionalidad de registro no implementada.");
        // Aquí podrías redirigir a una pantalla de registro
    }

    private boolean validarCredenciales(String email, String password) {
        // Simulación de validación de credenciales
        return email.equals("usuario@ejemplo.com") && password.equals("contraseña123");
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
