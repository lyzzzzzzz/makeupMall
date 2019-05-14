package com.lyz.makeupMall.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user")
public class User implements Serializable {
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_loginpwd")
    private String userLoginpwd;

    @Column(name = "user_paypwd")
    private String userPaypwd;

    @Column(name = "user_address")
    private String userAddress;
    
    @Column(name = "user_name")
    private String userName;

    private static final long serialVersionUID = 1L;

    
    
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_phone
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * @return user_loginpwd
     */
    public String getUserLoginpwd() {
        return userLoginpwd;
    }

    /**
     * @param userLoginpwd
     */
    public void setUserLoginpwd(String userLoginpwd) {
        this.userLoginpwd = userLoginpwd == null ? null : userLoginpwd.trim();
    }

    /**
     * @return user_paypwd
     */
    public String getUserPaypwd() {
        return userPaypwd;
    }

    /**
     * @param userPaypwd
     */
    public void setUserPaypwd(String userPaypwd) {
        this.userPaypwd = userPaypwd == null ? null : userPaypwd.trim();
    }

    /**
     * @return user_address
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * @param userAddress
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPhone=" + userPhone + ", userLoginpwd=" + userLoginpwd
				+ ", userPaypwd=" + userPaypwd + ", userAddress=" + userAddress + "]";
	}
    
    
}