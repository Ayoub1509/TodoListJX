package accueil;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {
    private static Stage mainStage;

    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/appli/todolistjx/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 440);
        mainStage.setTitle("BONJOUR ! :)");
        mainStage.setScene(scene);
        mainStage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}