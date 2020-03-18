package DAO;

import model.Sensor;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface SensorDAO extends GeneralDAO<Sensor, Integer> {
    Integer getMaxId() throws SQLException;
}
