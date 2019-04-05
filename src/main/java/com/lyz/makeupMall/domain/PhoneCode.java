package com.lyz.makeupMall.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "phonecode")
public class PhoneCode implements Serializable {
    @Column(name = "phonecode_id")
    private Integer phoneCodeId;

    @Column(name = "phonecode_phone")
    private String phoneCodePhone;

    @Column(name = "phonecode_code")
    private String phoneCodeCode;

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
     * @return phonecode_phone
     */
    public String getPhoneCodePhone() {
        return phoneCodePhone;
    }

    /**
     * @param phoneCodePhone
     */
    public void setPhoneCodePhone(String phoneCodePhone) {
        this.phoneCodePhone = phoneCodePhone;
    }

    /**
     * @return phonecode_code
     */
    public String getPhoneCodeCode() {
        return phoneCodeCode;
    }

    /**
     * @param phonecodeCode
     */
    public void setPhoneCodeCode(String phonecodeCode) {
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