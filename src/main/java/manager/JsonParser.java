package manager;

import com.google.gson.Gson;
import entity.DataEntity;
import entity.SensorEntity;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser {

    public static void parse(String message) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(message);

            JSONObject jsonObject = (JSONObject) obj;

//
//            String mystring = jsonObject.toString();
//
//            Gson gson = new Gson();
//
//            SensorEntity sensor = gson.fromJson(mystring, DataEntity.class);

            Puller puller = new Puller();

            puller.insert((Integer) jsonObject.get("id"), (Integer) jsonObject.get("sensorType"), (Double) jsonObject.get("temperatureValue"));

//            puller.insert(sensor.getId(), sensor.getSensorType(), ((TemperatureSensor) sensor).getTemperatureValue());

//            System.out.print(sensor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
