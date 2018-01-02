package com.lvyou.entity.database;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "HeadCompany", schema = "dachuang", catalog = "")
public class HeadCompanyEntity {
    private int hCid;
    private String hCname;
    private String hCadd;
    private BranchComanyEntity branchComanyByHCname;
    private BrandEntity brandByHCname;
    private Case1Entity case1ByHCname;
    private Collection<HeadCompanyCollectionEntity> headCompanyCollectionsByHCid;
    private Collection<HeadCompanyCollectionEntity> headCompanyCollectionsByHCid_0;
    private Collection<HeadCompanyCommentEntity> headCompanyCommentsByHCid;
    private Collection<HeadCompanyCommentEntity> headCompanyCommentsByHCid_0;
    private PatentEntity patentByHCname;
    private ProductionEntity productionByHCname;
    private SoftwareEntity softwareByHCname;

    @Id
    @Column(name = "HCid", nullable = false)
    public int gethCid() {
        return hCid;
    }

    public void sethCid(int hCid) {
        this.hCid = hCid;
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
    @Column(name = "HCadd", nullable = true, length = 255)
    public String gethCadd() {
        return hCadd;
    }

    public void sethCadd(String hCadd) {
        this.hCadd = hCadd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeadCompanyEntity that = (HeadCompanyEntity) o;

        if (hCid != that.hCid) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;
        if (hCadd != null ? !hCadd.equals(that.hCadd) : that.hCadd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hCid;
        result = 31 * result + (hCname != null ? hCname.hashCode() : 0);
        result = 31 * result + (hCadd != null ? hCadd.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "HCname", referencedColumnName = "HCname")
    public BranchComanyEntity getBranchComanyByHCname() {
        return branchComanyByHCname;
    }

    public void setBranchComanyByHCname(BranchComanyEntity branchComanyByHCname) {
        this.branchComanyByHCname = branchComanyByHCname;
    }

    @ManyToOne
    @JoinColumn(name = "HCname", referencedColumnName = "HCname")
    public BrandEntity getBrandByHCname() {
        return brandByHCname;
    }

    public void setBrandByHCname(BrandEntity brandByHCname) {
        this.brandByHCname = brandByHCname;
    }

    @ManyToOne
    @JoinColumn(name = "HCname", referencedColumnName = "HCname")
    public Case1Entity getCase1ByHCname() {
        return case1ByHCname;
    }

    public void setCase1ByHCname(Case1Entity case1ByHCname) {
        this.case1ByHCname = case1ByHCname;
    }

    @OneToMany(mappedBy = "headCompanyByHCid")
    public Collection<HeadCompanyCollectionEntity> getHeadCompanyCollectionsByHCid() {
        return headCompanyCollectionsByHCid;
    }

    public void setHeadCompanyCollectionsByHCid(Collection<HeadCompanyCollectionEntity> headCompanyCollectionsByHCid) {
        this.headCompanyCollectionsByHCid = headCompanyCollectionsByHCid;
    }

    @OneToMany(mappedBy = "headCompanyByHCid_0")
    public Collection<HeadCompanyCollectionEntity> getHeadCompanyCollectionsByHCid_0() {
        return headCompanyCollectionsByHCid_0;
    }

    public void setHeadCompanyCollectionsByHCid_0(Collection<HeadCompanyCollectionEntity> headCompanyCollectionsByHCid_0) {
        this.headCompanyCollectionsByHCid_0 = headCompanyCollectionsByHCid_0;
    }

    @OneToMany(mappedBy = "headCompanyByHCid")
    public Collection<HeadCompanyCommentEntity> getHeadCompanyCommentsByHCid() {
        return headCompanyCommentsByHCid;
    }

    public void setHeadCompanyCommentsByHCid(Collection<HeadCompanyCommentEntity> headCompanyCommentsByHCid) {
        this.headCompanyCommentsByHCid = headCompanyCommentsByHCid;
    }

    @OneToMany(mappedBy = "headCompanyByHCid_0")
    public Collection<HeadCompanyCommentEntity> getHeadCompanyCommentsByHCid_0() {
        return headCompanyCommentsByHCid_0;
    }

    public void setHeadCompanyCommentsByHCid_0(Collection<HeadCompanyCommentEntity> headCompanyCommentsByHCid_0) {
        this.headCompanyCommentsByHCid_0 = headCompanyCommentsByHCid_0;
    }

    @ManyToOne
    @JoinColumn(name = "HCname", referencedColumnName = "HCname")
    public PatentEntity getPatentByHCname() {
        return patentByHCname;
    }

    public void setPatentByHCname(PatentEntity patentByHCname) {
        this.patentByHCname = patentByHCname;
    }

    @ManyToOne
    @JoinColumn(name = "HCname", referencedColumnName = "HCname")
    public ProductionEntity getProductionByHCname() {
        return productionByHCname;
    }

    public void setProductionByHCname(ProductionEntity productionByHCname) {
        this.productionByHCname = productionByHCname;
    }

    @ManyToOne
    @JoinColumn(name = "HCname", referencedColumnName = "HCname")
    public SoftwareEntity getSoftwareByHCname() {
        return softwareByHCname;
    }

    public void setSoftwareByHCname(SoftwareEntity softwareByHCname) {
        this.softwareByHCname = softwareByHCname;
    }
}
