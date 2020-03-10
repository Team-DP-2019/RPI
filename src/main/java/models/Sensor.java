package models;

import enums.Region;
import enums.SensorType;

public class Sensor {

    private int id;
    private int time;
    private int count;
    private SensorType sensorType;
    private String name;
    private Region region;

    public Sensor(int id, int time, int count, SensorType sensorType, String name, Region region) {
        this.id = id;
        this.time = time;
        this.count = count;
        this.sensorType = sensorType;
        this.name = name;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", time=" + time +
                ", count=" + count +
                ", sensorType=" + sensorType +
                ", name='" + name + '\'' +
                ", region=" + region +
                '}';
    }
}
