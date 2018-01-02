package com.lvyou.entity.database;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "BranchComany", schema = "dachuang", catalog = "")
public class BranchComanyEntity {
    private int bCid;
    private String bCname;
    private String hCname;
    private String legalperson;
    private String enterpriseType;
    private String date;
    private String addnum;
    private String category;
    private String state;
    private String address;
    private Collection<HeadCompanyEntity> headCompanyByHCname;
    private Collection<BranchCompanyCollectionEntity> branchCompanyCollectionsByBCid;
    private Collection<BranchCompanyCommentEntity> branchCompanyCommentsByBCid;
    private Collection<CompanybusEntity> companybusesByBCid;

    @Id
    @Column(name = "BCid", nullable = false)
    public int getbCid() {
        return bCid;
    }

    public void setbCid(int bCid) {
        this.bCid = bCid;
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
    @Column(name = "HCname", nullable = false, length = 255)
    public String gethCname() {
        return hCname;
    }

    public void sethCname(String hCname) {
        this.hCname = hCname;
    }

    @Basic
    @Column(name = "legalperson", nullable = true, length = 255)
    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    @Basic
    @Column(name = "enterprise_type", nullable = true, length = 255)
    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    @Basic
    @Column(name = "date", nullable = true, length = 255)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "addnum", nullable = true, length = 255)
    public String getAddnum() {
        return addnum;
    }

    public void setAddnum(String addnum) {
        this.addnum = addnum;
    }

    @Basic
    @Column(name = "category", nullable = true, length = 2)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 2)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BranchComanyEntity that = (BranchComanyEntity) o;

        if (bCid != that.bCid) return false;
        if (bCname != null ? !bCname.equals(that.bCname) : that.bCname != null) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;
        if (legalperson != null ? !legalperson.equals(that.legalperson) : that.legalperson != null) return false;
        if (enterpriseType != null ? !enterpriseType.equals(that.enterpriseType) : that.enterpriseType != null)
            return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (addnum != null ? !addnum.equals(that.addnum) : that.addnum != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bCid;
        result = 31 * result + (bCname != null ? bCname.hashCode() : 0);
        result = 31 * result + (hCname != null ? hCname.hashCode() : 0);
        result = 31 * result + (legalperson != null ? legalperson.hashCode() : 0);
        result = 31 * result + (enterpriseType != null ? enterpriseType.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (addnum != null ? addnum.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "branchComanyByHCname")
    public Collection<HeadCompanyEntity> getHeadCompanyByHCname() {
        return headCompanyByHCname;
    }

    public void setHeadCompanyByHCname(Collection<HeadCompanyEntity> headCompanyByHCname) {
        this.headCompanyByHCname = headCompanyByHCname;
    }

    @OneToMany(mappedBy = "branchComanyByBCid")
    public Collection<BranchCompanyCollectionEntity> getBranchCompanyCollectionsByBCid() {
        return branchCompanyCollectionsByBCid;
    }

    public void setBranchCompanyCollectionsByBCid(Collection<BranchCompanyCollectionEntity> branchCompanyCollectionsByBCid) {
        this.branchCompanyCollectionsByBCid = branchCompanyCollectionsByBCid;
    }

    @OneToMany(mappedBy = "branchComanyByBcid")
    public Collection<BranchCompanyCommentEntity> getBranchCompanyCommentsByBCid() {
        return branchCompanyCommentsByBCid;
    }

    public void setBranchCompanyCommentsByBCid(Collection<BranchCompanyCommentEntity> branchCompanyCommentsByBCid) {
        this.branchCompanyCommentsByBCid = branchCompanyCommentsByBCid;
    }

    @OneToMany(mappedBy = "branchComanyByBCid")
    public Collection<CompanybusEntity> getCompanybusesByBCid() {
        return companybusesByBCid;
    }

    public void setCompanybusesByBCid(Collection<CompanybusEntity> companybusesByBCid) {
        this.companybusesByBCid = companybusesByBCid;
    }
}
