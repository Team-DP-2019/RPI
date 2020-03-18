package model;

import enums.SensorType;
import model.annotation.Column;
import model.annotation.Table;

@Table(name = "data")
public class HumiditySensor extends Sensor {

    @Column(name = "data")
    private double humidityValue;

    public HumiditySensor(int id, SensorType sensorType, double humidityValue) {
        super(id, sensorType);
        this.humidityValue = humidityValue;
    }

    public double getHumidityValue() {
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
