package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by win7 on 2017/3/22.
 */
@Entity
@Table(name = "host", schema = "dachuang", catalog = "")
public class HostEntity {
    private int id;
    private String hCname;
    private String year;
    private String siteType;
    private String siteName;
    private String host;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "HCname", nullable = true, length = 255)
    public String gethCname() {
        return hCname;
    }

    public void sethCname(String hCname) {
        this.hCname = hCname;
    }

    @Basic
    @Column(name = "year", nullable = true, length = 255)
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    @Column(name = "siteType", nullable = true, length = 255)
    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    @Basic
    @Column(name = "siteName", nullable = true, length = 255)
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @Basic
    @Column(name = "host", nullable = true, length = 255)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HostEntity that = (HostEntity) o;

        if (id != that.id) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (siteType != null ? !siteType.equals(that.siteType) : that.siteType != null) return false;
        if (siteName != null ? !siteName.equals(that.siteName) : that.siteName != null) return false;
        if (host != null ? !host.equals(that.host) : that.host != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (hCname != null ? hCname.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (siteType != null ? siteType.hashCode() : 0);
        result = 31 * result + (siteName != null ? siteName.hashCode() : 0);
        result = 31 * result + (host != null ? host.hashCode() : 0);
        return result;
    }
}
