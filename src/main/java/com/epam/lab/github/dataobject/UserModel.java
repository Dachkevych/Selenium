package com.epam.lab.github.dataobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserModel {

    private String login;
    private String password;

    public UserModel(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserModel() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
