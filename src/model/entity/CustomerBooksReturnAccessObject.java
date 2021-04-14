package model.entity;

import javafx.collections.ObservableList;
import model.DataAccessObject;

import java.sql.SQLException;

public class CustomerBooksReturnAccessObject implements DataAccessObject {

    @Override
    public ObservableList getList() {
        return null;
    }

    @Override
    public boolean create(Object o) throws SQLException {
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
