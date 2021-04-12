package home;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


import model.entity.qlSach;
import Main.Main;



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
    public void close(){
        System.exit(0);

    }


    public void btAddBook() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../addbook/nhapsach.fxml"));
        Main.mainStage.setScene(new Scene(root, 800, 650));
        Main.mainStage.show();


    }
    //bảng khách hàng mượn sách



   
}

