package com.sulbert.company.service;

import com.sulbert.company.entity.BaseEntity;

import java.util.List;
import java.util.Map;

public interface BaseService<T extends BaseEntity> {
    T get(String id);

    int save(T t);

    int batchSave(List<T> t);

    int update(T t);

    int delete(T t);

    List<T> list(Map<String, Object> params);

    long count(Map<String, Object> params);

    void batchDelete(List<String> ids);
}
