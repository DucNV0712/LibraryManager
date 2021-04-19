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
                String date = rs.getString("ngayMuon");
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
    public boolean create(qlMuonSach qlms)  {
        try {
                Connecter cn = Connecter.getInstance();
                String sql = "insert into qlmuonsach(maKh,tenKh,maS, tenS,soLuong,ngayMuon,diaChi,sdtKh) "+ "value('"+qlms.getIdKM()+"','"+qlms.getNameKM()+"','"+qlms.getIdB()+"','"+qlms.getNameB()+"',"+qlms.getSoluongM()+",'"+qlms.getNgayM()+"','"+qlms.getAdressKM()+"',"+qlms.getPhoneKM()+")";
                cn.getStatement().executeUpdate(sql);
            return true;
//            '"+qlms.getIdKM()+"','"+qlms.getNameKM()+"',"+qlms.getPhoneKM()+",'"+qlms.getIdB()+"','"+qlms.getNameB()+"',"+qlms.getSoluongM()+","+qlms.getNgayM()+")"
            }catch (Exception e){
            System.out.println("Khong Nhan");
                 return false;
            }

    }

    @Override
    public boolean create(qlSach qls) throws SQLException {
        return false;
    }

    @Override
    public boolean update(qlMuonSach qlms) {
        try {
            Connecter c = Connecter.getInstance();
            String text_sqlms = "update qlmuonsach set tenS='"+qlms.getNameB()+"',maS='"+qlms.getIdB()+"',maKh='"+qlms.getIdKM()+"',tenKh='"+qlms.getNameKM()+"',soLuong='"+qlms.getSoluongM()+"',ngayMuon='"+qlms.getNgayM()+"',diaChi='"+qlms.getAdressKM()+"',sdtKh='"+qlms.getPhoneKM()+"'";
            c.statement.execute(text_sqlms);
            return false;
        } catch ( SQLException e) {
            System.out.println("loi vcl");
            return true;
        }
    }
    @Override
    public boolean delete(qlMuonSach qlMS) {
        try {
            Connecter c = Connecter.getInstance();
            String sql = "DELETE FROM qlmuonsach WHERE maKh ='"+qlMS.getIdKM()+"'";
            c.getStatement().executeUpdate(sql);
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Lỗi");
          return false;
        }
    }


//            try {
//                Connecter cn = Connecter.getInstance();
//                String sql = "insert into qlmuonsach(maKh,tenKh,maS,tenS,soLuong,ngayMuon,diaChi,sdtKh)" +"value('"+qlms.getIdKM()+"','"+qlms.getNameKM()+"',"+qlms.getPhoneKM()+",'"+qlms.getAdressKM()+"'," + ",'"+qlms.getIdKM()+"','"+qlms.getNameKM()+"',"+qlms.getSoluongM()+","+qlms.getNgayM()+")";
//                cn.getStatement().executeUpdate(sql);
//                return false;
//            }catch (Exception e){
//                return true;
//            }









}
