package model;

import database.Connecter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.entity.qlSach;


import java.sql.ResultSet;
import java.sql.SQLException;

public class BookAccessObject implements DataAccessObject<qlSach> {


    @Override
    public ObservableList getList() {
        ObservableList<qlSach> ds = FXCollections.observableArrayList();
        try {
            Connecter cn = Connecter.getInstance();
            String sql = "select * from qlsach";
            ResultSet rs = cn.getStatement().executeQuery(sql);

            while (rs.next()) {
                Integer sttB = rs.getInt("stt");
                String idB = rs.getString("maS");
                String nameB = rs.getString("tenS");
                String author = rs.getString("tacGia");
                String category = rs.getString("theLoai");
                Integer amount = rs.getInt("soLuong");
                qlSach qls = new qlSach(sttB,idB, nameB, author, category, amount);
                ds.add(qls);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("hello");
        }
        return ds;
    }



    @Override
    public boolean create(qlSach qls) throws SQLException {
        try {
            Connecter cn = Connecter.getInstance();
            String sql = "insert into qlsach(maS,tenS,tacGia,theLoai,soLuong)" +"value('"+qls.getIdB()+"','"+qls.getNameB()+"','"+qls.getAuthor()+"','"+qls.getCategory()+"',"+qls.getAmountB()+")";
            cn.getStatement().executeUpdate(sql);
            return false;
        }catch (Exception e){
            return true;
        }
    }

    @Override
    public boolean update(qlSach qlSach) {
        return false;
    }

    @Override
    public boolean delete(qlSach qlSach) {
        return false;
    }


}
