package com.accountingapi.security.payload;

import com.accountingapi.security.model.User;

public class JwtAuthenticationResponse {
    private String accessToken;
    private String tokenType = "Bearer";
    private User user;

    public JwtAuthenticationResponse(String accessToken,User user) {
        this.accessToken = accessToken;
        this.user=user;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}