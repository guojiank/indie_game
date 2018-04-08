package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Model model = new Model();
        View view = new View();
        MouseController controller = new MouseController(model);

        new AnimationTimer() {

            @Override
            public void handle(long now) {
                model.update();
                view.update();
            }
        }.start();

        view.getScene().addEventHandler(MouseEvent.MOUSE_PRESSED,controller);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
