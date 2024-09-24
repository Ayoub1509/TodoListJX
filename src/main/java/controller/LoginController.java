package controller;

import appli.todolistjx.accueil.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginController {
    @FXML
    private Button Connexion;

    @FXML
    protected void Inscription(ActionEvent event) {
        StartApplication.changeScene("inscription.fxml","inscription");


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