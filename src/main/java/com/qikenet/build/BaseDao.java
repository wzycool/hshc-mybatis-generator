package com.qikenet.build;

import java.util.List;

/**
 * @Author: zhengyi.wang
 * @Date: 2018/8/6/006 10:30
 */
public interface BaseDao<T> {
    List<T> getList(T model);

    T getOne(Long id);

    int insert(T model);

    int update(T model);

    int delete(T model);
}
