package entity;

import entity.annotation.Column;
import entity.annotation.PrimaryKey;
import entity.annotation.Table;

@Table(name = "data")
public class DataEntity {

    @PrimaryKey
    @Column(name = "id")
    private int id;

    @Column(name = "Uid")
    private int Uid;

    @Column(name = "data")
    private double value;

    public DataEntity(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public DataEntity(int id, int uid, double value) {
        this.id = id;
        Uid = uid;
        this.value = value;
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DataEntity{" +
                "id=" + id +
                ", Uid=" + Uid +
                ", value=" + value +
                '}';
    }
}
