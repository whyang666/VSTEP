package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "HeadCompanyComment", schema = "dachuang", catalog = "")
public class HeadCompanyCommentEntity {
    private int cid;
    private int uid;
    private int hCid;
    private String comments;
    private Integer rate;
    private User1Entity user1ByUid;
    private HeadCompanyEntity headCompanyByHCid;
    private HeadCompanyEntity headCompanyByHCid_0;

    @Id
    @Column(name = "CID", nullable = false)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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
    @Column(name = "comments", nullable = false, length = 255)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "rate", nullable = true)
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeadCompanyCommentEntity that = (HeadCompanyCommentEntity) o;

        if (cid != that.cid) return false;
        if (uid != that.uid) return false;
        if (hCid != that.hCid) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + uid;
        result = 31 * result + hCid;
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
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
