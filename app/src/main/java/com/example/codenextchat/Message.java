package com.example.codenextchat;

public class Message {
    String name; //username for the authenticated user
    String text; //the text of the message being sent
    String profilePic; //profile pic of the authenticated user

    public Message() {

    }

    public Message(String name, String text, String profilePic) {
        this.name = name;
        this.text = text;
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}