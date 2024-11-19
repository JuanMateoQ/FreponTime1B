module presentacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires mail;

    opens Logic to javafx.base;
    opens presentacion.controllers to javafx.fxml;
    exports presentacion to javafx.graphics;
    exports presentacion.controllers to javafx.fxml;
}
