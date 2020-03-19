package manager;

import com.google.gson.Gson;
import model.Sensor;
import model.TemperatureSensor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonParser {

    public static void parse(String message) {
        JSONParser parser = new JSONParser();

        try {

//            Object obj = parser.parse(new FileReader(
//                    "SmartGreenHouse//test.json"));

            Object obj = parser.parse(message);

            JSONObject jsonObject = (JSONObject) obj;

            String mystring = jsonObject.toString();

            Gson gson = new Gson();

            Sensor sensor = gson.fromJson(mystring, TemperatureSensor.class);

            Puller puller = new Puller();

            puller.insert(sensor.getId(), sensor.getSensorType(), ((TemperatureSensor) sensor).getTemperatureValue());

            System.out.print(sensor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
