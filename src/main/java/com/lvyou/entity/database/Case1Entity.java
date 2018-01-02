package com.lvyou.entity.database;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "Case1", schema = "dachuang", catalog = "")
public class Case1Entity {
    private int caseid;
    private String hCname;
    private String cause;
    private String value;
    private String date;
    private String type;
    private String act;
    private String accroding;
    private String punishreason;
    private Collection<HeadCompanyEntity> headCompanyByHCname;

    @Id
    @Column(name = "Caseid", nullable = false)
    public int getCaseid() {
        return caseid;
    }

    public void setCaseid(int caseid) {
        this.caseid = caseid;
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
    @Column(name = "cause", nullable = false, length = 1000)
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Basic
    @Column(name = "value", nullable = false, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "date", nullable = false, length = 255)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "act", nullable = false, length = 500)
    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    @Basic
    @Column(name = "accroding", nullable = false, length = 500)
    public String getAccroding() {
        return accroding;
    }

    public void setAccroding(String accroding) {
        this.accroding = accroding;
    }

    @Basic
    @Column(name = "punishreason", nullable = true, length = 1000)
    public String getPunishreason() {
        return punishreason;
    }

    public void setPunishreason(String punishreason) {
        this.punishreason = punishreason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Case1Entity that = (Case1Entity) o;

        if (caseid != that.caseid) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;
        if (cause != null ? !cause.equals(that.cause) : that.cause != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (act != null ? !act.equals(that.act) : that.act != null) return false;
        if (accroding != null ? !accroding.equals(that.accroding) : that.accroding != null) return false;
        if (punishreason != null ? !punishreason.equals(that.punishreason) : that.punishreason != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = caseid;
        result = 31 * result + (hCname != null ? hCname.hashCode() : 0);
        result = 31 * result + (cause != null ? cause.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (act != null ? act.hashCode() : 0);
        result = 31 * result + (accroding != null ? accroding.hashCode() : 0);
        result = 31 * result + (punishreason != null ? punishreason.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "case1ByHCname")
    public Collection<HeadCompanyEntity> getHeadCompanyByHCname() {
        return headCompanyByHCname;
    }

    public void setHeadCompanyByHCname(Collection<HeadCompanyEntity> headCompanyByHCname) {
        this.headCompanyByHCname = headCompanyByHCname;
    }
}
