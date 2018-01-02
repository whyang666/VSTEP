package com.lvyou.entity;

/**
 * Created by Shen-FH on 2017/3/17.
 */
public class SoftwareInfo {
    private String softwareName;//软件名称
    private String registration;//注册日期
    private String softwareType;//软件类型
    private String industryType;//行业类型

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public void setSoftwareType(String softwareType) {
        this.softwareType = softwareType;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }
}
