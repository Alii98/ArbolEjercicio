package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Alicia Flores on 28/11/2017.
 */
public class controllerArbolBinario implements Initializable {
    @FXML
    Button PreOrdenBtn, InOrdenBtn, PostOrdenBtn,ContarBtn, NodoMinBtn, NodoMaxBtn, BuscarBtn;
    @FXML
    Label LabelLbl, TextoLb;
    @FXML
    Pane panel;
    @FXML
    TextField buscar;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArbolBinario arbolBinario = new ArbolBinario();

        arbolBinario.valores();
        this.PreOrdenBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LabelLbl.setText("PreOrden: ");
                TextoLb.setText("                     "+arbolBinario.preOrden(arbolBinario.raiz));
                arbolBinario.vaciar();
            }
        });

        this.InOrdenBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LabelLbl.setText("");
                LabelLbl.setText(" InOrden");
                TextoLb.setText("                     "+arbolBinario.inOrden(arbolBinario.raiz));
                arbolBinario.vaciar();
            }
        });
        this.PostOrdenBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LabelLbl.setText("");
                LabelLbl.setText("PostOrden: ");
                TextoLb.setText("                     "+arbolBinario.posOrden(arbolBinario.raiz));
                arbolBinario.vaciar();
            }
        });

    }
}
