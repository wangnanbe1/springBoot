package com.demo.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "USER_TEST")
public class UserTest {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "DEPTCODE")
    private String deptcode;

    @Column(name = "STATE")
    private BigDecimal state;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "INVALIDDATE")
    private Date invaliddate;

    @Column(name = "EEGDATE")
    private Date eegdate;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "MNEMONICS")
    private String mnemonics;

    @Column(name = "HEALTHTYPE")
    private String healthtype;

    @Column(name = "ISEXPERT")
    private String isexpert;

    @Column(name = "SECGROUP")
    private String secgroup;

    @Column(name = "CERTIFICATE")
    private String certificate;

    @Column(name = "ISDRUGRIGHT")
    private String isdrugright;

    @Column(name = "PNUMBER")
    private BigDecimal pnumber;

    @Column(name = "ENAME")
    private String ename;

    @Column(name = "FNAME")
    private String fname;

    @Column(name = "COMPANY")
    private String company;

    @Column(name = "POSITION")
    private String position;

    @Column(name = "DLEADER")
    private String dleader;

    @Column(name = "CELLPHONE")
    private String cellphone;

    @Column(name = "LANDLINE")
    private String landline;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATEDATE")
    private Date updatedate;

    @Column(name = "PASSWORDDATE")
    private Date passworddate;

    @Column(name = "SYNCFLAG")
    private String syncflag;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return DEPTCODE
     */
    public String getDeptcode() {
        return deptcode;
    }

    /**
     * @param deptcode
     */
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    /**
     * @return STATE
     */
    public BigDecimal getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(BigDecimal state) {
        this.state = state;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return INVALIDDATE
     */
    public Date getInvaliddate() {
        return invaliddate;
    }

    /**
     * @param invaliddate
     */
    public void setInvaliddate(Date invaliddate) {
        this.invaliddate = invaliddate;
    }

    /**
     * @return EEGDATE
     */
    public Date getEegdate() {
        return eegdate;
    }

    /**
     * @param eegdate
     */
    public void setEegdate(Date eegdate) {
        this.eegdate = eegdate;
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return MNEMONICS
     */
    public String getMnemonics() {
        return mnemonics;
    }

    /**
     * @param mnemonics
     */
    public void setMnemonics(String mnemonics) {
        this.mnemonics = mnemonics;
    }

    /**
     * @return HEALTHTYPE
     */
    public String getHealthtype() {
        return healthtype;
    }

    /**
     * @param healthtype
     */
    public void setHealthtype(String healthtype) {
        this.healthtype = healthtype;
    }

    /**
     * @return ISEXPERT
     */
    public String getIsexpert() {
        return isexpert;
    }

    /**
     * @param isexpert
     */
    public void setIsexpert(String isexpert) {
        this.isexpert = isexpert;
    }

    /**
     * @return SECGROUP
     */
    public String getSecgroup() {
        return secgroup;
    }

    /**
     * @param secgroup
     */
    public void setSecgroup(String secgroup) {
        this.secgroup = secgroup;
    }

    /**
     * @return CERTIFICATE
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * @param certificate
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * @return ISDRUGRIGHT
     */
    public String getIsdrugright() {
        return isdrugright;
    }

    /**
     * @param isdrugright
     */
    public void setIsdrugright(String isdrugright) {
        this.isdrugright = isdrugright;
    }

    /**
     * @return PNUMBER
     */
    public BigDecimal getPnumber() {
        return pnumber;
    }

    /**
     * @param pnumber
     */
    public void setPnumber(BigDecimal pnumber) {
        this.pnumber = pnumber;
    }

    /**
     * @return ENAME
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * @return FNAME
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return COMPANY
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return POSITION
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return DLEADER
     */
    public String getDleader() {
        return dleader;
    }

    /**
     * @param dleader
     */
    public void setDleader(String dleader) {
        this.dleader = dleader;
    }

    /**
     * @return CELLPHONE
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return LANDLINE
     */
    public String getLandline() {
        return landline;
    }

    /**
     * @param landline
     */
    public void setLandline(String landline) {
        this.landline = landline;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATEDATE
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * @return PASSWORDDATE
     */
    public Date getPassworddate() {
        return passworddate;
    }

    /**
     * @param passworddate
     */
    public void setPassworddate(Date passworddate) {
        this.passworddate = passworddate;
    }

    /**
     * @return SYNCFLAG
     */
    public String getSyncflag() {
        return syncflag;
    }

    /**
     * @param syncflag
     */
    public void setSyncflag(String syncflag) {
        this.syncflag = syncflag;
    }
}