package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class controllerArbolBinario implements Initializable {



        this.ContarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LabelLbl.setText("");
                LabelLbl.setText("Tamaño:");
                TextoLb.setText(arbolBinario.getTamaño());
});

            }
    }
}
