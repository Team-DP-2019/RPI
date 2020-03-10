package DAO.implementation;

import DAO.SensorDAO;
import connectionProperty.ConnectionManager;
import model.Sensor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SensorDAOImpl implements SensorDAO {

    private static final String CREATE = "INSERT sensor (type) VALUES (?)";

    @Override
    public List<Sensor> findAll() throws SQLException {
        return null;
    }

    @Override
    public Sensor findById(Integer integer) throws SQLException {
        return null;
    }

    @Override
    public int create(Sensor entity) throws SQLException {
        Connection conn = ConnectionManager.getConnection();
        try (PreparedStatement ps = conn.prepareStatement(CREATE)) {
            ps.setString(1, entity.getSensorType().toString());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(Sensor entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Integer integer) throws SQLException {
        return 0;
    }
}
