package com.morasoftware.domain;

public class User {

    private int userId;
    private String coverUrl;
    private String fullName;
    private String description;
    private int followers;
    private String email;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
