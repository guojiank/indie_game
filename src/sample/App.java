package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Model model = new Model();
        View view = new View();

        new AnimationTimer() {

            @Override
            public void handle(long now) {
                model.update();
                view.update();
            }
        }.start();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
