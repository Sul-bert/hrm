package com.sulbert.company.service.impl;

import com.sulbert.company.entity.BaseEntity;
import com.sulbert.company.mapper.BaseMapper;
import com.sulbert.company.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: Sulbert
 * Date: 2020/5/28
 * Description:
 */
public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

    abstract BaseMapper<T> getMapper();

    @Override
    public T get(String id) {
        return getMapper().selectByPrimaryKey(id);
    }


}