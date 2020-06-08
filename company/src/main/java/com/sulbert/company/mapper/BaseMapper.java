package com.sulbert.company.mapper;

import com.sulbert.company.entity.BaseEntity;

/**
 * Author: Sulbert
 * Date: 2020/6/5
 * Description:
 */
public interface BaseMapper<T extends BaseEntity> {

    void insert(T t);

    void deleteById(String id);

    void updateById(T t);

    T selectById(String id);
}