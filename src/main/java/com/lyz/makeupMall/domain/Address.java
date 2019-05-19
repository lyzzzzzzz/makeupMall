package com.lyz.makeupMall.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "address")
public class Address implements Serializable {
    @Id
    @Column(name = "addr_id")
    private Integer addrId;

    @Column(name = "addrDetail")
    private String addrdetail;

    private String phone;

    private String name;

    private static final long serialVersionUID = 1L;

    /**
     * @return addr_id
     */
    public Integer getAddrId() {
        return addrId;
    }

    /**
     * @param addrId
     */
    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    /**
     * @return addrDetail
     */
    public String getAddrdetail() {
        return addrdetail;
    }

    /**
     * @param addrdetail
     */
    public void setAddrdetail(String addrdetail) {
        this.addrdetail = addrdetail == null ? null : addrdetail.trim();
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}