package com.lvyou.entity.database;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "Brand", schema = "dachuang", catalog = "")
public class BrandEntity {
    private int bid;
    private String bname;
    private String logDate;
    private String hCname;
    private Collection<HeadCompanyEntity> headCompanyByHCname;

    @Id
    @Column(name = "Bid", nullable = false)
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "Bname", nullable = true, length = 255)
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Basic
    @Column(name = "LogDate", nullable = true, length = 255)
    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    @Basic
    @Column(name = "HCname", nullable = true, length = 255)
    public String gethCname() {
        return hCname;
    }

    public void sethCname(String hCname) {
        this.hCname = hCname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrandEntity that = (BrandEntity) o;

        if (bid != that.bid) return false;
        if (bname != null ? !bname.equals(that.bname) : that.bname != null) return false;
        if (logDate != null ? !logDate.equals(that.logDate) : that.logDate != null) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bid;
        result = 31 * result + (bname != null ? bname.hashCode() : 0);
        result = 31 * result + (logDate != null ? logDate.hashCode() : 0);
        result = 31 * result + (hCname != null ? hCname.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "brandByHCname")
    public Collection<HeadCompanyEntity> getHeadCompanyByHCname() {
        return headCompanyByHCname;
    }

    public void setHeadCompanyByHCname(Collection<HeadCompanyEntity> headCompanyByHCname) {
        this.headCompanyByHCname = headCompanyByHCname;
    }
}
