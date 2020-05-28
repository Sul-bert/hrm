package com.sulbert.company.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Author: Sulbert
 * Date: 2020/5/18
 */
@Data
public class Company extends BaseEntity {
    private String id;
    private String name;
    private String managerId; //企业登录账号id
    private String version; // 当前版本
    private Date renewalDate; //续期时间
    private Date expirationDate; //到期时间
    private String companyArea;
    private String companyAddress;
    private String businessLicenseId; //营业执照-图片Id
    private String legalRepresentative; //法人代表
    private String companyPhone;
    private String mailbox;
    private String companySize;
    private String industry; //所属行业
    private String remarks;
    private String auditState; //审核状态
    private Integer state;
    private Double balance;

}