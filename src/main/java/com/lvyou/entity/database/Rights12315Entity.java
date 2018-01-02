package com.lvyou.entity.database;

import javax.persistence.*;

/**
 * Created by win7 on 2017/3/22.
 */
@Entity
@Table(name = "Rights12315", schema = "dachuang", catalog = "")
public class Rights12315Entity {
    private int id;
    private String serviceType;
    private String basicProblem;
    private String mainProblem;
    private String simpleDiscription;
    private String entityName;
    private String entityType;
    private String infoType;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "serviceType", nullable = true, length = 255)
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Basic
    @Column(name = "basicProblem", nullable = true, length = 255)
    public String getBasicProblem() {
        return basicProblem;
    }

    public void setBasicProblem(String basicProblem) {
        this.basicProblem = basicProblem;
    }

    @Basic
    @Column(name = "mainProblem", nullable = true, length = 1000)
    public String getMainProblem() {
        return mainProblem;
    }

    public void setMainProblem(String mainProblem) {
        this.mainProblem = mainProblem;
    }

    @Basic
    @Column(name = "simpleDiscription", nullable = true, length = 255)
    public String getSimpleDiscription() {
        return simpleDiscription;
    }

    public void setSimpleDiscription(String simpleDiscription) {
        this.simpleDiscription = simpleDiscription;
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
    @Column(name = "entityType", nullable = true, length = 255)
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @Basic
    @Column(name = "infoType", nullable = true, length = 255)
    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rights12315Entity that = (Rights12315Entity) o;

        if (id != that.id) return false;
        if (serviceType != null ? !serviceType.equals(that.serviceType) : that.serviceType != null) return false;
        if (basicProblem != null ? !basicProblem.equals(that.basicProblem) : that.basicProblem != null) return false;
        if (mainProblem != null ? !mainProblem.equals(that.mainProblem) : that.mainProblem != null) return false;
        if (simpleDiscription != null ? !simpleDiscription.equals(that.simpleDiscription) : that.simpleDiscription != null)
            return false;
        if (entityName != null ? !entityName.equals(that.entityName) : that.entityName != null) return false;
        if (entityType != null ? !entityType.equals(that.entityType) : that.entityType != null) return false;
        if (infoType != null ? !infoType.equals(that.infoType) : that.infoType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (serviceType != null ? serviceType.hashCode() : 0);
        result = 31 * result + (basicProblem != null ? basicProblem.hashCode() : 0);
        result = 31 * result + (mainProblem != null ? mainProblem.hashCode() : 0);
        result = 31 * result + (simpleDiscription != null ? simpleDiscription.hashCode() : 0);
        result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
        result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
        result = 31 * result + (infoType != null ? infoType.hashCode() : 0);
        return result;
    }
}
