package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class EncuestaController {

    @FXML
    private RadioButton rbP1A;
    @FXML
    private RadioButton rbP2B;
    @FXML
    private RadioButton rbP3B;
    @FXML
    private RadioButton rbP4B;

    @FXML
    private Label lblPuntaje;
    @FXML
    private Label lblCorrectas;
    @FXML
    private Label lblIncorrectas;

    @FXML
    public void calcularResultado() {

        int correctas = 0;

        if (rbP1A.isSelected()) {
            correctas++;
        }

        if (rbP2B.isSelected()) {
            correctas++;
        }

        if (rbP3B.isSelected()) {
            correctas++;
        }

        if (rbP4B.isSelected()) {
            correctas++;
        }

        int incorrectas = 4 - correctas;
        int puntaje = correctas * 5;

        lblPuntaje.setText("Puntaje: " + puntaje);
        lblCorrectas.setText("Correctas: " + correctas);
        lblIncorrectas.setText("Incorrectas: " + incorrectas);
    }
}
