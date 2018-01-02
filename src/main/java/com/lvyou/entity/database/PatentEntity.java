package com.lvyou.entity.database;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "patent", schema = "dachuang", catalog = "")
public class PatentEntity {
    private int pid;
    private String logDate;
    private String patentNo;
    private String pname;
    private String mainNo;
    private String typeNo;
    private String hCname;
    private Collection<HeadCompanyEntity> headCompanyByHCname;

    @Id
    @Column(name = "Pid", nullable = false)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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
    @Column(name = "PatentNo", nullable = true, length = 255)
    public String getPatentNo() {
        return patentNo;
    }

    public void setPatentNo(String patentNo) {
        this.patentNo = patentNo;
    }

    @Basic
    @Column(name = "Pname", nullable = false, length = 255)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "MainNo", nullable = false, length = 255)
    public String getMainNo() {
        return mainNo;
    }

    public void setMainNo(String mainNo) {
        this.mainNo = mainNo;
    }

    @Basic
    @Column(name = "TypeNo", nullable = false, length = 255)
    public String getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(String typeNo) {
        this.typeNo = typeNo;
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

        PatentEntity that = (PatentEntity) o;

        if (pid != that.pid) return false;
        if (logDate != null ? !logDate.equals(that.logDate) : that.logDate != null) return false;
        if (patentNo != null ? !patentNo.equals(that.patentNo) : that.patentNo != null) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;
        if (mainNo != null ? !mainNo.equals(that.mainNo) : that.mainNo != null) return false;
        if (typeNo != null ? !typeNo.equals(that.typeNo) : that.typeNo != null) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + (logDate != null ? logDate.hashCode() : 0);
        result = 31 * result + (patentNo != null ? patentNo.hashCode() : 0);
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (mainNo != null ? mainNo.hashCode() : 0);
        result = 31 * result + (typeNo != null ? typeNo.hashCode() : 0);
        result = 31 * result + (hCname != null ? hCname.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "patentByHCname")
    public Collection<HeadCompanyEntity> getHeadCompanyByHCname() {
        return headCompanyByHCname;
    }

    public void setHeadCompanyByHCname(Collection<HeadCompanyEntity> headCompanyByHCname) {
        this.headCompanyByHCname = headCompanyByHCname;
    }
}
