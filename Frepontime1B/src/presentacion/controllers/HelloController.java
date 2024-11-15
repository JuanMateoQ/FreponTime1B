package presentacion.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
  /*  @FXML
    private Label welcomeText1;*/

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hola");
    }
   // @FXML
   // protected void onLoginButtonClick() {welcomeText1.setText("Sapo"); }
}