package com.lvyou.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shen-FH on 2017/3/15.
 */
public class ThirdScore {
    private String Finance;//财务分
    private List<String> FinanceChange;//财务历年变化
    private String Branch;//分支机构分
    private List<String> BranchName;//分支机构名称
    private String Revoke;//吊销分支机构分
    private List<String> RevokeName;//吊销分支机构名称
    private String Cancellation;//注销分支机构分
    private List<String> CancellationName;//注销分支机构名称
    private String Website;//网站网店分
    private List<WebsiteInfo> websiteInfo;//网站网店信息
    private String Practitioner;//从业人数分
    private List<String> PractitionerChange;//从业人数历年变化
    private String Recruit;//招聘分
    private List<RecruitInfo> recruitInfo;//该公司的招聘信息
    private String Complaint;//投诉分
    private List<String> ComplaintInfo;//投诉相关信息
    private String Involved;//涉案分
    private List<String> InvolvedInfo;//涉案相关信息
    private String Court;//法院分
    private String Sentence;//判决分
    private String Book;//出版作品分
    private List<BookInfo> bookInfo;//出版作品信息
    private String Software;//软件分
    private List<SoftwareInfo> softwareInfo;//所制作软件相关信息
    private String Patent;//专利分
    private List<PatentInfo> patentInfo;//专利相关信息
    private String Trademark;//商标分
    private List<TrademarkInfo> trademarkInfo;//商标相关信息

    public ThirdScore() {
        FinanceChange = new ArrayList<>();
        BranchName = new ArrayList<>();
        RevokeName = new ArrayList<>();
        CancellationName = new ArrayList<>();
        websiteInfo = new ArrayList<>();
        PractitionerChange = new ArrayList<>();
        recruitInfo = new ArrayList<>();
        ComplaintInfo = new ArrayList<>();
        InvolvedInfo = new ArrayList<>();
        bookInfo = new ArrayList<>();
        softwareInfo = new ArrayList<>();
        patentInfo = new ArrayList<>();
        trademarkInfo = new ArrayList<>();
    }

    public String getFinance() {
        return Finance;
    }

    public void setFinance(String finance) {
        Finance = finance;
    }

    public List<String> getFinanceChange() {
        return FinanceChange;
    }

    public void setFinanceChange(List<String> financeChange) {
        FinanceChange = financeChange;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public List<String> getBranchName() {
        return BranchName;
    }

    public void setBranchName(List<String> branchName) {
        BranchName = branchName;
    }

    public String getRevoke() {
        return Revoke;
    }

    public void setRevoke(String revoke) {
        Revoke = revoke;
    }

    public List<String> getRevokeName() {
        return RevokeName;
    }

    public void setRevokeName(List<String> revokeName) {
        RevokeName = revokeName;
    }

    public String getCancellation() {
        return Cancellation;
    }

    public void setCancellation(String cancellation) {
        Cancellation = cancellation;
    }

    public List<String> getCancellationName() {
        return CancellationName;
    }

    public void setCancellationName(List<String> cancellationName) {
        CancellationName = cancellationName;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public List<WebsiteInfo> getWebsiteInfo() {
        return websiteInfo;
    }

    public void setWebsiteInfo(List<WebsiteInfo> websiteInfo) {
        this.websiteInfo = websiteInfo;
    }

    public String getPractitioner() {
        return Practitioner;
    }

    public void setPractitioner(String practitioner) {
        Practitioner = practitioner;
    }

    public List<String> getPractitionerChange() {
        return PractitionerChange;
    }

    public void setPractitionerChange(List<String> practitionerChange) {
        PractitionerChange = practitionerChange;
    }

    public String getRecruit() {
        return Recruit;
    }

    public void setRecruit(String recruit) {
        Recruit = recruit;
    }

    public List<RecruitInfo> getRecruitInfo() {
        return recruitInfo;
    }

    public void setRecruitInfo(List<RecruitInfo> recruitInfo) {
        this.recruitInfo = recruitInfo;
    }

    public String getComplaint() {
        return Complaint;
    }

    public void setComplaint(String complaint) {
        Complaint = complaint;
    }

    public List<String> getComplaintInfo() {
        return ComplaintInfo;
    }

    public void setComplaintInfo(List<String> complaintInfo) {
        ComplaintInfo = complaintInfo;
    }

    public String getInvolved() {
        return Involved;
    }

    public void setInvolved(String involved) {
        Involved = involved;
    }

    public List<String> getInvolvedInfo() {
        return InvolvedInfo;
    }

    public void setInvolvedInfo(List<String> involvedInfo) {
        InvolvedInfo = involvedInfo;
    }

    public String getCourt() {
        return Court;
    }

    public void setCourt(String court) {
        Court = court;
    }

    public String getSentence() {
        return Sentence;
    }

    public void setSentence(String sentence) {
        Sentence = sentence;
    }

    public String getBook() {
        return Book;
    }

    public void setBook(String book) {
        Book = book;
    }

    public List<BookInfo> getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(List<BookInfo> bookInfo) {
        this.bookInfo = bookInfo;
    }

    public String getSoftware() {
        return Software;
    }

    public void setSoftware(String software) {
        Software = software;
    }

    public List<SoftwareInfo> getSoftwareInfo() {
        return softwareInfo;
    }

    public void setSoftwareInfo(List<SoftwareInfo> softwareInfo) {
        this.softwareInfo = softwareInfo;
    }

    public String getPatent() {
        return Patent;
    }

    public void setPatent(String patent) {
        Patent = patent;
    }

    public List<PatentInfo> getPatentInfo() {
        return patentInfo;
    }

    public void setPatentInfo(List<PatentInfo> patentInfo) {
        this.patentInfo = patentInfo;
    }

    public String getTrademark() {
        return Trademark;
    }

    public void setTrademark(String trademark) {
        Trademark = trademark;
    }

    public List<TrademarkInfo> getTrademarkInfo() {
        return trademarkInfo;
    }

    public void setTrademarkInfo(List<TrademarkInfo> trademarkInfo) {
        this.trademarkInfo = trademarkInfo;
    }
}
