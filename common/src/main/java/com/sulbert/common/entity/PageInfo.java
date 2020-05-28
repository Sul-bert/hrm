package com.sulbert.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Sulbert
 * Date: 2020/5/18
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageInfo<T> {
    private long total;
    private List<T> rows;
}