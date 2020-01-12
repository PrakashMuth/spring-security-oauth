/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.model.tables;


import com.springsecurityoauth2.model.Indexes;
import com.springsecurityoauth2.model.Keys;
import com.springsecurityoauth2.model.Public;
import com.springsecurityoauth2.model.tables.records.RolePermissionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class RolePermission extends TableImpl<RolePermissionRecord> {

    private static final long serialVersionUID = 1119088570;

    /**
     * The reference instance of <code>public.role_permission</code>
     */
    public static final RolePermission ROLE_PERMISSION = new RolePermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolePermissionRecord> getRecordType() {
        return RolePermissionRecord.class;
    }

    /**
     * The column <code>public.role_permission.role_id</code>.
     */
    public final TableField<RolePermissionRecord, Integer> ROLE_ID = createField(DSL.name("role_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.role_permission.permission_id</code>.
     */
    public final TableField<RolePermissionRecord, Integer> PERMISSION_ID = createField(DSL.name("permission_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.role_permission</code> table reference
     */
    public RolePermission() {
        this(DSL.name("role_permission"), null);
    }

    /**
     * Create an aliased <code>public.role_permission</code> table reference
     */
    public RolePermission(String alias) {
        this(DSL.name(alias), ROLE_PERMISSION);
    }

    /**
     * Create an aliased <code>public.role_permission</code> table reference
     */
    public RolePermission(Name alias) {
        this(alias, ROLE_PERMISSION);
    }

    private RolePermission(Name alias, Table<RolePermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private RolePermission(Name alias, Table<RolePermissionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RolePermission(Table<O> child, ForeignKey<O, RolePermissionRecord> key) {
        super(child, key, ROLE_PERMISSION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ROLE_PERMISSION_PKEY);
    }

    @Override
    public UniqueKey<RolePermissionRecord> getPrimaryKey() {
        return Keys.ROLE_PERMISSION_PKEY;
    }

    @Override
    public List<UniqueKey<RolePermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<RolePermissionRecord>>asList(Keys.ROLE_PERMISSION_PKEY);
    }

    @Override
    public List<ForeignKey<RolePermissionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RolePermissionRecord, ?>>asList(Keys.ROLE_PERMISSION__ROLE_ID_FK, Keys.ROLE_PERMISSION__PERMISSION_ID_FK);
    }

    public Role role() {
        return new Role(this, Keys.ROLE_PERMISSION__ROLE_ID_FK);
    }

    public Permission permission() {
        return new Permission(this, Keys.ROLE_PERMISSION__PERMISSION_ID_FK);
    }

    @Override
    public RolePermission as(String alias) {
        return new RolePermission(DSL.name(alias), this);
    }

    @Override
    public RolePermission as(Name alias) {
        return new RolePermission(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RolePermission rename(String name) {
        return new RolePermission(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RolePermission rename(Name name) {
        return new RolePermission(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
