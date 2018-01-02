package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "companybus", schema = "dachuang", catalog = "")
public class CompanybusEntity {
    private int relationNo;
    private int tag;
    private int bCid;
    private BusinessEntity businessByTag;
    private BusinessEntity businessByTag_0;
    private BranchComanyEntity branchComanyByBCid;

    @Id
    @Column(name = "relationNO", nullable = false)
    public int getRelationNo() {
        return relationNo;
    }

    public void setRelationNo(int relationNo) {
        this.relationNo = relationNo;
    }

    @Basic
    @Column(name = "tag", nullable = false)
    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "BCid", nullable = false)
    public int getbCid() {
        return bCid;
    }

    public void setbCid(int bCid) {
        this.bCid = bCid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanybusEntity that = (CompanybusEntity) o;

        if (relationNo != that.relationNo) return false;
        if (tag != that.tag) return false;
        if (bCid != that.bCid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = relationNo;
        result = 31 * result + tag;
        result = 31 * result + bCid;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "tag", referencedColumnName = "tag", nullable = false)
    public BusinessEntity getBusinessByTag() {
        return businessByTag;
    }

    public void setBusinessByTag(BusinessEntity businessByTag) {
        this.businessByTag = businessByTag;
    }

    @ManyToOne
    @JoinColumn(name = "tag", referencedColumnName = "tag", nullable = false)
    public BusinessEntity getBusinessByTag_0() {
        return businessByTag_0;
    }

    public void setBusinessByTag_0(BusinessEntity businessByTag_0) {
        this.businessByTag_0 = businessByTag_0;
    }

    @ManyToOne
    @JoinColumn(name = "BCid", referencedColumnName = "BCid", nullable = false)
    public BranchComanyEntity getBranchComanyByBCid() {
        return branchComanyByBCid;
    }

    public void setBranchComanyByBCid(BranchComanyEntity branchComanyByBCid) {
        this.branchComanyByBCid = branchComanyByBCid;
    }
}
