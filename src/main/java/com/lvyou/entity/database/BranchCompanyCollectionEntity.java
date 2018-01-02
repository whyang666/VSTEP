package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "BranchCompanyCollection", schema = "dachuang", catalog = "")
public class BranchCompanyCollectionEntity {
    private int branchCompanyCollid;
    private int uid;
    private int bCid;
    private Integer star;
    private User1Entity user1ByUid;
    private BranchComanyEntity branchComanyByBCid;

    @Id
    @Column(name = "BranchCompanyCollid", nullable = false)
    public int getBranchCompanyCollid() {
        return branchCompanyCollid;
    }

    public void setBranchCompanyCollid(int branchCompanyCollid) {
        this.branchCompanyCollid = branchCompanyCollid;
    }

    @Basic
    @Column(name = "Uid", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "BCid", nullable = false)
    public int getbCid() {
        return bCid;
    }

    public void setbCid(int bCid) {
        this.bCid = bCid;
    }

    @Basic
    @Column(name = "star", nullable = true)
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BranchCompanyCollectionEntity that = (BranchCompanyCollectionEntity) o;

        if (branchCompanyCollid != that.branchCompanyCollid) return false;
        if (uid != that.uid) return false;
        if (bCid != that.bCid) return false;
        if (star != null ? !star.equals(that.star) : that.star != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = branchCompanyCollid;
        result = 31 * result + uid;
        result = 31 * result + bCid;
        result = 31 * result + (star != null ? star.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Uid", referencedColumnName = "UID", nullable = false)
    public User1Entity getUser1ByUid() {
        return user1ByUid;
    }

    public void setUser1ByUid(User1Entity user1ByUid) {
        this.user1ByUid = user1ByUid;
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
