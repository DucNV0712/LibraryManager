package home;
import database.Connecter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.entity.qlSach;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        tbIDb.setCellValueFactory(new PropertyValueFactory<>("idB"));
        tbNameb.setCellValueFactory(new PropertyValueFactory<>("nameB"));
        tbAuthorb.setCellValueFactory(new PropertyValueFactory<>("author"));
        tbCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        tbNumberb.setCellValueFactory(new PropertyValueFactory<>("amountB"));
        try {
            Connecter cn = Connecter.getInstance();
            String sql ="select * from bookmanager";
            ResultSet rs = cn.getStatement().executeQuery(sql);

            ObservableList<qlSach> listBook = FXCollections.observableArrayList();
            while (rs.next()){
                String idB = rs.getString("idB");
                String nameB = rs.getString("nameB");
                String author = rs.getString("authorB");
                String category  = rs.getString("category");
                Integer amount = rs.getInt("amountB");
                qlSach qls = new qlSach(idB,nameB,author,category,amount);
                listBook.add(qls);
            }
            tbViewBook.setItems(listBook);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Lỗi");
        }


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

