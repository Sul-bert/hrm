package com.sulbert.company.mapper;

import com.sulbert.company.entity.BaseEntity;

import java.util.List;
import java.util.Map;

/**
 * Author: Sulbert
 * Date: 2020/5/28
 * Description:
 */
public interface BaseMapper<T extends BaseEntity>  {

    int insert(T t);

    int deleteByPrimaryKey(String id);

    int updateByPrimaryKey(T t);

    T selectByPrimaryKey(String id);

    Long count(Map<String, Object> params);

    void batchDelete(Map<String, Object> params);

    List<T> list(Map<String, Object> params);
}