package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "BranchCompanyComment", schema = "dachuang", catalog = "")
public class BranchCompanyCommentEntity {
    private int bccid;
    private int uid;
    private int bcid;
    private String comments;
    private Integer rate;
    private User1Entity user1ByUid;
    private BranchComanyEntity branchComanyByBcid;

    @Id
    @Column(name = "bccid", nullable = false)
    public int getBccid() {
        return bccid;
    }

    public void setBccid(int bccid) {
        this.bccid = bccid;
    }

    @Basic
    @Column(name = "uid", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "bcid", nullable = false)
    public int getBcid() {
        return bcid;
    }

    public void setBcid(int bcid) {
        this.bcid = bcid;
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

        BranchCompanyCommentEntity that = (BranchCompanyCommentEntity) o;

        if (bccid != that.bccid) return false;
        if (uid != that.uid) return false;
        if (bcid != that.bcid) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bccid;
        result = 31 * result + uid;
        result = 31 * result + bcid;
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "uid", referencedColumnName = "UID", nullable = false)
    public User1Entity getUser1ByUid() {
        return user1ByUid;
    }

    public void setUser1ByUid(User1Entity user1ByUid) {
        this.user1ByUid = user1ByUid;
    }

    @ManyToOne
    @JoinColumn(name = "bcid", referencedColumnName = "BCid", nullable = false)
    public BranchComanyEntity getBranchComanyByBcid() {
        return branchComanyByBcid;
    }

    public void setBranchComanyByBcid(BranchComanyEntity branchComanyByBcid) {
        this.branchComanyByBcid = branchComanyByBcid;
    }
}
