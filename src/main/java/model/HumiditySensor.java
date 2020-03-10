package model;

import enums.SensorType;
import model.annotation.Column;
import model.annotation.Table;

@Table(name = "data")
public class HumiditySensor extends Sensor {

    @Column(name = "data")
    private int humidityValue;

    public HumiditySensor(int id, SensorType sensorType, int humidityValue) {
        super(id, sensorType);
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
