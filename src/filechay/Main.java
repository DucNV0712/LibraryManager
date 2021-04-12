package filechay;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {


    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../home/LibraryManager.fxml"));
        primaryStage.setTitle("Library Manager");

        Image image = new Image("./lib/img/Apps-Library-icon.png");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.getIcons().add(image);
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}