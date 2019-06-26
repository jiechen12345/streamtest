package com.example.dao.base;

import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author leo
 */
@NoRepositoryBean
public interface BaseStringIdDao<T> extends BaseDao<T, String> {
}
