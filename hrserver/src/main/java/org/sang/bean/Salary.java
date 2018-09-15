package org.sang.bean;

import java.util.Date;
/** 
* @FileName: Salary.java
* @Description: 用一句话描述这个类的作用
* @author dznei
* @date 2018/9/14 20:43 
*/
public class Salary {

    private Integer id;

    /**
     * åŸºæœ¬å·¥èµ„
     */
    private Long basicSalary;

    /**
     * å¥–é‡‘
     */
    private Long bonus;

    /**
     * å�ˆé¤�è¡¥åŠ©
     */
    private Long lunchSalary;

    /**
     * äº¤é€šè¡¥åŠ©
     */
    private Long trafficSalary;

    /**
     * åº”å�‘å·¥èµ„
     */
    private Long allSalary;

    /**
     * å…»è€�é‡‘åŸºæ•°
     */
    private Long pensionBase;

    /**
     * å…»è€�é‡‘æ¯”çŽ‡
     */
    private Float pensionPer;

    /**
     * å�¯ç”¨æ—¶é—´
     */
    private Date createDate;

    /**
     * åŒ»ç–—åŸºæ•°
     */
    private Integer medicalBase;

    /**
     * åŒ»ç–—ä¿�é™©æ¯”çŽ‡
     */
    private Float medicalPer;

    /**
     * å…¬ç§¯é‡‘åŸºæ•°
     */
    private Long accumulationFundBase;

    /**
     * å…¬ç§¯é‡‘æ¯”çŽ‡
     */
    private Float accumulationFundPer;

    private String name;

    /**
     * æ—¶è–ª
     */
    private Long hourlywage;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Long getBonus() {
        return bonus;
    }

    public void setBonus(Long bonus) {
        this.bonus = bonus;
    }

    public Long getLunchSalary() {
        return lunchSalary;
    }

    public void setLunchSalary(Long lunchSalary) {
        this.lunchSalary = lunchSalary;
    }

    public Long getTrafficSalary() {
        return trafficSalary;
    }

    public void setTrafficSalary(Long trafficSalary) {
        this.trafficSalary = trafficSalary;
    }

    public Long getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(Long allSalary) {
        this.allSalary = allSalary;
    }

    public Long getPensionBase() {
        return pensionBase;
    }

    public void setPensionBase(Long pensionBase) {
        this.pensionBase = pensionBase;
    }

    public Float getPensionPer() {
        return pensionPer;
    }

    public void setPensionPer(Float pensionPer) {
        this.pensionPer = pensionPer;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getMedicalBase() {
        return medicalBase;
    }

    public void setMedicalBase(Integer medicalBase) {
        this.medicalBase = medicalBase;
    }

    public Float getMedicalPer() {
        return medicalPer;
    }

    public void setMedicalPer(Float medicalPer) {
        this.medicalPer = medicalPer;
    }

    public Long getAccumulationFundBase() {
        return accumulationFundBase;
    }

    public void setAccumulationFundBase(Long accumulationFundBase) {
        this.accumulationFundBase = accumulationFundBase;
    }

    public Float getAccumulationFundPer() {
        return accumulationFundPer;
    }

    public void setAccumulationFundPer(Float accumulationFundPer) {
        this.accumulationFundPer = accumulationFundPer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHourlywage() {
        return hourlywage;
    }

    public void setHourlywage(Long hourlywage) {
        this.hourlywage = hourlywage;
    }
}