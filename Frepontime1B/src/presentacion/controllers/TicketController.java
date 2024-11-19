package presentacion.controllers;

import Logic.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class TicketController {

    @FXML
    private Button continuarButton;

    @FXML
    private TableView<Estudiante> tablaEstudiante;
    @FXML
    private TableView<Ticket> tablaTicket;

    @FXML
    private TableColumn columnaNombre;
    @FXML
    private TableColumn columnApellido;
    @FXML
    private TableColumn columnaUsuario;

    @FXML
    private TableColumn columnaCodigo;
    @FXML
    private TableColumn columnaFecha;
    @FXML
    private TableColumn columnaHora;

    @FXML
    private ImageView imageView;

    private ObservableList<Ticket> ticket;
    private ObservableList<Estudiante> estudiante;
    GestorReserva gestorReserva = GestorReserva.getInstance();
    @FXML
    public void initialize() {
        if(gestorReserva.buscarEstudiante(true).getNumerosDeReservas().isEmpty()){
            NavegacionInterfaces.mostrarAlerta("ERROR", "El estudiante no tiene tickets disponibles.");
            return;
        }
        int indiceAux = gestorReserva.buscarEstudiante(true).getNumerosDeReservas().getLast();
        if(gestorReserva.getReservasDeEstudiantes().get(indiceAux).getEstadoDeReserva()){
            NavegacionInterfaces.mostrarAlerta("ERROR", "El estudiante no ha cancelado su reserva.");
            return;
        }

        ticket = FXCollections.observableArrayList();
        this.columnaCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.columnaFecha.setCellValueFactory(new PropertyValueFactory<>("fechaReserva"));
        this.columnaHora.setCellValueFactory(new PropertyValueFactory<>("horaReserva"));

        this.ticket.add(gestorReserva.getReservasDeEstudiantes().get(indiceAux).getPago().getTicket());
        this.tablaTicket.setItems(this.ticket);

        estudiante = FXCollections.observableArrayList();
        this.columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.columnaUsuario.setCellValueFactory(new PropertyValueFactory<>("usuario"));

        this.estudiante.add(gestorReserva.buscarEstudiante(true));
        this.tablaEstudiante.setItems(this.estudiante);

        imageView.setImage(new Image(getClass().getResource(gestorReserva.getReservasDeEstudiantes().get(indiceAux).getJuego().getUbicacion()).toExternalForm()));
    }
    @FXML
    public void continuar (ActionEvent event) {

        //NavegacionInterfaces.mostrarAlerta("Pago Valido", "Su pago ha sido validado.");
        NavegacionInterfaces.cambiarVentana((Stage) continuarButton.getScene().getWindow(),
                "/presentacion/views/SeleccionarJuego.fxml", "Seleccionar Juego");
    }

}


