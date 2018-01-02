package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "Search", schema = "dachuang", catalog = "")
public class SearchEntity {
    private String hCname;
    private String bCname;
    private String legalperson;
    private int bCid;
    private int hCid;
    private String business;

    @Basic
    @Column(name = "HCname", nullable = true, length = 255)
    public String gethCname() {
        return hCname;
    }

    public void sethCname(String hCname) {
        this.hCname = hCname;
    }

    @Basic
    @Column(name = "BCname", nullable = false, length = 255)
    public String getbCname() {
        return bCname;
    }

    public void setbCname(String bCname) {
        this.bCname = bCname;
    }

    @Basic
    @Column(name = "legalperson", nullable = true, length = 255)
    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    @Id
    @Column(name = "BCid", nullable = false)
    public int getbCid() {
        return bCid;
    }

    public void setbCid(int bCid) {
        this.bCid = bCid;
    }

    @Basic
    @Column(name = "HCid", nullable = false)
    public int gethCid() {
        return hCid;
    }

    public void sethCid(int hCid) {
        this.hCid = hCid;
    }

    @Basic
    @Column(name = "business", nullable = false, length = 255)
    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchEntity that = (SearchEntity) o;

        if (bCid != that.bCid) return false;
        if (hCid != that.hCid) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;
        if (bCname != null ? !bCname.equals(that.bCname) : that.bCname != null) return false;
        if (legalperson != null ? !legalperson.equals(that.legalperson) : that.legalperson != null) return false;
        if (business != null ? !business.equals(that.business) : that.business != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hCname != null ? hCname.hashCode() : 0;
        result = 31 * result + (bCname != null ? bCname.hashCode() : 0);
        result = 31 * result + (legalperson != null ? legalperson.hashCode() : 0);
        result = 31 * result + bCid;
        result = 31 * result + hCid;
        result = 31 * result + (business != null ? business.hashCode() : 0);
        return result;
    }
}
