package model;

import javafx.collections.ObservableList;

import java.sql.SQLException;

public class CustomerBorrowBooksAccessObject implements DataAccessObject {

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
