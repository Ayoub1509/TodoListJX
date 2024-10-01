package accueil;

import controller.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Inscription  {

    @FXML
    private Button inscription;

    @FXML
    private Button retour;

    @FXML
    void OnActionInscription(ActionEvent event) {
        System.out.println("Bienvenue ! ");
    }

    @FXML
    void OnActionRetour(ActionEvent event) throws IOException {
       SceneController sc = new SceneController();
       sc.changeScene("/appli/todolistjx/login-view.fxml",event);
    }

}

