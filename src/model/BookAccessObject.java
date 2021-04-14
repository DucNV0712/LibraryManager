package model;

import database.Connecter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.entity.qlSach;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookAccessObject implements DataAccessObject {


    @Override
    public ObservableList getList() {
        ObservableList<qlSach> ds = FXCollections.observableArrayList();
        try {
            Connecter cn = Connecter.getInstance();
            String sql = "select * from bookmanager";
            ResultSet rs = cn.getStatement().executeQuery(sql);

            while (rs.next()) {
                String idB = rs.getString("idB");
                String nameB = rs.getString("nameB");
                String author = rs.getString("authorB");
                String category = rs.getString("category");
                Integer amount = rs.getInt("amountB");
                qlSach qls = new qlSach(idB, nameB, author, category, amount);
                ds.add(qls);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("ERROR");
        }
        return ds;
    }


    @Override
    public boolean create(Object o) {


        return false;
    }

    @Override
    public boolean update(Object o) {
        return false;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }
}
