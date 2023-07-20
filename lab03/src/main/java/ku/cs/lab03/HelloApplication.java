package ku.cs.lab03;

import javafx.application.Application;

import javafx.stage.Stage;
import ku.cs.services.FXRouter;
import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "Hello World");
        configRoute();
        FXRouter.goTo("student-list");
    }

    public static void configRoute()
    {
        String viewPath = "ku/cs/view/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
        FXRouter.when("student-list", viewPath + "student-list.fxml");
    }
    public static void main(String[] args) {

        launch();
    }
}