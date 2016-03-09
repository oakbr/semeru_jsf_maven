package com.oak.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

public interface InterfaceDAO<T> {
    public void save(T entity);
    public void update(T entity);
    public void remove(T entity);
    public void merge(T entity);
    T getEntity(Serializable id);
    T getEtityByDetachedCriteria(DetachedCriteria criteria);
    List<T> getEntities();
    List<T> getListByDetachedCriteria(DetachedCriteria criteria);
}
