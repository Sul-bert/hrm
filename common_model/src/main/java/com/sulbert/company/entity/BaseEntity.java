package com.sulbert.company.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Author: Sulbert
 * Date: 2020/5/28
 * Description:
 */
@Data
public class BaseEntity implements Serializable {

    String id;
    boolean deleted;
    Date createDate;




}