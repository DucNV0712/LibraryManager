package home;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.entity.qlSach;
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



    //Quân
    // Quản Lý Sách
    public void btDeleteBook(){
        //xóa sách viết vô đây


    }
    public void btAddBook(){

    }


    //Quản Lý Khách Hàng Mượn Sách
    //khai tao các ô nghập ở đây

    public void themKhachMuon(){

    }

    public void suaKhachMuon(){

    }
    public void xoaKhachMuon(){

    }





    //Quản Lý Khách Hàng Trả Sách

    //khai tao các ô nghập ở đây

    public void themKhachTra(){

    }

    public void suaKhachTra(){

    }
    public void xoaKhachTra(){

    }

    //Thống Kê

    public void restart(){
        //khai tao các ô xuất ở đây



    }



    public void close(){
        System.exit(0);

    }
}

