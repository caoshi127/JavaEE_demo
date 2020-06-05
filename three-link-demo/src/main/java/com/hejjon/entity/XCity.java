package com.hejjon.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_city", schema = "place", catalog = "")
public class XCity {
    private String id;
    private String cName;
    private String pId;


    public XCity() {
    }

    public XCity(String id, String cName, String pId) {
        this.id = id;
        this.cName = cName;
        this.pId = pId;
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
    @Column(name = "c_name", nullable = false, length = 32)
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Basic
    @Column(name = "p_id", nullable = false, length = 64)
    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XCity xCity = (XCity) o;
        return Objects.equals(id, xCity.id) &&
                Objects.equals(cName, xCity.cName) &&
                Objects.equals(pId, xCity.pId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cName, pId);
    }

    @Override
    public String toString() {
        return "XCity{" +
                "id='" + id + '\'' +
                ", cName='" + cName + '\'' +
                ", pId='" + pId + '\'' +
                '}';
    }
}
