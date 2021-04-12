package model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DataAccessObject <AL> {
    ArrayList<AL> getList();

    boolean create(AL ds) throws SQLException;

    boolean update(AL ds);

    boolean delete(AL ds);
}

