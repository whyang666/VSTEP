package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by WHY on 2017/3/11.
 */
@Entity
@Table(name = "Score", schema = "dachuang", catalog = "")
public class ScoreEntity {
    private String hCname;
    private String branch;
    private String revoke;
    private String cancellation;
    private String website;
    private String practitioners;
    private String recruit;
    private String complaint;
    private String involved;
    private String court;
    private String sentence;
    private String book;
    private String software;
    private String patent;
    private String trademark;
    private String fSituation;
    private String personnel;
    private String negative;
    private String innovate;
    private int id;
    private String finace;
    private String tolal;

    @Basic
    @Column(name = "HCname", nullable = false, length = 255)
    public String gethCname() {
        return hCname;
    }

    public void sethCname(String hCname) {
        this.hCname = hCname;
    }

    @Basic
    @Column(name = "Branch", nullable = true, length = 255)
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Basic
    @Column(name = "Revoke", nullable = true, length = 255)
    public String getRevoke() {
        return revoke;
    }

    public void setRevoke(String revoke) {
        this.revoke = revoke;
    }

    @Basic
    @Column(name = "Cancellation", nullable = true, length = 255)
    public String getCancellation() {
        return cancellation;
    }

    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }

    @Basic
    @Column(name = "Website", nullable = true, length = 255)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "Practitioners", nullable = true, length = 255)
    public String getPractitioners() {
        return practitioners;
    }

    public void setPractitioners(String practitioners) {
        this.practitioners = practitioners;
    }

    @Basic
    @Column(name = "Recruit", nullable = true, length = 255)
    public String getRecruit() {
        return recruit;
    }

    public void setRecruit(String recruit) {
        this.recruit = recruit;
    }

    @Basic
    @Column(name = "Complaint", nullable = true, length = 255)
    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    @Basic
    @Column(name = "Involved", nullable = true, length = 255)
    public String getInvolved() {
        return involved;
    }

    public void setInvolved(String involved) {
        this.involved = involved;
    }

    @Basic
    @Column(name = "Court", nullable = true, length = 255)
    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    @Basic
    @Column(name = "Sentence", nullable = true, length = 255)
    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Basic
    @Column(name = "Book", nullable = true, length = 255)
    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Basic
    @Column(name = "Software", nullable = true, length = 255)
    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    @Basic
    @Column(name = "Patent", nullable = true, length = 255)
    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    @Basic
    @Column(name = "Trademark", nullable = true, length = 255)
    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    @Basic
    @Column(name = "FSituation", nullable = true, length = 255)
    public String getfSituation() {
        return fSituation;
    }

    public void setfSituation(String fSituation) {
        this.fSituation = fSituation;
    }

    @Basic
    @Column(name = "Personnel", nullable = true, length = 255)
    public String getPersonnel() {
        return personnel;
    }

    public void setPersonnel(String personnel) {
        this.personnel = personnel;
    }

    @Basic
    @Column(name = "Negative", nullable = true, length = 255)
    public String getNegative() {
        return negative;
    }

    public void setNegative(String negative) {
        this.negative = negative;
    }

    @Basic
    @Column(name = "Innovate", nullable = true, length = 255)
    public String getInnovate() {
        return innovate;
    }

    public void setInnovate(String innovate) {
        this.innovate = innovate;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Finace", nullable = true, length = 255)
    public String getFinace() {
        return finace;
    }

    public void setFinace(String finace) {
        this.finace = finace;
    }

    @Basic
    @Column(name = "Tolal", nullable = true, length = 255)
    public String getTolal() {
        return tolal;
    }

    public void setTolal(String tolal) {
        this.tolal = tolal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScoreEntity that = (ScoreEntity) o;

        if (id != that.id) return false;
        if (hCname != null ? !hCname.equals(that.hCname) : that.hCname != null) return false;
        if (branch != null ? !branch.equals(that.branch) : that.branch != null) return false;
        if (revoke != null ? !revoke.equals(that.revoke) : that.revoke != null) return false;
        if (cancellation != null ? !cancellation.equals(that.cancellation) : that.cancellation != null) return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;
        if (practitioners != null ? !practitioners.equals(that.practitioners) : that.practitioners != null)
            return false;
        if (recruit != null ? !recruit.equals(that.recruit) : that.recruit != null) return false;
        if (complaint != null ? !complaint.equals(that.complaint) : that.complaint != null) return false;
        if (involved != null ? !involved.equals(that.involved) : that.involved != null) return false;
        if (court != null ? !court.equals(that.court) : that.court != null) return false;
        if (sentence != null ? !sentence.equals(that.sentence) : that.sentence != null) return false;
        if (book != null ? !book.equals(that.book) : that.book != null) return false;
        if (software != null ? !software.equals(that.software) : that.software != null) return false;
        if (patent != null ? !patent.equals(that.patent) : that.patent != null) return false;
        if (trademark != null ? !trademark.equals(that.trademark) : that.trademark != null) return false;
        if (fSituation != null ? !fSituation.equals(that.fSituation) : that.fSituation != null) return false;
        if (personnel != null ? !personnel.equals(that.personnel) : that.personnel != null) return false;
        if (negative != null ? !negative.equals(that.negative) : that.negative != null) return false;
        if (innovate != null ? !innovate.equals(that.innovate) : that.innovate != null) return false;
        if (finace != null ? !finace.equals(that.finace) : that.finace != null) return false;
        if (tolal != null ? !tolal.equals(that.tolal) : that.tolal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hCname != null ? hCname.hashCode() : 0;
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (revoke != null ? revoke.hashCode() : 0);
        result = 31 * result + (cancellation != null ? cancellation.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (practitioners != null ? practitioners.hashCode() : 0);
        result = 31 * result + (recruit != null ? recruit.hashCode() : 0);
        result = 31 * result + (complaint != null ? complaint.hashCode() : 0);
        result = 31 * result + (involved != null ? involved.hashCode() : 0);
        result = 31 * result + (court != null ? court.hashCode() : 0);
        result = 31 * result + (sentence != null ? sentence.hashCode() : 0);
        result = 31 * result + (book != null ? book.hashCode() : 0);
        result = 31 * result + (software != null ? software.hashCode() : 0);
        result = 31 * result + (patent != null ? patent.hashCode() : 0);
        result = 31 * result + (trademark != null ? trademark.hashCode() : 0);
        result = 31 * result + (fSituation != null ? fSituation.hashCode() : 0);
        result = 31 * result + (personnel != null ? personnel.hashCode() : 0);
        result = 31 * result + (negative != null ? negative.hashCode() : 0);
        result = 31 * result + (innovate != null ? innovate.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (finace != null ? finace.hashCode() : 0);
        result = 31 * result + (tolal != null ? tolal.hashCode() : 0);
        return result;
    }
}
