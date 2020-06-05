package com.hejjon.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_province", schema = "place", catalog = "")
public class XProvince {
    private String id;
    private String pName;


    public XProvince() {
    }

    public XProvince(String id, String pName) {
        this.id = id;
        this.pName = pName;
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
    @Column(name = "p_name", nullable = false, length = 32)
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XProvince xProvince = (XProvince) o;
        return Objects.equals(id, xProvince.id) &&
                Objects.equals(pName, xProvince.pName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pName);
    }


    @Override
    public String toString() {
        return "XProvince{" +
                "id='" + id + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }
}
