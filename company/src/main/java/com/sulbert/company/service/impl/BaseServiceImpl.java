package com.sulbert.company.service.impl;

import com.sulbert.common.utils.IdWorker;
import com.sulbert.company.entity.BaseEntity;
import com.sulbert.company.mapper.BaseMapper;
import com.sulbert.company.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Author: Sulbert
 * Date: 2020/6/5
 * Description:
 */
public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

    abstract BaseMapper<T> getMapper();

    @Autowired
    private IdWorker idWorker;

    @Override
    public void save(T t) {
        if(t.getId() == null || t.getId().equals("")) t.setId(""+ idWorker.nextId());
        t.setCreateDate(new Date());
        getMapper().insert(t);
    }

    @Override
    public void deleteById(String id) {
        getMapper().deleteById(id);
    }

    @Override
    public void updateById(T t) {
        getMapper().updateById(t);
    }

    @Override
    public T get(String id) {
        return getMapper().get(id);
    }
}