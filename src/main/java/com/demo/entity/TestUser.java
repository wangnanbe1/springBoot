package com.demo.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "TEST_USER")
public class TestUser {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOGIN_TIME")
    private Date loginTime;

    @Column(name = "PW")
    private String pw;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
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
     * @return LOGIN_TIME
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return PW
     */
    public String getPw() {
        return pw;
    }

    /**
     * @param pw
     */
    public void setPw(String pw) {
        this.pw = pw;
    }
}