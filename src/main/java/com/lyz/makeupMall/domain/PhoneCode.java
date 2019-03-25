package com.lyz.makeupMall.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "phonecode")
public class PhoneCode implements Serializable {
    @Column(name = "phonecode_id")
    private Integer phoneCodeId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "phonecode_code")
    private Integer phoneCodeCode;

    @Column(name = "phonecode_time")
    private Long phoneCodeTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return phonecode_id
     */
    public Integer getPhoneCodeId() {
        return phoneCodeId;
    }

    /**
     * @param phonecodeId
     */
    public void setPhoneCodeId(Integer phoneCodeId) {
        this.phoneCodeId = phoneCodeId;
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
     * @return phonecode_str
     */
    public Integer getPhoneCodeCode() {
        return phoneCodeCode;
    }

    /**
     * @param phonecodeCode
     */
    public void setPhoneCodeCode(Integer phonecodeCode) {
        this.phoneCodeCode = phonecodeCode;
    }

    /**
     * @return phonecode_time
     */
    public Long getPhoneCodeTime() {
        return phoneCodeTime;
    }

    /**
     * @param phonecodeTime
     */
    public void setPhoneCodeTime(Long phoneCodeTime) {
        this.phoneCodeTime = phoneCodeTime;
    }

}