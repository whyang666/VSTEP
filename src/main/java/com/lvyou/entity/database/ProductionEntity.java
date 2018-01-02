package com.lvyou.entity.database;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "production", schema = "dachuang", catalog = "")
public class ProductionEntity {
    private int proid;
    private String proName;
    private String hCname;
    private Timestamp logDate;
    private Collection<HeadCompanyEntity> headCompanyByHCname;

    @Id
    @Column(name = "proid", nullable = false)
    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    @Basic
    @Column(name = "proName", nullable = false, length = 255)
    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    @Basic
    @Column(name = "HCname", nullable = false, length = 255)
    public String gethCname() {
        return hCname;
    }

    public void sethCname(String hCname) {
        this.hCname = hCname;
    }

    @Basic
    @Column(name = "logDate", nullable = false)
    public Timestamp getLogDate() {
        return logDate;
    }

    public void setLogDate(Timestamp logDate) {
        this.logDate = logDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductionEntity that = (ProductionEntity) o;

        if (proid != that.proid) return false;
        if (proName != null ? !proName.equals(that.proName) : that.proName != null) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;
        if (logDate != null ? !logDate.equals(that.logDate) : that.logDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = proid;
        result = 31 * result + (proName != null ? proName.hashCode() : 0);
        result = 31 * result + (hCname != null ? hCname.hashCode() : 0);
        result = 31 * result + (logDate != null ? logDate.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "productionByHCname")
    public Collection<HeadCompanyEntity> getHeadCompanyByHCname() {
        return headCompanyByHCname;
    }

    public void setHeadCompanyByHCname(Collection<HeadCompanyEntity> headCompanyByHCname) {
        this.headCompanyByHCname = headCompanyByHCname;
    }
}
