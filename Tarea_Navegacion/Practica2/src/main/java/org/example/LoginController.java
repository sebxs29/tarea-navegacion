package org.example;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContraseña;
    @FXML
    private ComboBox<String> cmbRol;
    @FXML
    private Label lblMensaje;

    public void initialize() {
        cmbRol.getItems().addAll("Administrador", "Cajero");
    }

    @FXML
    public void ingresar() throws Exception{

        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();
        String rol = cmbRol.getValue();
        lblMensaje.setText("");

        if (usuario.isBlank() || contraseña.isBlank() || rol == null) {
            lblMensaje.setText("Complete todos los campos");
            return;
        }

        if (usuario.equals("admin")
                && contraseña.equals("1234")
                && rol.equals("Administrador")) {

            FXMLLoader loader =
                    new FXMLLoader(getClass().getResource("Administrador.fxml"));

            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.show();

            ((Stage) txtUsuario.getScene().getWindow()).close();
        }

        else if (usuario.equals("cajero")
                && contraseña.equals("1234")
                && rol.equals("Cajero")) {

            FXMLLoader loader =
                    new FXMLLoader(getClass().getResource("Cajero.fxml"));

            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.show();

            ((Stage) txtUsuario.getScene().getWindow()).close();
        }

        else {
            lblMensaje.setText("Credenciales incorrectas");
        }

    }

    @FXML
    private void salir() {
        Platform.exit();
    }
}
