package entity;

import entity.annotation.Column;
import entity.annotation.PrimaryKey;
import entity.annotation.Table;

@Table(name = "sensor_type")
public class SensorTypeEntity {

    @PrimaryKey
    @Column(name = "id")
    int id;

    @Column(name = "type")
    String type;

    public SensorTypeEntity(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SensorTypeEntity{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
