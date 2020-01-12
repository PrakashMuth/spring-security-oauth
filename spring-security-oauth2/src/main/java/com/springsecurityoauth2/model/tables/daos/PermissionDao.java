/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.model.tables.daos;


import com.springsecurityoauth2.model.tables.Permission;
import com.springsecurityoauth2.model.tables.records.PermissionRecord;

import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionDao extends DAOImpl<PermissionRecord, com.springsecurityoauth2.model.tables.pojos.Permission, Integer> {

    /**
     * Create a new PermissionDao without any configuration
     */
    public PermissionDao() {
        super(Permission.PERMISSION, com.springsecurityoauth2.model.tables.pojos.Permission.class);
    }

    /**
     * Create a new PermissionDao with an attached configuration
     */
    public PermissionDao(Configuration configuration) {
        super(Permission.PERMISSION, com.springsecurityoauth2.model.tables.pojos.Permission.class, configuration);
    }

    @Override
    public Integer getId(com.springsecurityoauth2.model.tables.pojos.Permission object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.springsecurityoauth2.model.tables.pojos.Permission> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Permission.PERMISSION.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.springsecurityoauth2.model.tables.pojos.Permission> fetchById(Integer... values) {
        return fetch(Permission.PERMISSION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.springsecurityoauth2.model.tables.pojos.Permission fetchOneById(Integer value) {
        return fetchOne(Permission.PERMISSION.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.springsecurityoauth2.model.tables.pojos.Permission> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Permission.PERMISSION.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.springsecurityoauth2.model.tables.pojos.Permission> fetchByName(String... values) {
        return fetch(Permission.PERMISSION.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public com.springsecurityoauth2.model.tables.pojos.Permission fetchOneByName(String value) {
        return fetchOne(Permission.PERMISSION.NAME, value);
    }
}
