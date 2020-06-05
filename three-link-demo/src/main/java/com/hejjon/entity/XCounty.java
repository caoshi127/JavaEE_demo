package com.hejjon.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_county", schema = "place", catalog = "")
public class XCounty {
    private String id;
    private String countyName;
    private String cId;


    public XCounty() {
    }


    public XCounty(String id, String countyName, String cId) {
        this.id = id;
        this.countyName = countyName;
        this.cId = cId;
    }

    @Id
    @Column(name = "id", nullable = false, length = 64)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "county_name", nullable = false, length = 32)
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    @Basic
    @Column(name = "c_id", nullable = false, length = 32)
    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XCounty xCounty = (XCounty) o;
        return Objects.equals(id, xCounty.id) &&
                Objects.equals(countyName, xCounty.countyName) &&
                Objects.equals(cId, xCounty.cId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countyName, cId);
    }

    @Override
    public String toString() {
        return "XCounty{" +
                "id='" + id + '\'' +
                ", countyName='" + countyName + '\'' +
                ", cId='" + cId + '\'' +
                '}';
    }
}
