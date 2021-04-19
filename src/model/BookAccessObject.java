package model;

import database.Connecter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.entity.qlSach;


import javax.swing.*;
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
            System.out.println("\"Kết Nối Thất Bại\"");
        }
        return ds;
    }



    @Override
    public boolean create(qlSach qls) throws SQLException {
        try {
            Connecter cn = Connecter.getInstance();
            String sql = "insert into  qlsach(maS,tenS,tacGia,theLoai,soLuong)"+" value('"+qls.getIdB()+"','"+qls.getNameB()+"','"+qls.getAuthor()+"','"+qls.getCategory()+"',"+qls.getAmountB()+")";
            cn.getStatement().executeUpdate(sql);
            return false;
        }catch (Exception e){
            System.out.println("Loi");
            return true;
        }
    }

    @Override
        public boolean update(qlSach qls) {
        //chỉnh sửa thông tin sách
        try{
            Connecter c = Connecter.getInstance();
            String txt_sql = "update qlsach set  tenS= '"+qls.getNameB()+"',tacGia ='"+qls.getAuthor()+"' ,theLoai ='"+qls.getCategory()+"',soLuong = "+qls.getAmountB()+" where maS = '"+qls.getIdB()+"'";
            c.statement.execute(txt_sql);
            return false;
        } catch ( SQLException e) {
            return true;
        }

    }

    @Override
    public boolean delete(qlSach qls) {
        try {
            Connecter c = Connecter.getInstance();
            String sql = "DELETE FROM `qlsach` WHERE maS ='"+qls.getIdB()+"'";
            c.getStatement().executeUpdate(sql);
            return false;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Lỗi");
            return true;
        }

    }


}
