package manager;

import DAO.implementation.DataDAOImpl;
import DAO.implementation.SensorDAOImpl;
import DAO.implementation.SensorTypeDAOImpl;
import entity.DataEntity;
import entity.SensorEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Puller {
    private SensorDAOImpl sensorDAO = new SensorDAOImpl();
    private SensorTypeDAOImpl sensorTypeDAO = new SensorTypeDAOImpl();
    private DataDAOImpl dataDAO = new DataDAOImpl();

    public boolean isUidInDB(Integer Uid) throws SQLException {
        ResultSet resultSet = sensorDAO.findAll();
        while (resultSet.next()) {
            if (resultSet.getInt("Uid") == Uid) {
                return true;
            }
        }
        return false;
    }

    public int getIdByUid(Integer Uid) throws SQLException {
        ResultSet resultSet = sensorDAO.findAll();
        while (resultSet.next()) {
            if (resultSet.getInt("Uid") == Uid) {
                return resultSet.getInt("id");
            }
        }
        return 0;
    }

    public boolean isTypeIdInTable(int id) throws SQLException {
        ResultSet resultSet = sensorTypeDAO.findAll();
        while (resultSet.next()) {
            if (resultSet.getInt("id") == id) {
                return true;
            }
        }
        return false;
    }

    public void insert(Integer Uid, Integer typeId, double value) throws Exception {
        if (isTypeIdInTable(typeId)) {
            if (!isUidInDB(Uid)) {
                SensorEntity sensor = new SensorEntity(Uid, typeId);
                sensorDAO.create(sensor);
            }
            DataEntity dataEntity = new DataEntity(getIdByUid(Uid), value);
            dataDAO.create(dataEntity);
        } else {
            throw new Exception("Table Id Does not exist");
        }
    }
}
