package models;

import enums.Region;
import enums.SensorType;

public class HumiditySensor extends Sensor {

    private int humidityValue;

    public HumiditySensor(int id, int time, int count, SensorType sensorType, String name, Region region, int humidityValue) {
        super(id, time, count, sensorType, name, region);
        this.humidityValue = humidityValue;
    }

    public int getHumidityValue() {
        return humidityValue;
    }

    public void setHumidityValue(int humidityValue) {
        this.humidityValue = humidityValue;
    }

    @Override
    public String toString() {
        return "HumiditySensor{" +
                "humidityValue=" + humidityValue +
                '}';
    }
}
