package entity;

import entity.annotation.Column;
import entity.annotation.PrimaryKey;
import entity.annotation.Table;


@Table(name = "sensor")
public class SensorEntity {

    @PrimaryKey
    @Column(name = "id")
    private int id;

    @Column(name = "Uid")
    private int Uid;

    @Column(name = "type")
    private int sensorType;

    @Column(name = "data")
    private double data;

    public SensorEntity(int uid, int sensorType) {
        Uid = uid;
        this.sensorType = sensorType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public int getSensorType() {
        return sensorType;
    }

    public void setSensorType(int sensorType) {
        this.sensorType = sensorType;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", Uid=" + Uid +
                ", sensorType=" + sensorType +
                '}';
    }
}
