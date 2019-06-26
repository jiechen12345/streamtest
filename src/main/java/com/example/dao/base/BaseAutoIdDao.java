package com.example.dao.base;

import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author leo
 */
@NoRepositoryBean
public interface BaseAutoIdDao<T> extends BaseDao<T, Long> {
}
