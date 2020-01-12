/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.model.tables.records;


import com.springsecurityoauth2.model.tables.Permission;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PermissionRecord extends UpdatableRecordImpl<PermissionRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 2046961415;

    /**
     * Setter for <code>public.permission.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.permission.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.permission.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.permission.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Permission.PERMISSION.ID;
    }

    @Override
    public Field<String> field2() {
        return Permission.PERMISSION.NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public PermissionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PermissionRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public PermissionRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PermissionRecord
     */
    public PermissionRecord() {
        super(Permission.PERMISSION);
    }

    /**
     * Create a detached, initialised PermissionRecord
     */
    public PermissionRecord(Integer id, String name) {
        super(Permission.PERMISSION);

        set(0, id);
        set(1, name);
    }
}