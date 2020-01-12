/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.model.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.processing.Generated;


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
public class OauthApprovals implements Serializable {

    private static final long serialVersionUID = -825437376;

    private String    userid;
    private String    clientid;
    private String    scope;
    private String    status;
    private Timestamp expiresat;
    private Timestamp lastmodifiedat;

    public OauthApprovals() {}

    public OauthApprovals(OauthApprovals value) {
        this.userid = value.userid;
        this.clientid = value.clientid;
        this.scope = value.scope;
        this.status = value.status;
        this.expiresat = value.expiresat;
        this.lastmodifiedat = value.lastmodifiedat;
    }

    public OauthApprovals(
        String    userid,
        String    clientid,
        String    scope,
        String    status,
        Timestamp expiresat,
        Timestamp lastmodifiedat
    ) {
        this.userid = userid;
        this.clientid = clientid;
        this.scope = scope;
        this.status = status;
        this.expiresat = expiresat;
        this.lastmodifiedat = lastmodifiedat;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getClientid() {
        return this.clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getExpiresat() {
        return this.expiresat;
    }

    public void setExpiresat(Timestamp expiresat) {
        this.expiresat = expiresat;
    }

    public Timestamp getLastmodifiedat() {
        return this.lastmodifiedat;
    }

    public void setLastmodifiedat(Timestamp lastmodifiedat) {
        this.lastmodifiedat = lastmodifiedat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OauthApprovals (");

        sb.append(userid);
        sb.append(", ").append(clientid);
        sb.append(", ").append(scope);
        sb.append(", ").append(status);
        sb.append(", ").append(expiresat);
        sb.append(", ").append(lastmodifiedat);

        sb.append(")");
        return sb.toString();
    }
}
