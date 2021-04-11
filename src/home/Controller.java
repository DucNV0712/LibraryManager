package home;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;

import model.entity.qlSach;
import filechay.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    
    
    
    
    
    //bảng sách
    public TableView <qlSach>tbViewBook;
    public TableColumn <qlSach,String> tbIDb;
    public TableColumn<qlSach,String> tbNameb;
    public TableColumn<qlSach,String> tbAuthorb;
    public TableColumn<qlSach,String> tbCategory;
    public TableColumn<qlSach,Integer> tbNumberb;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //các hiện thị danh sách viết vô dây

    }
    public void btDeleteBook(){

    }
    public void btAddBook() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../addbook/nhapsach.fxml"));
        Main.mainStage.setScene(new Scene(root, 800, 650));
        Main.mainStage.show();
        Image image = new Image("./lib/img/Apps-Library-icon.png");
        Main.mainStage.getIcons().add(image);


    }
    //bảng khách hàng mượn sách



   
}

