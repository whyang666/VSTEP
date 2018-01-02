//package com.lvyou.action;
//
//
//import com.lvyou.entity.SearchInfo;
//import com.lvyou.service.SearchService;
//import com.lvyou.service.SearchServiceImp;
//import com.opensymphony.xwork2.ActionSupport;
//
//import java.util.List;
//
///**
// * Created by win7 on 2017/3/11.
// */
//public class Action extends ActionSupport{
//    private String companyname;
//    private List<SearchInfo> result;
//
//    public List<SearchInfo> getResult() {
//        return result;
//    }
//
//    public void setResult(List<SearchInfo> result) {
//        this.result = result;
//    }
//
//    public String getCompanyname() {
//        return companyname;
//    }
//
//    public void setCompanyname(String companyname) {
//        this.companyname = companyname;
//    }
//
//    public String search(){
////        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
////        SearchService s = (SearchService)context.getBean("searchService");
////        InformationService informationService = new InformationService();
////        informationService.findDetail(companyname);
//
//        SearchService s = new SearchServiceImp();
//        result = s.searchHead(companyname);
//        return "success";
//    }
//
//}
