/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.model.tables.pojos;


import java.io.Serializable;

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
public class OauthRefreshToken implements Serializable {

    private static final long serialVersionUID = 938151393;

    private String tokenId;
    private byte[] token;
    private byte[] authentication;

    public OauthRefreshToken() {}

    public OauthRefreshToken(OauthRefreshToken value) {
        this.tokenId = value.tokenId;
        this.token = value.token;
        this.authentication = value.authentication;
    }

    public OauthRefreshToken(
        String tokenId,
        byte[] token,
        byte[] authentication
    ) {
        this.tokenId = tokenId;
        this.token = token;
        this.authentication = authentication;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public byte[] getToken() {
        return this.token;
    }

    public void setToken(byte... token) {
        this.token = token;
    }

    public byte[] getAuthentication() {
        return this.authentication;
    }

    public void setAuthentication(byte... authentication) {
        this.authentication = authentication;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OauthRefreshToken (");

        sb.append(tokenId);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
