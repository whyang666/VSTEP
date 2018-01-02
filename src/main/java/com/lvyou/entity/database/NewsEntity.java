package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by win7 on 2017/4/10.
 */
@Entity
@Table(name = "News", schema = "dachuang", catalog = "")
public class NewsEntity {
    private int newsId;
    private String address;
    private String fact;
    private String date;

    @Id
    @Column(name = "NewsId", nullable = false)
    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    @Basic
    @Column(name = "Address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Fact", nullable = true, length = 255)
    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    @Basic
    @Column(name = "Date", nullable = true, length = 255)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewsEntity that = (NewsEntity) o;

        if (newsId != that.newsId) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (fact != null ? !fact.equals(that.fact) : that.fact != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newsId;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (fact != null ? fact.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
