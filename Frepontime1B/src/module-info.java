module presentacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires mail;


    exports presentacion to javafx.graphics;
    exports presentacion.controllers to javafx.fxml;
}
