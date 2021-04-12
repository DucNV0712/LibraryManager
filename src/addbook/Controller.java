package addbook;

import Main.Main;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
    public void back() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../home/LibraryManager.fxml"));
        Main.mainStage.setScene(new Scene(root, 1000, 700));
        Main.mainStage.show();
        Image image = new Image("./lib/img/Apps-Library-icon.png");
        Main.mainStage.getIcons().add(image);
    }
}
