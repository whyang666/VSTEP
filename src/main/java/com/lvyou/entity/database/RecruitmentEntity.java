package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by win7 on 2017/3/22.
 */
@Entity
@Table(name = "recruitment", schema = "dachuang", catalog = "")
public class RecruitmentEntity {
    private int id;
    private String post;
    private String fzlGzjy;
    private String fzlZdxl;
    private String fzlGljy;
    private String fzlGzxz;
    private String total;
    private String salary;
    private String entityName;
    private String date;
    private String qylx;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "post", nullable = true, length = 255)
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Basic
    @Column(name = "FZL_GZJY", nullable = true, length = 255)
    public String getFzlGzjy() {
        return fzlGzjy;
    }

    public void setFzlGzjy(String fzlGzjy) {
        this.fzlGzjy = fzlGzjy;
    }

    @Basic
    @Column(name = "FZL_ZDXL", nullable = true, length = 255)
    public String getFzlZdxl() {
        return fzlZdxl;
    }

    public void setFzlZdxl(String fzlZdxl) {
        this.fzlZdxl = fzlZdxl;
    }

    @Basic
    @Column(name = "FZL_GLJY", nullable = true, length = 255)
    public String getFzlGljy() {
        return fzlGljy;
    }

    public void setFzlGljy(String fzlGljy) {
        this.fzlGljy = fzlGljy;
    }

    @Basic
    @Column(name = "FZL_GZXZ", nullable = true, length = 255)
    public String getFzlGzxz() {
        return fzlGzxz;
    }

    public void setFzlGzxz(String fzlGzxz) {
        this.fzlGzxz = fzlGzxz;
    }

    @Basic
    @Column(name = "total", nullable = true, length = 255)
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Basic
    @Column(name = "salary", nullable = true, length = 255)
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "entityName", nullable = true, length = 255)
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
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
    @Column(name = "QYLX", nullable = true, length = 255)
    public String getQylx() {
        return qylx;
    }

    public void setQylx(String qylx) {
        this.qylx = qylx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecruitmentEntity that = (RecruitmentEntity) o;

        if (id != that.id) return false;
        if (post != null ? !post.equals(that.post) : that.post != null) return false;
        if (fzlGzjy != null ? !fzlGzjy.equals(that.fzlGzjy) : that.fzlGzjy != null) return false;
        if (fzlZdxl != null ? !fzlZdxl.equals(that.fzlZdxl) : that.fzlZdxl != null) return false;
        if (fzlGljy != null ? !fzlGljy.equals(that.fzlGljy) : that.fzlGljy != null) return false;
        if (fzlGzxz != null ? !fzlGzxz.equals(that.fzlGzxz) : that.fzlGzxz != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (entityName != null ? !entityName.equals(that.entityName) : that.entityName != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (qylx != null ? !qylx.equals(that.qylx) : that.qylx != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (post != null ? post.hashCode() : 0);
        result = 31 * result + (fzlGzjy != null ? fzlGzjy.hashCode() : 0);
        result = 31 * result + (fzlZdxl != null ? fzlZdxl.hashCode() : 0);
        result = 31 * result + (fzlGljy != null ? fzlGljy.hashCode() : 0);
        result = 31 * result + (fzlGzxz != null ? fzlGzxz.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (qylx != null ? qylx.hashCode() : 0);
        return result;
    }
}
