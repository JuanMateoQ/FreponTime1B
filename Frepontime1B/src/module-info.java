module presentacion {
    requires javafx.controls;
    requires javafx.fxml;

    exports presentacion to javafx.graphics;
    exports presentacion.controllers to javafx.fxml;
}
