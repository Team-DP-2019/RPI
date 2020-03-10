package model;

import enums.SensorType;
import model.annotation.Column;
import model.annotation.PrimaryKey;
import model.annotation.Table;


@Table(name = "sensor")
public class Sensor {

    @PrimaryKey
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private SensorType sensorType;

    public Sensor(int id, SensorType sensorType) {
        this.id = id;
        this.sensorType = sensorType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }


    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", sensorType=" + sensorType +
                '}';
    }
}
