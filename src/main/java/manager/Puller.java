package manager;

import DAO.HumiditySensorDataDAO;
import DAO.implementation.HumiditySensorDataDAOImpl;
import DAO.implementation.SensorDAOImpl;
import DAO.implementation.TemperatureSensorDataDAOImpl;
import connectionProperty.ConnectionManager;
import enums.SensorType;
import model.HumiditySensor;
import model.Sensor;
import model.TemperatureSensor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Puller {
    private Sensor sensor;
    private SensorDAOImpl sensorDAO = new SensorDAOImpl();
    private HumiditySensor humiditySensor;
    private HumiditySensorDataDAOImpl humiditySensorDataDAO = new HumiditySensorDataDAOImpl();
    private TemperatureSensor temperatureSensor;
    private TemperatureSensorDataDAOImpl temperatureSensorDataDAO = new TemperatureSensorDataDAOImpl();

    public void insert(Integer id, SensorType type, double value) throws SQLException {

        if (id > sensorDAO.getMaxId()) {
            sensor = new Sensor(id, type);
            sensorDAO.create(sensor);
        }
        if (type.equals(SensorType.Humidity)) {
            humiditySensor = new HumiditySensor(id, type, value);
            humiditySensorDataDAO.create(humiditySensor);
        } else if (type.equals(SensorType.Temperature)) {
            temperatureSensor = new TemperatureSensor(id, type, value);
            temperatureSensorDataDAO.create(temperatureSensor);
        }
    }
}
