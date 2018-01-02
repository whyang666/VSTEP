package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "HeadCompanyCollection", schema = "dachuang", catalog = "")
public class HeadCompanyCollectionEntity {
    private int headCompanyCollid;
    private int uid;
    private int hCid;
    private Integer star;
    private User1Entity user1ByUid;
    private HeadCompanyEntity headCompanyByHCid;
    private HeadCompanyEntity headCompanyByHCid_0;

    @Id
    @Column(name = "HeadCompanyCollid", nullable = false)
    public int getHeadCompanyCollid() {
        return headCompanyCollid;
    }

    public void setHeadCompanyCollid(int headCompanyCollid) {
        this.headCompanyCollid = headCompanyCollid;
    }

    @Basic
    @Column(name = "UID", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "HCid", nullable = false)
    public int gethCid() {
        return hCid;
    }

    public void sethCid(int hCid) {
        this.hCid = hCid;
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

        HeadCompanyCollectionEntity that = (HeadCompanyCollectionEntity) o;

        if (headCompanyCollid != that.headCompanyCollid) return false;
        if (uid != that.uid) return false;
        if (hCid != that.hCid) return false;
        if (star != null ? !star.equals(that.star) : that.star != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = headCompanyCollid;
        result = 31 * result + uid;
        result = 31 * result + hCid;
        result = 31 * result + (star != null ? star.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "UID", referencedColumnName = "UID", nullable = false)
    public User1Entity getUser1ByUid() {
        return user1ByUid;
    }

    public void setUser1ByUid(User1Entity user1ByUid) {
        this.user1ByUid = user1ByUid;
    }

    @ManyToOne
    @JoinColumn(name = "HCid", referencedColumnName = "HCid", nullable = false)
    public HeadCompanyEntity getHeadCompanyByHCid() {
        return headCompanyByHCid;
    }

    public void setHeadCompanyByHCid(HeadCompanyEntity headCompanyByHCid) {
        this.headCompanyByHCid = headCompanyByHCid;
    }

    @ManyToOne
    @JoinColumn(name = "HCid", referencedColumnName = "HCid", nullable = false)
    public HeadCompanyEntity getHeadCompanyByHCid_0() {
        return headCompanyByHCid_0;
    }

    public void setHeadCompanyByHCid_0(HeadCompanyEntity headCompanyByHCid_0) {
        this.headCompanyByHCid_0 = headCompanyByHCid_0;
    }
}
