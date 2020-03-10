package models;

import enums.Region;
import enums.SensorType;

public class TemperatureSensor extends Sensor {

    public int temperatureValue;

    public TemperatureSensor(int id, int time, int count, SensorType sensorType, String name, Region region, int temperatureValue) {
        super(id, time, count, sensorType, name, region);
        this.temperatureValue = temperatureValue;
    }

    public int getTemperatureValue() {
        return temperatureValue;
    }

    public void setTemperatureValue(int temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "temperatureValue=" + temperatureValue +
                '}';
    }
}
