package model;

import database.Connecter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.entity.qlMuonSach;
import model.entity.qlSach;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerBorrowBooksAccessObject implements DataAccessObject<qlMuonSach> {

    @Override
    public ObservableList getList() {

        ObservableList<qlMuonSach> ds = FXCollections.observableArrayList();
        try {
            Connecter cn = Connecter.getInstance();
            String sql = "select * from qlmuonsach";
            ResultSet rs = cn.getStatement().executeQuery(sql);

            while (rs.next()) {
                Integer sttMS = rs.getInt("stt");
                String maKH = rs.getString("maKh");
                String tenKHN  = rs.getString("tenKh");
                Integer sdt = rs.getInt("sdtKh");
                String diachi = rs.getString("diaChi");
                String idb = rs.getString("maS");
                String nameB = rs.getString("tenS");
                Integer amount = rs.getInt("soLuong");
                Date date = rs.getDate("ngayMuon");
                qlMuonSach qls = new qlMuonSach(sttMS,maKH,tenKHN,sdt,diachi,idb,nameB,amount,date);
                ds.add(qls);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Lỗi Nhá");
        }
        return ds;
    }

    @Override
    public boolean create(qlMuonSach qlMuonSach) throws SQLException {
        return false;
    }

    @Override
    public boolean create(qlSach qls) throws SQLException {
        return false;
    }


    @Override
    public boolean update(qlMuonSach qlMuonSach) {
        return false;
    }

    @Override
    public boolean delete(qlMuonSach qlMuonSach) {
        return false;
    }

}
