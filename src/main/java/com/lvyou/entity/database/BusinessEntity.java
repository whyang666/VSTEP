package com.lvyou.entity.database;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "business", schema = "dachuang", catalog = "")
public class BusinessEntity {
    private int tag;
    private String business;
    private Collection<CompanybusEntity> companybusesByTag;
    private Collection<CompanybusEntity> companybusesByTag_0;

    @Id
    @Column(name = "tag", nullable = false)
    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "business", nullable = false, length = 255)
    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessEntity that = (BusinessEntity) o;

        if (tag != that.tag) return false;
        if (business != null ? !business.equals(that.business) : that.business != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tag;
        result = 31 * result + (business != null ? business.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "businessByTag")
    public Collection<CompanybusEntity> getCompanybusesByTag() {
        return companybusesByTag;
    }

    public void setCompanybusesByTag(Collection<CompanybusEntity> companybusesByTag) {
        this.companybusesByTag = companybusesByTag;
    }

    @OneToMany(mappedBy = "businessByTag_0")
    public Collection<CompanybusEntity> getCompanybusesByTag_0() {
        return companybusesByTag_0;
    }

    public void setCompanybusesByTag_0(Collection<CompanybusEntity> companybusesByTag_0) {
        this.companybusesByTag_0 = companybusesByTag_0;
    }
}
