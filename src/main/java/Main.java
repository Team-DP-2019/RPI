import DAO.implementation.SensorDAOImpl;
import enums.SensorType;
import manager.Puller;
import model.Sensor;

import java.sql.SQLException;
import java.sql.Timestamp;

public class Main {

    public static void main(String[] args) throws SQLException {
        Integer id = 1; // обовязково має починатися з 1
        SensorType type = SensorType.Temperature;
        double value = 12.9;

        Puller puller = new Puller();
        puller.insert(id, type, value);

    }
}
