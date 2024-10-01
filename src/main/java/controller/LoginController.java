package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button Connexion;

    @FXML
    protected void Inscription (ActionEvent event) throws IOException {
        SceneController sc = new SceneController();
        sc.changeScene("/appli/todolistjx/inscription.fxml", event);
    }
    @FXML
    protected void Connexion() {
        System.out.println("Connexion");
    }
    @FXML
    protected void Mdp() {

        System.out.println("Mot de passe oublie");

    }


}