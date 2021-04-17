package model;

import javafx.collections.ObservableList;
import model.entity.qlSach;

import java.sql.SQLException;


public interface DataAccessObject <S> {
    ObservableList<S>getList();

    boolean create(S s) throws SQLException;

    boolean create(qlSach qls) throws SQLException;

    boolean update(S s);

    boolean delete(S s);

}

