import DAO.implementation.SensorDAOImpl;
import enums.SensorType;
import manager.Puller;
import model.Sensor;
import mqtt.Publisher;
import mqtt.Subscriber;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.sql.SQLException;
import java.sql.Timestamp;

public class Main {

public static void main(String[] args) throws MqttException, SQLException {

        if (args.length < 1) {
            throw new IllegalArgumentException("Must have either 'publisher' or 'subscriber' as argument");
        }
        switch (args[0]) {
            case "publisher":
                Publisher.main(args);
                break;
            case "subscriber":
                Subscriber.main(args);
                break;
            default:
                throw new IllegalArgumentException("Don't know how to do " + args[0]);
           
        }
        Integer id = 1; // обовязково має починатися з 1
        SensorType type = SensorType.Temperature;
        double value = 12.9;

        Puller puller = new Puller();
        puller.insert(id, type, value);
          
    }
}
