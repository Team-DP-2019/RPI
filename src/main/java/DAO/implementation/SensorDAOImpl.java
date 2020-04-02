package DAO.implementation;

import DAO.SensorDAO;
import connectionProperty.ConnectionManager;
import entity.SensorEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SensorDAOImpl implements SensorDAO {

    private static final String CREATE = "INSERT sensor (Uid, sensor_type_id) VALUES (?, ?)";
    private static final String FIND_ALL = "SELECT * FROM sensor";

    @Override
    public ResultSet findAll() throws SQLException {
        ResultSet resultSet = ConnectionManager
                .getConnection()
                .prepareStatement(FIND_ALL)
                .executeQuery();
        return resultSet;
    }

    @Override
    public SensorEntity findById(Integer integer) throws SQLException {
        return null;
    }

    @Override
    public int create(SensorEntity entity) throws SQLException {
        Connection conn = ConnectionManager.getConnection();
        try (PreparedStatement ps = conn.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getUid());
            ps.setInt(2, entity.getSensorType());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(SensorEntity entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Integer integer) throws SQLException {
        return 0;
    }
}
