package com.lvyou.service;

import com.lvyou.dao.*;
import com.lvyou.entity.*;
import com.lvyou.entity.database.*;
import com.lvyou.util.ApplicationContextAwareImp;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shen-FH on 2017/3/15.
 */
public class InformationService {
    ApplicationContext context = ApplicationContextAwareImp.getApplicationContext();

    ScoreDao scoreDao = (ScoreDao)context.getBean("scoreDao");
    ProductionDao productionDao = (ProductionDao)context.getBean("productionDao");
    BranchComanyDao branchComanyDao = (BranchComanyDao)context.getBean("branchComanyDao");
    Case1Dao case1Dao = (Case1Dao)context.getBean("case1Dao");
    PatentDao patentDao = (PatentDao)context.getBean("patentDao");
    SoftwareDao softwareDao = (SoftwareDao)context.getBean("softwareDao");
    BrandDao brandDao = (BrandDao)context.getBean("brandDao");
    HostDao hostDao = (HostDao)context.getBean("hostDao");
    Right12315Dao right12315Dao = (Right12315Dao)context.getBean("right12315Dao");
    RecruitmentDao recruitmentDao = (RecruitmentDao)context.getBean("recruitmentDao");

    public CompanyInfo findDetail(String name){
        CompanyInfo companyInfo = new CompanyInfo();

        ScoreEntity scoreEntity = scoreDao.findByName(name);
        if (scoreEntity == null) {
            return companyInfo;
        }

        List<BranchComanyEntity> branchComanyEntities = branchComanyDao.findByName(name);
        companyInfo.setCompanyName(name);
        if (branchComanyEntities.size() == 0) {
            companyInfo.setLegalperson("暂无此信息");
            companyInfo.setEnterprise_type("暂无此信息");
            companyInfo.setDate("暂无此信息");
            companyInfo.setAddnum("暂无此信息");
            companyInfo.setCategory("暂无此信息");
            companyInfo.setState("暂无此信息");
            companyInfo.setAddress("暂无此信息");
        }else{
        companyInfo.setLegalperson(branchComanyEntities.get(0).getLegalperson());
        companyInfo.setEnterprise_type(branchComanyEntities.get(0).getEnterpriseType());
        companyInfo.setDate(branchComanyEntities.get(0).getDate());
        companyInfo.setAddnum(branchComanyEntities.get(0).getAddnum());
        companyInfo.setCategory(branchComanyEntities.get(0).getCategory());
        companyInfo.setState(branchComanyEntities.get(0).getState());
        companyInfo.setAddress(branchComanyEntities.get(0).getAddress());
        }

        //总分
        companyInfo.setTotal(scoreEntity.getTolal());

        //二级分
        companyInfo.getSecondScore().setFSituation(scoreEntity.getfSituation());
        companyInfo.getSecondScore().setInnovate(scoreEntity.getInnovate());
        companyInfo.getSecondScore().setNegative(scoreEntity.getNegative());
        companyInfo.getSecondScore().setPersonnel(scoreEntity.getPersonnel());

        //三级分
        //书籍分及有关信息
        companyInfo.getThirdScore().setBook(scoreEntity.getBook());
        List<BookInfo> bookInfos = new ArrayList<>();
        List<ProductionEntity> productionEntities = productionDao.findByName(name);
        for (int i = 0; i < productionEntities.size(); i++) {
            BookInfo bookInfo = new BookInfo();
            bookInfo.setBookName(productionEntities.get(i).getProName());
            bookInfo.setBookDate(productionEntities.get(i).getLogDate().toString());
            bookInfos.add(bookInfo);
        }
        if (productionEntities.size() == 0) {
            BookInfo bookInfoadd = new BookInfo();
            bookInfoadd.setBookName("暂无此信息");
            bookInfos.add(bookInfoadd);
        }
        companyInfo.getThirdScore().setBookInfo(bookInfos);

        //分支机构分及相关信息
        companyInfo.getThirdScore().setBranch(scoreEntity.getBranch());
        List<String> branchNames = new ArrayList<>();
        branchComanyEntities = branchComanyDao.findByHeadComany(name);
        for (int i = 0; i < branchComanyEntities.size(); i++) {
            branchNames.add(branchComanyEntities.get(i).getbCname());
        }
        if (branchComanyEntities.size() == 0) {
            branchNames.add("暂无此信息");
        }
        companyInfo.getThirdScore().setBranchName(branchNames);

        //注销分支机构分及相关信息
        companyInfo.getThirdScore().setCancellation(scoreEntity.getCancellation());
        branchComanyEntities = branchComanyDao.findCancellation(name);
        List<String> cancellationName = new ArrayList<>();
        for (int i = 0; i < branchComanyEntities.size(); i++) {
            cancellationName.add(branchComanyEntities.get(i).getbCname());
        }
        if (branchComanyEntities.size() == 0) {
            cancellationName.add("暂无此信息");
        }
        companyInfo.getThirdScore().setCancellationName(cancellationName);

        //投诉分及相关信息
        companyInfo.getThirdScore().setComplaint(scoreEntity.getComplaint());
        List<String> complaintInfo = new ArrayList<>();
        List<Rights12315Entity> rights12315Entities = right12315Dao.findByName(name);
        for (int i = 0; i < rights12315Entities.size(); i++) {
            complaintInfo.add(rights12315Entities.get(i).getMainProblem());
        }
        if (rights12315Entities.size() == 0) {
            complaintInfo.add("暂无此信息");
        }
        companyInfo.getThirdScore().setComplaintInfo(complaintInfo);

        //法院分及相关信息
        companyInfo.getThirdScore().setCourt(scoreEntity.getCourt());

        //财务分及相关信息,
        companyInfo.getThirdScore().setFinance(scoreEntity.getFinace());
        List<String> FinanceChange = new ArrayList<>();
        FinanceChange.add("15642");
        FinanceChange.add("16452");
        FinanceChange.add("15425");
        FinanceChange.add("19465");
        FinanceChange.add("17545");
        companyInfo.getThirdScore().setFinanceChange(FinanceChange);

        //涉案分及相关信息
        companyInfo.getThirdScore().setInvolved(scoreEntity.getInvolved());
        List<String> involvedInfos = new ArrayList<>();
        List<Case1Entity> case1Entities = case1Dao.findByName(name);
        for (int i = 0; i < case1Entities.size(); i++) {
            involvedInfos.add(case1Entities.get(i).getCause());
        }
        if (case1Entities.size() == 0) {
            involvedInfos.add("暂无此信息");
        }
        companyInfo.getThirdScore().setInvolvedInfo(involvedInfos);

        //专利分及相关信息
        companyInfo.getThirdScore().setPatent(scoreEntity.getPatent());
        List<PatentInfo> patentInfos = new ArrayList<>();
        List<PatentEntity> patentEntities = patentDao.findByName(name);
        for (int i = 0; i < patentEntities.size(); i++) {
            PatentInfo patentInfo = new PatentInfo();
            patentInfo.setPatentName(patentEntities.get(i).getPname());
            patentInfo.setPatentNo(patentEntities.get(i).getTypeNo());
            patentInfos.add(patentInfo);
        }
        if (patentEntities.size() == 0) {
            PatentInfo patentInfoadd = new PatentInfo();
            patentInfoadd.setPatentName("暂无此信息");
            patentInfos.add(patentInfoadd);
        }
        companyInfo.getThirdScore().setPatentInfo(patentInfos);

        //从业人数分及相关信息
        companyInfo.getThirdScore().setPractitioner(scoreEntity.getPractitioners());
        List<String> PractitionerChange = new ArrayList<>();
        PractitionerChange.add("23");
        PractitionerChange.add("20");
        PractitionerChange.add("27");
        PractitionerChange.add("28");
        PractitionerChange.add("27");
        companyInfo.getThirdScore().setPractitionerChange(PractitionerChange);

        //吊销分支机构分及相关信息
        companyInfo.getThirdScore().setRevoke(scoreEntity.getRevoke());
        branchComanyEntities = branchComanyDao.findRevoke(name);
        List<String> RevokeName = new ArrayList<>();
        for (int i = 0; i < branchComanyEntities.size(); i++) {
            RevokeName.add(branchComanyEntities.get(i).getbCname());
        }
        if (branchComanyEntities.size() == 0) {
            RevokeName.add("暂无此信息");
        }
        companyInfo.getThirdScore().setRevokeName(RevokeName);

        //判决分及相关信息
        companyInfo.getThirdScore().setSentence(scoreEntity.getSentence());

        //软件作品分及相关信息
        companyInfo.getThirdScore().setSoftware(scoreEntity.getSoftware());
        List<SoftwareInfo> softwareInfos = new ArrayList<>();
        List<SoftwareEntity> softwareEntities = softwareDao.findByName(name);
        for (int i = 0; i < softwareEntities.size(); i++) {
            SoftwareInfo softwareInfo = new SoftwareInfo();
            softwareInfo.setIndustryType(softwareEntities.get(i).getIndustryType());
            softwareInfo.setSoftwareName(softwareEntities.get(i).getSname());
            softwareInfo.setRegistration(softwareEntities.get(i).getLogDate());
            softwareInfo.setSoftwareType(softwareEntities.get(i).getStype());
            softwareInfos.add(softwareInfo);
        }
        if (softwareEntities.size() == 0) {
            SoftwareInfo softwareInfoadd = new SoftwareInfo();
            softwareInfoadd.setSoftwareName("暂无此信息");
            softwareInfos.add(softwareInfoadd);
        }
        companyInfo.getThirdScore().setSoftwareInfo(softwareInfos);

        //商标分及相关信息
        companyInfo.getThirdScore().setTrademark(scoreEntity.getTrademark());
        List<TrademarkInfo> trademarkInfos = new ArrayList<>();
        List<BrandEntity> brandEntities = brandDao.findByName(name);
        for (int i = 0; i < brandEntities.size(); i++) {
            TrademarkInfo trademarkInfo = new TrademarkInfo();
            trademarkInfo.setTrademarkName(brandEntities.get(i).getBname());
            trademarkInfo.setTrademarkDate(brandEntities.get(i).getLogDate());
            trademarkInfos.add(trademarkInfo);
        }
        if (brandEntities.size() == 0) {
            TrademarkInfo trademarkInfoadd = new TrademarkInfo();
            trademarkInfoadd.setTrademarkName("暂无此信息");
            trademarkInfos.add(trademarkInfoadd);
        }
        companyInfo.getThirdScore().setTrademarkInfo(trademarkInfos);

        //网站网店分及相关信息
        companyInfo.getThirdScore().setWebsite(scoreEntity.getWebsite());
        List<WebsiteInfo> websiteInfos = new ArrayList<>();
        List<HostEntity> hostEntities = hostDao.findByName(name);
        for (int i = 0; i < hostEntities.size(); i++) {
            WebsiteInfo websiteInfo = new WebsiteInfo();
            websiteInfo.setWebsiteName(hostEntities.get(i).getSiteName());
            websiteInfo.setWebsitrAddress(hostEntities.get(i).getHost());
            websiteInfos.add(websiteInfo);
        }
        if (hostEntities.size() == 0) {
            WebsiteInfo websiteInfoadd = new WebsiteInfo();
            websiteInfoadd.setWebsiteName("暂无此信息");
            websiteInfos.add(websiteInfoadd);
        }
        companyInfo.getThirdScore().setWebsiteInfo(websiteInfos);

        //招聘分及相关信息
        companyInfo.getThirdScore().setRecruit(scoreEntity.getRecruit());
        List<RecruitInfo> recruitInfos = new ArrayList<>();
        List<RecruitmentEntity> recruitmentEntities = recruitmentDao.findByName(name);
        for (int i = 0; i < recruitmentEntities.size(); i++) {
            RecruitInfo recruitInfo = new RecruitInfo();
            String postName = recruitmentEntities.get(i).getPost();
            if (postName.equals("$null$")){
                postName = "暂无此信息";
            }
            recruitInfo.setPostName(postName);
            String postSalary = recruitmentEntities.get(i).getSalary();
            if (postSalary.equals("$null$")){
                postSalary = "暂无此信息";
            }
            recruitInfo.setPostSalary(postSalary);
            String postType = recruitmentEntities.get(i).getFzlGzxz();
            if (postType.equals("XZ_FULLTIME")){
                postType = "全职";
            }
            else if (postType.equals("XZ_FREETIME")){
                postType = "业余时间";
            }
            else if (postType.equals("XZ_PRACTICE")){
                postType = "实习";
            }
            else{
                postType = "暂无此信息";
            }
            recruitInfo.setPostType(postType);
            recruitInfos.add(recruitInfo);
        }
        if (recruitmentEntities.size() == 0) {
            RecruitInfo recruitInfoadd = new RecruitInfo();
            recruitInfoadd.setPostName("暂无此信息");
            recruitInfos.add(recruitInfoadd);
        }
        companyInfo.getThirdScore().setRecruitInfo(recruitInfos);

        return companyInfo;
    }
}
