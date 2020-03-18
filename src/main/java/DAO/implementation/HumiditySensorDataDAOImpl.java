package DAO.implementation;

import DAO.HumiditySensorDataDAO;
import connectionProperty.ConnectionManager;
import model.HumiditySensor;

import java.sql.*;
import java.util.List;

public class HumiditySensorDataDAOImpl implements HumiditySensorDataDAO {


    private static final String CREATE = "INSERT data (sensor_id, data, timestamp) VALUES (?, ?, ?)";

    @Override
    public List<HumiditySensor> findAll() throws SQLException {
        return null;
    }

    @Override
    public HumiditySensor findById(Integer integer) throws SQLException {
        return null;
    }

    @Override
    public int create(HumiditySensor entity) throws SQLException {
        Connection conn = ConnectionManager.getConnection();
        try (PreparedStatement ps = conn.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getId());
            ps.setDouble(2, entity.getHumidityValue());
            ps.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(HumiditySensor entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Integer integer) throws SQLException {
        return 0;
    }
}
