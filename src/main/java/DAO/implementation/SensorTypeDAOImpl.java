package DAO.implementation;

import DAO.SensorTypeDAO;
import connectionProperty.ConnectionManager;
import entity.SensorTypeEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SensorTypeDAOImpl implements SensorTypeDAO {

    private static final String FIND_ALL = "SELECT * FROM sensor_type";

    @Override
    public ResultSet findAll() throws SQLException {
        ResultSet resultSet = ConnectionManager
                .getConnection()
                .prepareStatement(FIND_ALL)
                .executeQuery();
        return resultSet;
    }

    @Override
    public SensorTypeEntity findById(Integer integer) throws SQLException {
        return null;
    }

    @Override
    public int create(SensorTypeEntity entity) throws SQLException {
        return 0;
    }

    @Override
    public int update(SensorTypeEntity entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Integer integer) throws SQLException {
        return 0;
    }
}
