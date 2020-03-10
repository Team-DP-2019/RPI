package DAO.implementation;

import DAO.TemperatureSensorDataDAO;
import connectionProperty.ConnectionManager;
import model.TemperatureSensor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TemperatureSensorDataDAOImpl implements TemperatureSensorDataDAO {

    private static final String CREATE = "INSERT data (sensor_id, data) VALUES (?, ?)";

    @Override
    public List<TemperatureSensor> findAll() throws SQLException {
        return null;
    }

    @Override
    public TemperatureSensor findById(Integer integer) throws SQLException {
        return null;
    }

    @Override
    public int create(TemperatureSensor entity) throws SQLException {
        Connection conn = ConnectionManager.getConnection();
        try (PreparedStatement ps = conn.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getId());
            ps.setDouble(2, entity.getTemperatureValue());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(TemperatureSensor entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Integer integer) throws SQLException {
        return 0;
    }
}
