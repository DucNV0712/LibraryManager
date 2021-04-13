package model;

import database.Connecter;
import model.entity.qlSach;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookAccessObject implements DataAccessObject<qlSach>{
    @Override
    public ArrayList<qlSach> getList() {
        ArrayList<qlSach> list =new ArrayList<>();
        try {
            Connecter cn =Connecter.getInstance();

        }

        return null;
    }

    @Override
    public boolean create(qlSach ds) throws SQLException {
        return false;
    }

    @Override
    public boolean update(qlSach ds) {
        return false;
    }

    @Override
    public boolean delete(qlSach ds) {
        return false;
    }
}
