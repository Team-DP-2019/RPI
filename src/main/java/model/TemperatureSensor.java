package model;

import enums.SensorType;
import model.annotation.Column;
import model.annotation.Table;

@Table(name = "data")
public class TemperatureSensor extends Sensor {

    @Column(name = "data")
    public int temperatureValue;

    public TemperatureSensor(int id, SensorType sensorType, int temperatureValue) {
        super(id, sensorType);
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