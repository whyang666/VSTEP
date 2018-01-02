package com.lvyou.entity.database;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "software", schema = "dachuang", catalog = "")
public class SoftwareEntity {
    private String sid;
    private String industryType;
    private String stype;
    private String sname;
    private String sbriefName;
    private String version;
    private String logDate;
    private String hCname;
    private Collection<HeadCompanyEntity> headCompanyByHCname;

    @Id
    @Column(name = "Sid", nullable = false, length = 255)
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "industryType", nullable = false, length = 255)
    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    @Basic
    @Column(name = "Stype", nullable = false, length = 255)
    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    @Basic
    @Column(name = "Sname", nullable = true, length = 255)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "SbriefName", nullable = false, length = 255)
    public String getSbriefName() {
        return sbriefName;
    }

    public void setSbriefName(String sbriefName) {
        this.sbriefName = sbriefName;
    }

    @Basic
    @Column(name = "version", nullable = false, length = 255)
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "logDate", nullable = false, length = 255)
    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    @Basic
    @Column(name = "HCname", nullable = false, length = 255)
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

        SoftwareEntity that = (SoftwareEntity) o;

        if (sid != null ? !sid.equals(that.sid) : that.sid != null) return false;
        if (industryType != null ? !industryType.equals(that.industryType) : that.industryType != null) return false;
        if (stype != null ? !stype.equals(that.stype) : that.stype != null) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (sbriefName != null ? !sbriefName.equals(that.sbriefName) : that.sbriefName != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (logDate != null ? !logDate.equals(that.logDate) : that.logDate != null) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid != null ? sid.hashCode() : 0;
        result = 31 * result + (industryType != null ? industryType.hashCode() : 0);
        result = 31 * result + (stype != null ? stype.hashCode() : 0);
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sbriefName != null ? sbriefName.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (logDate != null ? logDate.hashCode() : 0);
        result = 31 * result + (hCname != null ? hCname.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "softwareByHCname")
    public Collection<HeadCompanyEntity> getHeadCompanyByHCname() {
        return headCompanyByHCname;
    }

    public void setHeadCompanyByHCname(Collection<HeadCompanyEntity> headCompanyByHCname) {
        this.headCompanyByHCname = headCompanyByHCname;
    }
}
