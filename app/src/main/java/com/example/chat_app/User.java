package com.example.chat_app;

public class User {
    private String Username;
    private String email;
    private String profilePicture;

    public User(){

    }

    public User(String username, String email, String profilePicture) {
        Username = username;
        this.email = email;
        this.profilePicture = profilePicture;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
