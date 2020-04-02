package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface GeneralDAO<T, ID> {
    ResultSet findAll() throws SQLException;

    T findById(ID id) throws SQLException;

    int create(T entity) throws SQLException;

    int update(T entity) throws SQLException;

    int delete(ID id) throws SQLException;
}

