package com.lvyou.entity.database;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "User1", schema = "dachuang", catalog = "")
public class User1Entity {
    private int uid;
    private String uname;
    private String upassword;
    private String unickname;
    private String uemail;
    private String uphone;
    private Collection<BranchCompanyCollectionEntity> branchCompanyCollectionsByUid;
    private Collection<BranchCompanyCommentEntity> branchCompanyCommentsByUid;
    private Collection<HeadCompanyCollectionEntity> headCompanyCollectionsByUid;
    private Collection<HeadCompanyCommentEntity> headCompanyCommentsByUid;

    @Id
    @Column(name = "UID", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "Uname", nullable = false, length = 255)
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "Upassword", nullable = false, length = 255)
    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Basic
    @Column(name = "Unickname", nullable = true, length = 200)
    public String getUnickname() {
        return unickname;
    }

    public void setUnickname(String unickname) {
        this.unickname = unickname;
    }

    @Basic
    @Column(name = "Uemail", nullable = true, length = 200)
    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    @Basic
    @Column(name = "Uphone", nullable = true, length = 200)
    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User1Entity that = (User1Entity) o;

        if (uid != that.uid) return false;
        if (uname != null ? !uname.equals(that.uname) : that.uname != null) return false;
        if (upassword != null ? !upassword.equals(that.upassword) : that.upassword != null) return false;
        if (unickname != null ? !unickname.equals(that.unickname) : that.unickname != null) return false;
        if (uemail != null ? !uemail.equals(that.uemail) : that.uemail != null) return false;
        if (uphone != null ? !uphone.equals(that.uphone) : that.uphone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (upassword != null ? upassword.hashCode() : 0);
        result = 31 * result + (unickname != null ? unickname.hashCode() : 0);
        result = 31 * result + (uemail != null ? uemail.hashCode() : 0);
        result = 31 * result + (uphone != null ? uphone.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "user1ByUid")
    public Collection<BranchCompanyCollectionEntity> getBranchCompanyCollectionsByUid() {
        return branchCompanyCollectionsByUid;
    }

    public void setBranchCompanyCollectionsByUid(Collection<BranchCompanyCollectionEntity> branchCompanyCollectionsByUid) {
        this.branchCompanyCollectionsByUid = branchCompanyCollectionsByUid;
    }

    @OneToMany(mappedBy = "user1ByUid")
    public Collection<BranchCompanyCommentEntity> getBranchCompanyCommentsByUid() {
        return branchCompanyCommentsByUid;
    }

    public void setBranchCompanyCommentsByUid(Collection<BranchCompanyCommentEntity> branchCompanyCommentsByUid) {
        this.branchCompanyCommentsByUid = branchCompanyCommentsByUid;
    }

    @OneToMany(mappedBy = "user1ByUid")
    public Collection<HeadCompanyCollectionEntity> getHeadCompanyCollectionsByUid() {
        return headCompanyCollectionsByUid;
    }

    public void setHeadCompanyCollectionsByUid(Collection<HeadCompanyCollectionEntity> headCompanyCollectionsByUid) {
        this.headCompanyCollectionsByUid = headCompanyCollectionsByUid;
    }

    @OneToMany(mappedBy = "user1ByUid")
    public Collection<HeadCompanyCommentEntity> getHeadCompanyCommentsByUid() {
        return headCompanyCommentsByUid;
    }

    public void setHeadCompanyCommentsByUid(Collection<HeadCompanyCommentEntity> headCompanyCommentsByUid) {
        this.headCompanyCommentsByUid = headCompanyCommentsByUid;
    }
}
