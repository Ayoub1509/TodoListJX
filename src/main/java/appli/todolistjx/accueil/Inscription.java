package appli.todolistjx.accueil;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Inscription extends Application {

    @FXML
    private Button inscription;

    @FXML
    private Button retour;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    @FXML
    void OnActionInscription(ActionEvent event) {
        System.out.println("Bienvenue ! ");
    }

    @FXML
    void OnActionRetour(ActionEvent event) {
        StartApplication.changeScene("accueil/login-view", "Connexion");
    }

}
