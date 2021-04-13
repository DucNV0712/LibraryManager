package model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DataAccessObject <S> {
    ArrayList<S> getList();

    boolean create(S ds) throws SQLException;

    boolean update(S ds);

    boolean delete(S ds);
}

