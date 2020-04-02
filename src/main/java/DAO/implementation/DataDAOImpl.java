package DAO.implementation;

import DAO.DataDAO;
import connectionProperty.ConnectionManager;
import entity.DataEntity;

import java.sql.*;

public class DataDAOImpl implements DataDAO {

    private static final String CREATE = "INSERT data (sensor_id, data, timestamp) VALUES (?, ?, ?)";

    @Override
    public ResultSet findAll() throws SQLException {
        return null;
    }

    @Override
    public DataEntity findById(Integer integer) throws SQLException {
        return null;
    }

    @Override
    public int create(DataEntity entity) throws SQLException {
        Connection conn = ConnectionManager.getConnection();
        try (PreparedStatement ps = conn.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getId());
            ps.setDouble(2, entity.getValue());
            ps.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(DataEntity entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Integer integer) throws SQLException {
        return 0;
    }
}
